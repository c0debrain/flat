import * as types from './types';

import {
    updateHistoryByMessage as _b_updateHistoryByMessage
} from '../lib/backend';

import { l10n } from '../lib/lang';
import * as utils from '../lib/myutils';
import conts from '../lib/constants';

import ProfilePool from "../lib/ProfilePool";

export function updateHistory(list) {

    return async (dispatch, getState) => {

        try{

            if(!list){

                return dispatch({
                    type: types.UpdateHistory,
                    list: list
                });
    
            }
    
            // add user information
            let allUserIds = {};
    
            const ary = Object.keys(list).map(key => list[key]);
    
            ary.forEach( (obj) => {
    
                if(obj.users){
                    obj.users.map( userId => {
                        allUserIds[userId] = userId;
                    });
                }
    
            });
    
            allUserIds = Object.keys(allUserIds); // avoid duplicate 
    
            // get users
            const users = {};
            for( let i = 0 ; i < allUserIds.length ; i++){
                
                const fetchedUser =  await ProfilePool.get(allUserIds[i]);

                if(fetchedUser)
                    users[fetchedUser.userId] = fetchedUser;
            }
    
            const newList = {};
    
            ary.map( chat => {
    
                chat.users = chat.users.map( userId => {
                    return users[userId];
                });
    
                newList[chat.chatId] = chat;
                return chat;
    
            });
    
    
            dispatch({
                type: types.UpdateHistory,
                list: newList
            });

        } catch (e) {

            console.error(e);
            utils.showError(l10n('Failed to load history.'))

        }
        

    }


}

export function updateHistoryByMessage(message) {

    return async (dispatch, getState) => {

        await _b_updateHistoryByMessage(message);


    }

}

export function loadChatOpenLog(){

    return async (dispatch, getState) => {

        (async() => {

            const openChatLog = await utils.storageGetItem(conts.storageKeyChatOpenLog);

            if(openChatLog){

                dispatch({
                    type: types.LoadOpenChatLog,
                    openChatLog
                });

                
            }
            
        })();

    }

}