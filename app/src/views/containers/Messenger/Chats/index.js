import React, { Component } from "react";
import Dimensions from 'Dimensions';
import { createStackNavigator } from 'react-navigation';
import * as actions from "../../../../actions";
import { connect } from 'react-redux';

import { l10n } from "../../../../lib/lang";

import History from './history'
import Chat from './chat'

const navigationComponent = createStackNavigator({
  History: {
    screen: History,
    navigationOptions: ({ navigation }) => ({
      title: l10n('Home'),
    })
  },
  Chat: {
    screen: Chat,
    navigationOptions: ({ navigation }) => ({
      title: l10n('Chat'),
      header: null
    })
  }
},
  {
    initialRouteName: "History",
  });


class ChatTop extends navigationComponent {

  componentDidMount = () => {


  }

}

export default ChatTop


