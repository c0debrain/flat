import * as types from './types';

export function changeTab(tabName) {

    return async (dispatch, getState) => {

        dispatch({
            type: types.ChangeTab,
            tabName
        });

        dispatch({
            type: types.ChatClose
        });
        
    }


}