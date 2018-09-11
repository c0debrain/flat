import React, { Component } from "react";
import Dimensions from 'Dimensions';
import { createStackNavigator } from 'react-navigation';
import * as actions from "../../../../actions";

import { l10n } from "../../../../lib/lang";

import EditProfileScreen from './EditProfile'
import ProfileScreen from './Profile'

export default createStackNavigator({
  Profile: {
    screen: ProfileScreen,
    navigationOptions: ({ navigation }) => ({
      title: l10n('Profile'),
    })
  },
  EditProfile: {
    screen: EditProfileScreen,
    navigationOptions: ({ navigation }) => ({
      title: l10n('Edit Profile'),
    })
  }
}, {
    initialRouteName: "Profile",
  });
