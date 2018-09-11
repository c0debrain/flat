
import thunkMiddleware from 'redux-thunk'
import rootReducer from './index';

import {
    createStore,
    applyMiddleware
} from 'redux'

let store = createStore(
    rootReducer,
    applyMiddleware(
        thunkMiddleware
    )
);

export default store;
