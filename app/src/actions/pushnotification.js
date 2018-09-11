import * as types from './types';

export function PushNotificationOpened(payload) {

    return async (dispatch, getState) => {

        console.log('payload',payload);
        
        dispatch({
            type: types.PushNotificationOpened,
            payload
        });
        
    }


}