import { Platform } from 'react-native';

import * as types from './types';
import { alert, wait, storageGetItem, storageSaveItem } from '../lib/myutils'
import {
    sendVerifycationCode,
    verifyAuthCode,
    checkInitialUser,
    signOut as signOutUser,
    getCurrentUser, // for android
    addUserToContact,
    androidVerifySMS,
    initializePushNotification,
    saveName
} from '../lib/backend';
import * as constant from '../lib/constants';
import { l10n } from '../lib/lang';
import * as utils from '../lib/myutils';

import TopNavigationService from '../views/components/TopNavigationService';

export function sendNumber(number) {

    return async (dispatch, getState) => {

        if (getState().general.loading) {
            console.log('ignore');
            return;
        }

        try {

            dispatch({
                type: types.GeneralShowLoading,
                message: l10n('Loading')
            });

            const resnponse = await sendVerifycationCode(number);

            // save the response for verification
            dispatch({
                type: types.SendNumber,
                resolver: resnponse
            });

            if (Platform.OS === 'android') {

                console.log("android waiging sms");

                const user = await androidVerifySMS();

                console.log("android receive sms",user);

                if (user) { // user is verified and logged in
                    
                    user.countryCode = getState().auth.countryCode;
                    const userProfile = await checkInitialUser(user);

                    dispatch(saveUser(userProfile));

                    dispatch({
                        type: types.GeneralHideLoading
                    });

                    dispatch({
                        type: types.NavigationGoto,
                        goto: "Messenger"
                    });

                } else {
                    throw "Failed to verify SMS"
                }

            } else {

                dispatch({
                    type: types.GeneralHideLoading
                });

                dispatch({
                    type: types.NavigationGoto,
                    goto: "CheckCode",
                    timestamp: utils.now()
                });

            }



        } catch (e) {

            dispatch({
                type: types.GeneralHideLoading
            });

            console.log(e);
            utils.showError(l10n('Failed to send SMS. Please check the telephone number.'))

        }

    }

}

export function verifyCode(code) {

    return async (dispatch, getState) => {

        if (getState().general.loading) {
            return;
        }

        try {

            dispatch({
                type: types.GeneralShowLoading,
                message: l10n('Loading')
            });

            const user = await verifyAuthCode(code, getState().auth.verifycationCodeResolver);

            // generate default profile if user is not existed in database
            user.countryCode = getState().auth.countryCode;
            const userProfile = await checkInitialUser(user);

            dispatch(saveUser(userProfile));

            dispatch({
                type: types.GeneralHideLoading
            });

            dispatch({
                type: types.NavigationGoto,
                goto: "InputUserName",
                timestamp: utils.now()
            });

        } catch (e) {

            dispatch({
                type: types.GeneralHideLoading
            });

            console.log(e);
            utils.showError(l10n('Failed to varidate code. Check your SMS or send code again.'))

        }

    }

}

export function updateName(name) {

    return async (dispatch, getState) => {

        if (getState().general.loading) {
            return;
        }

        try {

            dispatch({
                type: types.GeneralShowLoading,
                message: l10n('Saving...')
            });

            const currentUser = getState().auth.currentUser;

            await saveName(currentUser.userId,name);

            currentUser.displayName = name;
            dispatch(saveUser(currentUser));

            dispatch({
                type: types.GeneralHideLoading
            });

            TopNavigationService.navigate("Messenger");

        } catch (e) {

            dispatch({
                type: types.GeneralHideLoading
            });

            console.log(e);
            utils.showError(l10n('Failed to save name.'))

        }

    }

}


export function signOut() {

    return async (dispatch, getState) => {

        await signOutUser();
        dispatch(saveUser(null));
        TopNavigationService.navigate("AuthLoading");

    }

}

export function saveUser(user) {

    return {
        type: types.SaveCurrentUser,
        user
    }

}

export function showCountryList(show) {

    return {
        type: types.CountryPickerShow,
        show
    }

}

export function selectCountryCode(code) {

    return {
        type: types.SelectCountryCode,
        code
    }

}
