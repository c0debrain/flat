import * as types from '../actions/types';
import { combineReducers } from "redux";

import * as utils from '../lib/myutils';
import consts from '../lib/constants';


export const currentTab = (state = consts.mainTab.chat, action) => {
    switch (action.type) {
        case types.ChangeTab:
            return action.tabName
        default:
            return state;
    }
}

export default combineReducers({
    currentTab
});;
