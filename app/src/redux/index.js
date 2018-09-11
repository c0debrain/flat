import { combineReducers } from "redux";

import navigation from "./navigation";
import auth from "./auth";
import general from "./general";
import contact from "./contact";
import chat from "./chat";
import history from "./history";
import tab from "./tab";
import userprofile from "./userprofile";
import test from "./test";

const rootReducer = combineReducers({
    test,
    auth,
    contact,
    general,
    navigation,
    chat,
    history,
    tab,
    userprofile
});

export default rootReducer;

