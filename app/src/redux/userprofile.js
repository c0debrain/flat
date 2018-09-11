import * as types from '../actions/types';
import { combineReducers } from "redux";

export const showModal = (state = false, action) => {
    switch (action.type) {
        case types.ProflieModalShow:
            return action.show;
        default:
            return state;
    }
}

export const currentUser  = (state = {}, action) => {
    switch (action.type) {
        case types.ProfileModalFetchUserData:
            return action.user;
        default:
            return state;
    }
}


export default combineReducers({
    showModal,
    currentUser
});;
