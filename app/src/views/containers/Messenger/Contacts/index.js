import React, { Component } from "react";
import Dimensions from 'Dimensions';
import { createStackNavigator } from 'react-navigation';
import * as actions from "../../../../actions";

import { l10n } from "../../../../lib/lang";

import Chat from '../Chats/chat'
import AddNew from './AddNew'
import ContactList from './ContactList'

export default createStackNavigator({
  ContactList: {
    screen: ContactList,
    navigationOptions: ({ navigation }) => ({
      title: l10n('Contacts'),
    })
  },
  AddNew: {
    screen: AddNew,
    navigationOptions: ({ navigation }) => ({
      title: l10n('New Contact'),
    })
  }
},
  {
    initialRouteName: "ContactList",
  });
