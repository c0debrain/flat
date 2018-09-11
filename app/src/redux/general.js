import * as types from '../actions/types';
import { combineReducers } from "redux";

export const loading = (state = false, action) => {
    switch (action.type) {
        case types.GeneralShowLoading:
            return true
        case types.GeneralHideLoading:
            return false

        default:
            return state;
    }
}

export const loadingMessage = (state = "Loading...", action) => {
    switch (action.type) {
        case types.GeneralShowLoading:
            return action.message
        case types.GeneralHideLoading:
            return false

        default:
            return state;
    }
}

export default combineReducers({
    loading,
    loadingMessage
});;
