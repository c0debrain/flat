import * as types from './types';
import { alert, wait, storageGetItem, storageSaveItem } from '../lib/myutils'
import {
    searchUserByNumber as searchUserByNumberBackend,
    addUserToContact,
    getContact,
    getUserProfile,
    deleteUserFromContact,
    startChatWithUser as startChatWithUserIdBackend
} from '../lib/backend';

import { l10n } from '../lib/lang';
import constants from '../lib/constants';
import * as utils from '../lib/myutils';
import * as actions from './index';

import ProfilePool from "../lib/ProfilePool";

export function searchUserByNumber(number) {

    return async (dispatch, getState) => {

        if (getState().contact.searchingUserByNumber) {
            console.log('ignore click');
            return;
        }
        try {

            dispatch({
                type: types.StartSearchUserByNumber
            });

            const currentUser = getState().auth.currentUser;

            // check is the number is international
            if(number.substr(0,1) !== '+'){
                number = currentUser.countryCode + number.substr(1);
            }

            const user = await searchUserByNumberBackend(number);

            dispatch({
                type: types.SearchUserByNumberFound,
                user: user
            });

            dispatch({
                type: types.FinishSearchUserByNumber
            });

        } catch (e) {

            dispatch({
                type: types.FinishSearchUser
            });

            utils.showError(l10n('Failed to search user.'))

        }


    }

}

export function addToContact(user) {

    return async (dispatch, getState) => {

        if (getState().general.loading) {
            console.log('ignore click');
            return;
        }

        try {

            const loginUser = getState().auth.currentUser;

            dispatch({
                type: types.GeneralShowLoading,
                message: l10n('Saving...')
            });

            const result = await addUserToContact(loginUser.userId, user);

            // reload contacts
            dispatch(await fetchContacts(false));

            dispatch({
                type: types.GeneralHideLoading
            });

        } catch (e) {

            dispatch({
                type: types.GeneralHideLoading
            });

            utils.showError(l10n('Failed to save user to contact.'))

        }


    }

}

export function fetchContacts(useCache) {

    return async (dispatch, getState) => {

        try {

            if (useCache) {

                // get from cache first
                const cache = await utils.storageGetItem(constants.storageKeyContacts);

                if (cache && cache.length && cache.length > 0) {
                    dispatch({
                        type: types.ContactListFetched,
                        list: cache
                    });
                }
            }

            // fetch users and save to cache
            const loginUser = getState().auth.currentUser;
            const userIds = await getContact(loginUser.userId);
            if(!userIds){
                return dispatch({
                    type: types.ContactListFetched,
                    list: []
                });
            }

            const users = [];

            for (let i = 0; i < userIds.length; i++) {

                if (userIds[i]) {

                    const user = await ProfilePool.get(userIds[i]);
                    await utils.wait(0.1);

                    if (user)
                        users.push(user);

                }

            }

            utils.storageSaveItem(constants.storageKeyContacts, users);

            dispatch({
                type: types.ContactListFetched,
                list: users
            });

        } catch (e) {

            console.log(e);
            utils.showError(l10n('Failed to get contacts'))

        }

    }

}

export function deleteContacts(deleteUserId) {

    return async (dispatch, getState) => {

        try {

            if (getState().general.loading) {
                return;
            }

            dispatch({
                type: types.GeneralShowLoading,
                message: l10n('Deleting...')
            });

            const loginUser = getState().auth.currentUser;
            await deleteUserFromContact(loginUser.userId, deleteUserId);

            dispatch(await fetchContacts());

            dispatch({
                type: types.GeneralHideLoading
            });

        } catch (e) {

            console.log(e);

            dispatch({
                type: types.GeneralHideLoading
            });

            utils.showError(l10n('Failed to delete the user.'))

        }

    }

}

export function startChatWithUser(user) {

    return async (dispatch, getState) => {

        try {
            const chatId = await startChatWithUserIdBackend(user);

            // wait a sec to update history
            //await utils.wait(1);

            dispatch(actions.chat.startChat(chatId));
            
        } catch (e) {
            console.log(e);
            utils.showError(l10n('Failed to initiate chat.'))
        }
        
    }

}