import * as types from '../actions/types';
import { combineReducers } from "redux";

export const verifycationCodeResolver = (state = {}, action) => {
    switch (action.type) {
        case types.SendNumber:
            return action.resolver
        default:
            return state;
    }
}

export const currentUser = (state = null, action) => {
    switch (action.type) {
        case types.SaveCurrentUser:
            return {
                ...action.user
            }
        default:
            return state;
    }
}


export const test = (state = "test", action) => {
    switch (action.type) {
        case types.Test:
            return action.test
        default:
            return state;
    }
}

export const showCountryPicker = (state = false, action) => {
    
    switch (action.type) {
        case types.CountryPickerShow:
            return action.show
        default:
            return state;
    }
}

export const countryCode = (state = "", action) => {
    
    switch (action.type) {
        case types.SelectCountryCode:
            return action.code
        default:
            return state;
    }
}

export default combineReducers({
    verifycationCodeResolver,
    currentUser,
    showCountryPicker,
    countryCode,
    test
});;
