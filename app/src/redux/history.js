import * as types from '../actions/types';
import { combineReducers } from "redux";

import * as utils from '../lib/myutils';
import consts from '../lib/constants';

export const openNewCreatedRoom = (state = false, action) => {
    switch (action.type) {
        case types.NewRoomCreatingStatus:
            return action.status
        default:
            return state;
    }
}

export const chatOpenLogs = (state = {}, action) => {
    switch (action.type) {
        case types.ChatStart:
        
            if(!state)
                state = {};
            state[action.chatId] = utils.now();
            utils.storageSaveItem(consts.storageKeyChatOpenLog,state);
            return {...state};
        case types.UpdateOpenLogsByMessage:

            if(!state)
                state = {};
            state[action.message.chatId] = utils.now();
            utils.storageSaveItem(consts.storageKeyChatOpenLog,state);
            return {...state};
        case types.LoadOpenChatLog:
            return action.openChatLog;
        default:
            return state;
    }
}

export default combineReducers({
    openNewCreatedRoom,
    chatOpenLogs
});;
