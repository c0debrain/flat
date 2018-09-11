import * as types from './types';
import { alert, wait, storageGetItem, storageSaveItem } from '../lib/myutils'
import {
    uploadFile,
    saveUserProfile
} from '../lib/backend';

import { l10n } from '../lib/lang';
import constant from '../lib/constants';
import * as utils from '../lib/myutils';

export function updateAvatar(path) {

    return async (dispatch, getState) => {

        if (getState().general.loading) {
            return;
        }

        try {

            const user = getState().auth.currentUser;

            dispatch({
                type: types.GeneralShowLoading,
                message: l10n('Uploading picture...')
            });

            const downloadURL = await uploadFile(path, `/avatar/${user.userId}${utils.now()}.jpg`);

            dispatch({
                type: types.GeneralShowLoading,
                message: l10n('Saving...')
            });

            await saveUserProfile(user.userId, {
                photoUrl: downloadURL
            });

            // update current user
            dispatch({
                type: types.SaveCurrentUser,
                user: Object.assign(user, {
                    photoUrl: downloadURL
                })
            });

            dispatch({
                type: types.GeneralHideLoading
            });

        } catch (e) {

            console.log(e);

            dispatch({
                type: types.GeneralHideLoading
            });

            utils.showError(l10n('Failed to save new photo.'))

        }


    }

}

export function saveProfile(data) {

    return async (dispatch, getState) => {

        if (getState().general.loading) {
            return;
        }

        try {

            const user = getState().auth.currentUser;

            dispatch({
                type: types.GeneralShowLoading,
                message: l10n('Saving...')
            });

            const photoUrl = null;

            if(data.avatarPic){
                
                photoUrl = await uploadFile(data.avatarPic.path, `/avatar/${user.userId}${utils.now()}.jpg`);

                // save avatar pic locally to get better quality 
                await utils.storageSaveItem(
                    constant.storageKeyMyProfileAvatarPath,
                    data.avatarPic.path);

            }

            const saveParams = {
                displayName: data.displayName,
                status: data.status
            };

            if(photoUrl)
                saveParams.photoUrl = photoUrl;

            await saveUserProfile(user.userId, saveParams);

            // update current user
            dispatch({
                type: types.SaveCurrentUser,
                user: Object.assign(user, saveParams)
            });

            dispatch({
                type: types.GeneralHideLoading
            });

        } catch (e) {

            console.log(e);

            dispatch({
                type: types.GeneralHideLoading
            });

            utils.showError(l10n('Failed to save profile.'))

        }


    }

}
