import firebase from 'react-native-firebase';

import store from '../../redux/store';

import * as utils from '../myutils';
import * as constants from '../constants';
import * as actions from '../../actions';
import eventHandler from './firebaseEventHandler';

export const _getCurrentUser = async () => {
  return new Promise((res, rej) => {

    const unsubscribe = firebase.auth().onAuthStateChanged((user) => {

      if (unsubscribe) unsubscribe();
      res(user);

    });

  });

}

export const _initializePushNotification = async () => {

  const unsubscribe = firebase.auth().onAuthStateChanged((user) => {
    
    if(!user){
      if(unsubscribe) unsubscribe();
      return;
    }
    
    const setupToken = async () => {

      const FCM = firebase.messaging();
      const ref = firebase.firestore().collection("users");

      // gets the device's push token
      const token = await FCM.getToken();
      await ref.doc(user.uid).set({ pushToken: token });

      // update database with new push token

      // get history first to fetch all chats
      const history = await firebase.database()
                        .ref('/history/' + user.uid)
                        .once('value');

      const chats = history ? history.val().chats : null;

      // update chats
      if(chats){

        const chatIds = Object.keys(chats);

        for(const i = 0 ; i < chatIds.length ; i++){
          const chatId = chatIds[i];
          const chatRef = firebase.database().ref("/chat/" + chatId + "/notificationTokens/" + user.uid);
          await chatRef.update({
              enabled: true,
              pushToken: token,
              userId: user.uid
          });
        }

      }

      if (unsubscribe) unsubscribe();

    };

    (async () => {

      const enabled = await firebase.messaging().hasPermission();
      if (enabled) {
        await setupToken();
      } else {

        await firebase.messaging().requestPermission();
        await setupToken();

      }

    })();

  });

}

export const _androidVerifySMS = async () => {

  return new Promise((res, rej) => {

    const unsubscribe = firebase.auth().onAuthStateChanged((user) => {

      console.log("android auth state changed",user);

      if (user) {
        if (unsubscribe) unsubscribe();
        res(user);
      }

    });

    setTimeout(() => {
      if (unsubscribe) unsubscribe();
      res(null);
    }, 60000)

  });
}

export const _sendVerifycationCode = async (phoneNumber) => {
  return await firebase.auth().signInWithPhoneNumber(phoneNumber);
}

export const _verifyAuthCode = async (code, resolver) => {
  return await resolver.confirm(code);
}

export const _signOut = async (c) => {
  eventHandler.signOut();
  return await firebase.auth().signOut();
}

export const _uploadFile = async (path, uploadPath) => {
  const user = firebase.auth().currentUser;
  const uploadResult = await firebase.storage().ref(uploadPath).putFile(path);
  return uploadResult.downloadURL;
}

export const _createDefaultUserIfNotExists = async (data) => {

  const collection = firebase.firestore().collection('profiles');
  const querySnapshot = await collection.where("userId", "=", data.uid).get();

  if (querySnapshot.size == 0) {

    // create default user data
    const defaultData = {
      userId: data.uid,
      countryCode: data.countryCode,
      telephoneNumber: data.telephoneNumber,
      createdAt: utils.now(),
      displayName: constants.defaultUserName
    };

    await collection.add(defaultData);

    return defaultData;

  } else {

    return querySnapshot.docs[0].data();

  }

}

export const _saveUserProfile = async (id, dataToSave) => {

  if (!dataToSave)
    throw "Cannot save null"

  const collection = firebase.firestore().collection('profiles');
  const querySnapshot = await collection.where("userId", "=", id).get();

  if (querySnapshot.size == 0) {

    throw "No User Found"

  } else {

    const doc = querySnapshot.docs[0].ref;
    return await doc.set(dataToSave, { merge: true });

  }

}

export const _searchUserByNumber = async (number) => {

  const collection = firebase.firestore().collection('profiles');
  const querySnapshot = await collection.where("telephoneNumber", "=", number).get();

  if (querySnapshot.size == 0) {

    return -1;

  } else {

    return querySnapshot.docs[0].data();

  }

}

export const _addUserToContact = async (currentUserId, userData) => {

  const collection = firebase.firestore().collection('contacts');
  const querySnapshot = await collection.where("userId", "=", currentUserId).get();

  if (querySnapshot.size == 0) {

    // save new contact data
    // create default user data
    const defaultData = {
      userId: currentUserId,
      createdAt: utils.now(),
      updatedAt: utils.now(),
      contacts: [
        userData.userId
      ]
    };

    return await collection.add(defaultData);

  } else {

    const data = querySnapshot.docs[0].data()
    const doc = querySnapshot.docs[0].ref;

    const exist = data.contacts.filter((row) => {
      return row == userData.userId
    });

    if (exist && exist.length > 0)
      return;

    data.contacts.push(userData.userId);

    return await doc.set({
      contacts: data.contacts,
      updatedAt: utils.now()
    }, { merge: true });

  }

}

export const _deleteUserFromContact = async (currentUserId, deleteUserId) => {

  const collection = firebase.firestore().collection('contacts');
  const querySnapshot = await collection.where("userId", "=", currentUserId).get();
  if (querySnapshot.size == 0) {

    return null;

  } else {

    const data = querySnapshot.docs[0].data()
    const doc = querySnapshot.docs[0].ref;

    data.contacts = data.contacts.filter((row) => {

      if (!row)
        return false;

      return row != deleteUserId;

    });

    return await doc.set({
      contacts: data.contacts,
      updatedAt: utils.now()
    }, { merge: true });

  }

}

export const _getContact = async (currentUserId) => {

  const collection = firebase.firestore().collection('contacts');
  const querySnapshot = await collection.where("userId", "=", currentUserId).get();

  if (querySnapshot.size == 0) {

    return null;

  } else {

    const data = querySnapshot.docs[0].data();
    return data.contacts;

  }

}

export const _getUserProfile = async (userId, useCache) => {

  const collection = firebase.firestore().collection('profiles');
  const querySnapshot = await collection.where("userId", "=", userId).get();

  if (querySnapshot.size == 0) {

    return null;

  } else {

    const result = querySnapshot.docs[0].data();
    return result;

  }

}

export const _getUserProfileCache = async (userId, useCache) => {

  const storageKey = constants.storageKeyUserProfileCache + userId;

  const cache = await utils.storageGetItem(storageKey);

  if (cache)
    return cache;

  const collection = firebase.firestore().collection('profiles');
  const querySnapshot = await collection.where("userId", "=", userId).get();

  if (querySnapshot.size == 0) {

    return null;

  } else {

    const result = querySnapshot.docs[0].data();
    utils.storageSaveItem(storageKey, result);

    return result;

  }

}

export const _startChatWithUser = async (user) => {

  // 1.check chat exists in 
  // 2.create if not
  // 3.notify user chatid 
  // 4.the user will ne

  const userId = user.userId;
  const state = store.getState();

  // get chat by user ids from history
  const chat = getChatByUsers([user, state.auth.currentUser]);
  let chatRef = null;
  let chatId = null;

  if (!chat) {

    const chatKey = utils.getRandomString();
    chatRef = firebase.database().ref("/chat/" + chatKey);

    const users = [];
    users.push(state.auth.currentUser);
    users.push(user);

    // get push notification tokens
    const notificationTokens = {};
    
    const docRef = firebase.firestore().collection('users').doc(state.auth.currentUser.userId);
    if(docRef){
      const docSnapshot = await docRef.get();
      if(docSnapshot) {
        const pushTokenObj = docSnapshot.data();

        if(pushTokenObj)
          notificationTokens[state.auth.currentUser.userId] = {
            pushToken : pushTokenObj.pushToken,
            userId: state.auth.currentUser.userId,
            enabled: true
          };
      }
    }

    const docRef2 = firebase.firestore().collection('users').doc(user.userId);
    if(docRef2){
      const docSnapshot = await docRef2.get();
      if(docSnapshot) {
        const pushTokenObj = docSnapshot.data();

        if(pushTokenObj)
          notificationTokens[userId] = {
            pushToken : pushTokenObj.pushToken,
            userId: user.userId,
            enabled: true
          };

      }
    }

    await chatRef.set({
      chatId: chatKey,
      users: users.map(user => user.userId), // save only userid,
      created: utils.now(),
      messages: [],
      notificationTokens: notificationTokens,
      lastUpdate: null,
      lastMessage: null
    });

    const defaultChatObjInHistory = {
      chatId: chatKey,
      users: users.map(user => user.userId), // save only userid
      created: utils.now(),
      lastUpdate: null,
      lastMessage: null
    };

    // insert to my history
    const myHistoryRef = firebase.database().ref("history/" + state.auth.currentUser.userId + "/chats/" + chatKey);
    const friendHistoryRef = firebase.database().ref("history/" + userId + "/chats/" + chatKey);

    myHistoryRef.once('value', (data) => {

      const value = data.val();
      if (!value) {
        myHistoryRef.set(defaultChatObjInHistory);
      }

    });

    friendHistoryRef.once('value', (data) => {

      const value = data.val();
      if (!value) {
        friendHistoryRef.set(defaultChatObjInHistory);
      }

    });

    chatId = chatKey;

  } else {

    chatId = chat.chatId;

  }

  return chatId;

}

export const _sendMessage = async (chatId, message) => {

  message.createdAt = firebase.database.ServerValue.TIMESTAMP;
  const messageRef = firebase.database().ref("/chat/" + chatId + "/messages/" + message._id);

  let writeOnce = true;
  messageRef.on('value', async (data) => {

    const val = data.val();

    if (val)
      return;

    if (writeOnce) {
      writeOnce = false;
      await messageRef.set(message);
    }

    messageRef.off();

  });

}

export const _updateHistoryByMessage = (message) => {

}

// local functions
getChatByUsers = (users) => {

  const state = store.getState();
  const history = state.chat.history;

  if (!history)
    return false;

  const chats = Object.keys(history).map((key) => { return history[key] });

  const chat = chats.find((chat) => {

    const condition1 = chat.users.length == users.length;

    let condition2 = true;

    users.forEach((user1) => {

      let found = false;

      chat.users.forEach((user2) => {

        if (user1.userId == user2.userId)
          found = true;

      });

      condition2 = condition2 & found;

    });

    return condition1 && condition2;

  });

  return chat;

}

export const _createNewConversation = async ({name,pic,users}) => {

  const state = store.getState();
  const ownerUser = state.auth.currentUser;

  const chatKey = utils.getRandomString();
  chatRef = firebase.database().ref("/chat/" + chatKey);

  users.push(state.auth.currentUser);

  // get push notification tokens
  const notificationTokens = {};
  
  for(let i = 0 ; i < users.length ; i++){

    const user = users[i];
    const docRef = firebase.firestore().collection('users').doc(user.userId);

    if(docRef){
      const docSnapshot = await docRef.get();

      if(docSnapshot) {
        
        const pushTokenObj = docSnapshot.data();
        
        if(pushTokenObj)
          notificationTokens[user.userId] = {
            pushToken : pushTokenObj.pushToken,
            userId: state.auth.currentUser.userId,
            enabled: true
          };

      }
    } 
  }

  // upload picture
  let photoUrl = null;

  if(pic){
    photoUrl = await _uploadFile(pic.path,`/avatar/${chatKey}${utils.now()}.jpg`);
  }

  await chatRef.set({
    chatId: chatKey,
    users: users.map(user => user.userId), 
    created: utils.now(),
    messages: [],
    notificationTokens: notificationTokens,
    lastUpdate: null,
    lastMessage: null,
    ownwerUser:ownerUser.userId,
    title:name,
    photoUrl:photoUrl
  });

  const defaultChatObjInHistory = {
    chatId: chatKey,
    users: users.map(user => user.userId), // save only userid
    created: utils.now(),
    lastUpdate: null,
    lastMessage: null,
    title:name,
    photoUrl:photoUrl
  };

  // save to history

  for(let i = 0 ; i < users.length ; i++){

    const user = users[i];
    const docRef = firebase.database().ref("history/" + user.userId + "/chats/" + chatKey);
  
    docRef.once('value', (data) => {
      const value = data.val();
      if (!value) {
        docRef.set(defaultChatObjInHistory);
      }
    });

  }

  return chatKey;

}

export const _saveName = async (userId,name) => {

  if (!name || !userId)
    throw "Failed to save"

  const collection = firebase.firestore().collection('profiles');
  const querySnapshot = await collection.where("userId", "=", userId).get();

  if (querySnapshot.size == 0) {

    throw "No User Found"

  } else {

    const doc = querySnapshot.docs[0].ref;
    return await doc.set({
      displayName:name
    }, { merge: true });

  }

}