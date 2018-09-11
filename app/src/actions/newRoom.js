import * as types from './types';

import {
    createNewConversation
} from '../lib/backend';

import { l10n } from '../lib/lang';
import * as utils from '../lib/myutils';
import * as actions from '../actions';

import ProfilePool from "../lib/ProfilePool";

export function finishCreateNewRoom(){
    return {
        type: types.NewRoomCreatingStatus,
        status: true
    }
}

export function resetCreateNewRoomStatus(){
    return {
        type: types.NewRoomCreatingStatus,
        status: false
    }
}

export function create({name,pic,users}) {

    return async (dispatch, getState) => {

        try{

            dispatch({
                type: types.GeneralShowLoading,
                message: l10n('Generating New Conversation')
            });

            const chatId = await createNewConversation({name,pic,users});

            dispatch({
                type: types.GeneralHideLoading
            });

            // wait to new chat is added to history.
            await utils.wait(1);

            dispatch(actions.chat.startChat(chatId));

            // open chat
            dispatch(actions.newRoom.finishCreateNewRoom());

            // wait for something... 
            await utils.wait(0.1);
            dispatch(actions.newRoom.resetCreateNewRoomStatus());


        } catch (e) {

            console.log(e);
            
            dispatch({
                type: types.GeneralHideLoading
            });

            utils.showError(l10n('Failed to create new room.'))

        }
        
    }

}
