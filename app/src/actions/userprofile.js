import * as types from './types';

import ProfilePool from "../lib/ProfilePool";

export function ShowUserProfileModal(show,userId){

    return async (dispatch, getState) => {
        
        dispatch({
            type: types.ProflieModalShow,
            show
        });

        if(userId){

            const userData = await ProfilePool.get(userId);

            if(userData){
    
                dispatch({
                    type: types.ProfileModalFetchUserData,
                    user: userData
                });

            } else {
    
                dispatch({
                    type: types.ProflieModalShow,
                    hide
                });
    
            }

        }

    }
}

