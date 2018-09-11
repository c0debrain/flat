import firebase from 'react-native-firebase';

import * as actions from '../../actions'
import * as adapter from './firebase'
import * as utils from '../myutils';

import ProfilePool from '../../lib/ProfilePool'

// event handler calls action from online events
// messege received
// history updated
// message modified
// message deleted

class eventHandler {

    constructor() {
        this.store = null;
        this.user = null;
        this.historyrRef = null;
        this.historyKey = null;
        this.chatRefs = {};
    }

    setStore = (store) => {
        this.store = store;
    }

    generateInitialHisotryData = async () => {

        const defaultStructure = {
            userId: this.user.userId,
            chats: {},
            lastUpdate: 0
        }

        if (!this.historyrRef)
            return;

        await this.historyrRef.set(defaultStructure);

    }

    setupChatListener = (chat) => {

        if (this.chatRefs[chat.chatId])
            return;

        const chatId = chat.chatId;
        
        this.chatRefs[chat.chatId] = firebase.database().ref("/chat/" + chat.chatId);
        this.chatRefs[chat.chatId].on('value', (data) => {

            const val = data.val();

            // get new message
            let newMessages = null;
            
            const messagesAry = val.messages ? Object.keys(val.messages).map(key => val.messages[key]) : [];

            // update history
            if (val && val.messages) {

                if (!this.store.getState().chat.allChat ||
                    !this.store.getState().chat.allChat[chat.chatId]) {

                    newMessages = messagesAry;

                } else {

                    const oldChat = this.store.getState().chat.allChat[chat.chatId];

                    const oldChatMessages = oldChat.messages ? Object.keys(oldChat.messages).map(key => oldChat.messages[key]) : [];

                    newMessages = messagesAry.filter((msg) => {

                        return !oldChatMessages.find((msgOld) => {
                            return msgOld._id == msg._id
                        });

                    });

                }

            }

            (async () => {

                const restructuredChat = val;

                // get friend user profile ( if private chat )
                if(restructuredChat.users.length == 2){
                    
                    const friendUserId = restructuredChat.users.find( userId => {
                        return userId != this.user.userId
                    });

                    const friend = await ProfilePool.get(friendUserId);

                    if(friend && !restructuredChat.title)
                        restructuredChat.title = friend.displayName;

                    if(friend && !restructuredChat.photoUrl)
                        restructuredChat.photoUrl = friend.photoUrl;

                }

                // update all chat
                this.store.dispatch(actions.chat.loadChat(restructuredChat));

                // update current chat
                this.store.dispatch(actions.chat.updateCurrentChat(restructuredChat));

                if(newMessages){

                    newMessages = newMessages.map( message => {
                        return {...message,chatId}
                    });
    
                    // everything other 
                    this.store.dispatch(actions.chat.newMessage(newMessages));
                    
                }

                // get new message

                // ignore initial load
                // update history
                if (newMessages && newMessages.length == 1) {

                    const msg = newMessages[0];

                    const historyRef = firebase.database().ref("/history/" + this.user.userId + "/chats/" + chat.chatId);

                    historyRef.update({
                        lastUpdate: msg.createdAt,
                        lastMessage: msg,
                    });

                }

            })();

        });

    }

    // this has to call after auth, store should contain user obj
    init = async () => {

        if (!this.store ||
            !this.store.getState() ||
            !this.store.getState().auth ||
            !this.store.getState().auth.currentUser) {

            throw "event handler should be initialized after auth";
        }

        this.user = this.store.getState().auth.currentUser;
        this.historyKey = '/history/' + this.user.userId;
        this.historyrRef = firebase.database().ref(this.historyKey);

        // create initial data if not exists
        this.historyrRef.on('value', (data) => {

            const history = data.val();

            if (!history) {
                return (async () => {
                    await this.generateInitialHisotryData();
                })();
            }

            this.store.dispatch(actions.history.updateHistory(history.chats ? history.chats : []));

            if (history.chats) {
                Object.keys(history.chats).map(key => {
                    const chat = history.chats[key];
                    this.setupChatListener(chat);
                });
            }

        });

        // setup push notification
        adapter._initializePushNotification();

    }

    signOut = () => {

        this.historyrRef.off();
        Object.keys(this.chatRefs).map(key => this.chatRefs[key]).map((ref) => {
            ref.off();
        });

    }

}

// its singleton
export default new eventHandler();
