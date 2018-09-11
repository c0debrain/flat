import * as types from '../actions/types';
import { combineReducers } from "redux";

export const screen = (state = {}, action) => {
    switch (action.type) {
        case types.NavigationGoto:
            return {
                goto: action.goto,
                timestamp: action.timestamp
            }
        default:
            return state;
    }
}

export default combineReducers({
    screen
});;
