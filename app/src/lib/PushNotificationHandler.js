import firebase from 'react-native-firebase';
import { Notification, NotificationOpen } from 'react-native-firebase';
import * as actions from '../actions'
import * as utils from './myutils';
import { l10n } from "./lang"
import ProfilePool from './ProfilePool'

// event handler calls action from online events
// messege received
// history updated
// message modified
// message deleted

class PushNotificationHandler {

    constructor() {
        this.store = null;
    }

    setStore = (store) => {
        this.store = store;
    }

    init = async () => {
  
        this.notificationOpenedListener = firebase.notifications().onNotificationOpened((notificationOpen) => {
            console.log('notificationOpen',notificationOpen);
            this.store.dispatch(actions.pushnotification.PushNotificationOpened(notificationOpen.notification.data));
        });

    }

}

// its singleton
export default new PushNotificationHandler();
