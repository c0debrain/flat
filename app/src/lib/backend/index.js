import * as adapter from './firebase';

export const getCurrentUser = async () => {
    return await adapter._getCurrentUser();
}

// check the user exists in firestore, if not insert default data
export const checkInitialUser = async (user) => {

    const userProfile = await adapter._createDefaultUserIfNotExists({
        uid: user.uid,
        telephoneNumber: user.phoneNumber,
        countryCode: user.countryCode
    });

    return userProfile;
}

export const sendVerifycationCode = async (telnum) => {
    return await adapter._sendVerifycationCode(telnum);
}

export const androidVerifySMS = async () => {
    return await adapter._androidVerifySMS();
}

export const verifyAuthCode = async (code, resolver) => {
    return await adapter._verifyAuthCode(code, resolver);
}

export const signOut = async () => {
    return await adapter._signOut();
}

// returns download url
export const uploadFile = async (path, uploadPath) => {
    return await adapter._uploadFile(path, uploadPath);
}

export const saveUserProfile = async (userId, profile) => {
    return await adapter._saveUserProfile(userId, profile);
}

export const searchUserByNumber = async (number) => {
    return await adapter._searchUserByNumber(number);
}

export const addUserToContact = async (currentUserId, userData) => {
    return await adapter._addUserToContact(currentUserId, userData);
}

export const getContact = async (currentUserId) => {
    return await adapter._getContact(currentUserId);
}

export const deleteUserFromContact = async (currentUserId, deleteUserId) => {
    return await adapter._deleteUserFromContact(currentUserId, deleteUserId);
}

export const getUserProfile = async (userId, useCache) => {
    return await adapter._getUserProfile(userId, useCache);
}

export const startChatWithUser = async (user) => {
    return await adapter._startChatWithUser(user);
}

export const sendMessage = async (chatId, message) => {
    return await adapter._sendMessage(chatId, message);
}

export const updateHistoryByMessage = async (message) => {
    return await adapter._updateHistoryByMessage(message);
}

export const initializePushNotification = async () => {
    return await adapter._initializePushNotification();
}

export const createNewConversation = async (params) => {
    return await adapter._createNewConversation(params);
}

export const saveName = async (userId,name) => {
    return await adapter._saveName(userId,name);
}

export const updateMessage = async (chatId,msg) => {
    return await adapter._updateMessage(chatId,msg);
}