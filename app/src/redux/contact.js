import * as types from '../actions/types';
import { combineReducers } from "redux";

export const searchingUserByNumber = (state = false, action) => {
    switch (action.type) {
        case types.StartSearchUserByNumber:
            return true;
        case types.FinishSearchUserByNumber:
            return false;
        default:
            return state;
    }
}

export const userFound = (state = null, action) => {
    switch (action.type) {
        case types.SearchUserByNumberFound:
            return action.user;
        case types.GeneralResetData:
            if (action.data == 'addnewcontact')
                return null;
            else
                return state;
        default:
            return state;
    }
}

export const contacts = (state = [], action) => {
    switch (action.type) {
        case types.ContactListFetched:
            return action.list.map(obj => {
                return { ...obj, key: obj.userId }
            })
        default:
            return state;
    }
}

export default combineReducers({
    searchingUserByNumber,
    userFound,
    contacts
});;
