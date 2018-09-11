import React, { Component } from "react";
import Dimensions from 'Dimensions';
import { createBottomTabNavigator } from 'react-navigation';

import {
    View
} from "react-native";

import {
    Icon
} from "native-base";

import messengerEventHandler from "../../../lib/backend/firebaseEventHandler";
import pushNotificationHandler from "../../../lib/PushNotificationHandler";

import * as actions from "../../../actions";
import consts from "../../../lib/constants";

import TabbarIcon from '../../components/TabbarIcon';

// store
import store from '../../../redux/store';

// Screens
import ContactsScreen from './Contacts'
import ChatsScreen from './Chats'
import ProfileScreen from './Profile'

// Modals
import UserProfileModal from '../../components/UserProfileModal';
import TabNavigationService from '../../components/TabNavigationService';

const tabBarIcon = name => ({ tintColor }) => (
    <TabbarIcon 
        name={name}
        tintColor={tintColor}
     />
);

const deviceHeight = Dimensions.get("window").height;

const styles = {
};

const MainTabNavigation = createBottomTabNavigator(
    {
        Home: {
            screen: ChatsScreen,
            navigationOptions: {
                tabBarIcon: tabBarIcon("chat"),
                title: "Home",
                tabBarOnPress: ({navigation,defaultHandler}) => {
                    store.dispatch(actions.tab.changeTab(consts.mainTab.chat));
                    defaultHandler();
                }
            }
        },
        Contacts: {
            screen: ContactsScreen,
            navigationOptions: {
                tabBarIcon: tabBarIcon("people"),
                title: "Contacts",
                tabBarOnPress: ({defaultHandler}) => {
                    store.dispatch(actions.tab.changeTab(consts.mainTab.contact));
                    defaultHandler();
                }
            }
        },
        Profile: {
            screen: ProfileScreen,
            navigationOptions: {
                tabBarIcon: tabBarIcon("person"),
                title: "Me",
                tabBarOnPress: ({defaultHandler}) => {
                    store.dispatch(actions.tab.changeTab(consts.mainTab.profile));
                    defaultHandler();
                }
            }
        }
    },
    {
        initialRouteName: "Home",
        tabBarOptions: {}
    }
);

// I want initialize eventhandler here beceuse here is first place opened after user is authorised
class MessengerRoot extends Component {

    static router = MainTabNavigation.router;

    componentDidMount = () => {

        messengerEventHandler.init();
        pushNotificationHandler.init();

    }

    render(){
        return <View style={{
            width:'100%',
            height:'100%'
        }}>

            <MainTabNavigation 
                ref={navigatorRef => {
                    TabNavigationService.setTopLevelNavigator(navigatorRef);
                }}
                navigation={this.props.navigation}
            />

            <UserProfileModal />

        </View>
    }

}

export default MessengerRoot;


