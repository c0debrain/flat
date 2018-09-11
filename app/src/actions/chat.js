import * as types from './types';

import {
    sendMessage as _b_sendMessage
} from '../lib/backend';

import ProfilePool from "../lib/ProfilePool";

export function loadChat(chat) {

    return async (dispatch, getState) => {

        // fill users with actual data here
        const users = [];
        
        if(chat.users){

            for(const i = 0; i < chat.users.length ; i++){

                const profile = await ProfilePool.get(chat.users[i]);
                users.push(profile);

            }
            
        }

        chat.users = users;

        dispatch({
            type: types.ChatLoad,
            chat
        });

    }

}


export function startChat(chatId) {

    return async (dispatch, getState) => {

        // get chat
        const chat = getState().chat.allChat[chatId];
        
        dispatch({
            type: types.ChatStart,
            chatId,
            chat
        });

    }
}

export function sendMessage(message) {

    return async (dispatch, getState) => {

        // save to db
        const chatId = getState().chat.currentChatId;

        await _b_sendMessage(chatId, message);

        dispatch({
            type: types.ChatSendMessage,
            message
        });

    }

}

export function newMessage(newMessages){

    return async (dispatch, getState) => {

        newMessages.forEach( message => {

            dispatch({
                type: types.ChatNewMessage,
                message
            });
    
            if(getState().chat.currentChatId == message.chatId){
    
                dispatch({
                    type: types.UpdateOpenLogsByMessage,
                    message
                });
    
            }

        });

    }

}

export function updateCurrentChat(chat) {

    return async (dispatch, getState) => {

        if(getState().chat.currentChatId != chat.chatId)
            return;

        const users = [];
        
        if(chat.users){

            for(const i = 0; i < chat.users.length ; i++){

                const profile = await ProfilePool.get(chat.users[i]);
                users.push(profile);

            }
            
        }

        chat.users = users;
        
        dispatch({
            type: types.ChatUpdateCurrent,
            chat
        });

    }

}

export function closeChat() {
    return {
        type: types.ChatClose
    }
}

export function setNewRoomModalVisible(visible) {
    
    return {
        type: types.SetNewRoomModalVisible,
        visible
    }
}


