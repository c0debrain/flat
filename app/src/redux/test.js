import { combineReducers } from "redux";

export const test = (state = 0, action) => {
    switch (action.type) {
        default:
            return state;
    }
}

export default combineReducers({
    test
});;
