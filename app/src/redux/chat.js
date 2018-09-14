import * as types from '../actions/types';
import { combineReducers } from "redux";

export const history = (state = [], action) => {
    switch (action.type) {
        case types.UpdateHistory:
            return action.list
        default:
            return state;
    }
}

export const currentChatId = (state = null, action) => {
    switch (action.type) {
        case types.ChatStart:
            return action.chatId
        case types.ChatClose:
            return null;
        default:
            return state;
    }
}

export const currentChat = (state = null, action) => {
    switch (action.type) {
        case types.ChatStart:
            return { ...action.chat }
        case types.ChatUpdateCurrent:
            return { ...action.chat }
        case types.ChatClose:
            return null;
        default:
            return state;
    }
}

export const temporaryMessages = (state = [], action) => {
    switch (action.type) {
        case types.ChatSendTemporaryMessage:
            state.push(action.temporaryMessage);
            return [...state];
        case types.ChatSendMessage:
            const newAry = state.filter( msg => {
                return msg._id != action.message_id
            });

            return newAry;

        default:
            return state;
    }
}

export const allChat = (state = {}, action) => {
    switch (action.type) {
        case types.ChatLoad:
            const chat = action.chat;

            if (chat)
                state[chat.chatId] = chat;

            return { ...state };
        default:
            return state;
    }
}

export const showNewRoomModal = (state = false, action) => {
    switch (action.type) {
        case types.SetNewRoomModalVisible:
            return action.visible
        default:
            return state;
    }
}

export const pushnotificationOpenChatId = (state = "", action) => {
    switch (action.type) {
        case types.PushNotificationOpened:
            console.log('action.payload',action.payload);
            return action.payload.chatId
        default:
            return state;
    }
}

export default combineReducers({
    history,
    currentChatId,
    currentChat,
    allChat,
    showNewRoomModal,
    pushnotificationOpenChatId,
    temporaryMessages
});;
