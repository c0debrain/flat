import { AsyncStorage } from "react-native"
import { Alert } from "react-native";
import { Toast } from "native-base";

const _storageGetItem = async (key) => {

    try {
        const value = await AsyncStorage.getItem(key);
        if (!value) return null;
        return JSON.parse(value);

    } catch (error) {
        return null;
    }
}

const _storageSaveItem = async (key, value) => {

    try {
        await AsyncStorage.setItem(key, JSON.stringify(value));
    } catch (error) {
        return null;
    }
}

const _showInfo = (Text) => {

    Toast.show({
        text: Text,
        buttonText: "Close",
        position: "bottom",
        duration: 1500
    });

}

const _showWarning = (Text) => {

    Toast.show({
        text: Text,
        buttonText: "Close",
        type: "warning",
        position: "top",
        duration: 5000
    });

}

const _showError = (Text) => {

    Toast.show({
        text: Text,
        buttonText: "Close",
        type: "danger",
        position: "top",
        duration: 5000
    });

}

const _alert = (Text) => {

    Alert.alert(
        'Debug',
        Text,
        [
            { text: 'OK' },
        ],
        { cancelable: true }
    )

}

const _wait = async (sec) => {

    return new Promise((res, rej) => {

        setTimeout(() => {

            res();

        }, sec * 1000);

    });

}

const _now = () => {

    Date.now =
        Date.now ||
        function () {
            return +new Date();
        };

    return Date.now();

}

const _truncate = (text, max, dots) => {

    if(!text)
        return "";
        
    let shortener = "...";
    if(dots !== null && dots !== undefined)
        shortener = dots;

    if (text.length > max - 3) {
        return text.substr(0, max) + shortener
    } else {
        return text
    }

}

export function _getRandomString(length) {
    if (length == undefined) length = 32;

    var text = "";
    var possible =
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    for (var i = 0; i < length; i++)
        text += possible.charAt(Math.floor(Math.random() * possible.length));

    return text;
}

// Async : save obj to AsyncStorage
export const storageGetItem = _storageGetItem;

// Async : get obj from AsyncStorage
export const storageSaveItem = _storageSaveItem;

// show info toast
export const showInfo = _showInfo;

// show warning toast
export const showWarning = _showWarning;

// show error toast
export const showError = _showError;

// show alert
export const alert = _alert;

// Async : return Timer Promise
export const wait = _wait;

// return current timestamp as integer
export const now = _now;

// as you see
export const truncate = _truncate;

// get random string
export const getRandomString = _getRandomString;

