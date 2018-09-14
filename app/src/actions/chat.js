import * as types from './types';
import * as utils from '../lib/myutils';
import ImageResizer from 'react-native-image-resizer';

import {
    uploadFile
} from '../lib/backend';

import {
    sendMessage as _b_sendMessage,
    updateMessage
} from '../lib/backend';

import ProfilePool from "../lib/ProfilePool";
import consts from "../lib/constants";

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

        message.state = constant.messageStateSaved;

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

export function sendPicture(pic,temporaryMessage){

    return async (dispatch, getState) => {

        dispatch({
            type: types.ChatSendTemporaryMessage,
            temporaryMessage
        });

        const originalFilePath = pic.path;
        
        const imageResizeResult = await ImageResizer.createResizedImage(
            pic.path, 
            consts.cacheImageSize, 
            consts.cacheImageSize, 
            'JPEG', 
            80, 
            0);
        
        const thumbnailFilePath = imageResizeResult.path;
        
        // upload thumbnail
        const thumbnailUrl = await uploadFile(thumbnailFilePath, `/avatar/${temporaryMessage._id}_thumb.jpg`);

        if(!temporaryMessage.attachment)
            temporaryMessage.attachment = {};

        temporaryMessage.attachment.thumbnailUrl = thumbnailUrl;
        temporaryMessage.state = constant.messageStateSaved;

        // send message
        const chatId = getState().chat.currentChatId;

        await _b_sendMessage(chatId, temporaryMessage);

        // send message with thumbnail first
        dispatch({
            type: types.ChatSendMessage,
            message:temporaryMessage
        });

        console.log('uploading pic');

        // upload real pic
        const picUrl = await uploadFile(originalFilePath, `/avatar/${temporaryMessage._id}.jpg`);
        temporaryMessage.attachment.pictureUrl = picUrl;

        console.log('uploading pic done');

        await updateMessage(chatId, temporaryMessage);

        console.log('update message done');

        // done sending pic
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


