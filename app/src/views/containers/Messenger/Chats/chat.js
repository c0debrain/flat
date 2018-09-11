import React, { Component } from "react";
import Dimensions from 'Dimensions';
import { connect } from 'react-redux';
import {
  Text,
  View,
  TouchableOpacity,
  PixelRatio
} from "react-native";

import { GiftedChat } from '../../../components/giftedchat/GiftedChat'

import {
  Container,
  Header,
  Content,
  List,
  ListItem,
  Thumbnail,
  Body,
  Right,
  Left,
  Button,
  Icon,
  Item,
  Input
} from "native-base";

import AvatarImage from "../../../components/AvatarImage";
import BaseComponent from "../../BaseContainer";
import * as actions from "../../../../actions";
import * as utils from "../../../../lib/myutils";

const deviceHeight = Dimensions.get("window").height;
const deviceWidth = Dimensions.get("window").width;
const headerHeight = PixelRatio.getPixelSizeForLayoutSize(32);

const styles = {
  mainContainer:{
    flex:1,
    flexDirection: 'column'
  },
  headerContainer:{
    flex:1,
    backgroundColor:"#F7F7F7",
    borderBottomColor: '#CCCCCC',
    borderBottomWidth: 1,
    flexDirection: 'row',
    justifyContent: 'space-between'
  },
  headerLeft:{
    width:50,
    height:headerHeight,
    flexDirection: 'column',
    justifyContent: 'center',
    alignItems: 'center'
  },
  headerCenter:{
    width: deviceWidth - 100,
    height:headerHeight,
    flexDirection: 'row',
    justifyContent: 'center',
    alignItems: 'center'
  },
  headerRight:{
    width:50,
    height:headerHeight,
    flexDirection: 'column',
    justifyContent: 'center',
    alignItems: 'center'
  },
  backButton:{
    color:'#242424'
  },
  backButtonTouch:{
    width:50,
    height:64,
    flexDirection: 'column',
    justifyContent: 'center',
    alignItems: 'center'
  },
  chatContainer:{
    flex:9
  },
  chatAvatar:{
    width: 25,
    height: 25,
    borderRadius: 12.5,
    marginRight:10
  },
  chatTitleText:{
    color:'#242424',
    fontSize: 14
  },
};

class Chats extends BaseComponent {

  constructor(props){
    super(props);

    this.chatHeightSet = false;
  }

  state = {
    messages: [],
    chatViewHeight: deviceHeight - 200
  }

  updateMessagesFromProps = () => {

    if (!this.props.chat || !this.props.chat.messages)
      return;

    let messages = Object.keys(this.props.chat.messages).map(key => this.props.chat.messages[key]);

    // sort
    messages = messages.sort((msg1, msg2) => {
      return msg2.createdAt - msg1.createdAt;
    });

    this.setState({

      messages: messages.map((message) => {

        // get user
        const messageOwner = this.props.chat.users.find( (user) => {
          return user.userId === message.userId;
        });

        const messageObj = {
          _id: message._id,
          text: message.text,
          createdAt: message.createdAt
        };

        if(messageOwner){
          messageObj.user = {
            _id: messageOwner.userId,
            name: messageOwner.displayName
          }

          if(messageOwner.photoUrl){
            messageObj.user.avatar = messageOwner.photoUrl;
          }

        }else{
          messageObj.user = {
            _id: "1",
            name: "err"
          }
        }

        return messageObj;

      })

    })

  }

  componentDidUpdate = (prevProps, prevState) => {
    
    if (prevProps.chat != this.props.chat) {
      this.updateMessagesFromProps(this.props.chat);
    }

    if(prevProps.currentTab != this.props.currentTab){
      this.props.navigation.goBack();
    }
  }

  componentWillMount() {
    this.updateMessagesFromProps(this.props.chat);
  }

  onSend(messages = []) {
    messages.forEach((message) => {

      this.props.sendMessage({
        _id: message._id,
        createdAt: utils.now(),
        text: message.text,
        attachment: {},
        userId: this.props.user.userId
      });

    });
  }

  onBack = () => {
    this.props.navigation.goBack();
    this.props.closeChat();
  }
  
  onPressAvatar = (user) => {
    this.props.showUserProfileModal(user._id);
  }

  render() {

    if(!this.props.chat)
      return <View />
      
    return (
      <View style={styles.mainContainer} >

        <View style={styles.headerContainer}>

          <View style={styles.headerLeft} >
            <TouchableOpacity onPress={this.onBack} style={styles.backButtonTouch}>
              <Icon name='angle-left' type='FontAwesome' style={styles.backButton}/>
            </TouchableOpacity>
          </View>
          <View style={styles.headerCenter} >
              <AvatarImage 
                name={this.props.chat.title}
                style={styles.chatAvatar} 
                textStyle={{fontSize:12}} 
                source={this.props.chat.photoUrl} />
              <Text style={styles.chatTitleText}>{this.props.chat.title}</Text>
          </View>
          <View style={styles.headerRight} >
            
          </View>
        </View>
      
        <View style={styles.chatContainer}>

          <GiftedChat
            messages={this.state.messages}
            onSend={messages => this.onSend(messages)}
            user={{
              _id: this.props.user.userId,
              name: this.props.user.displayName,
              avatar: this.props.user.photoUrl
            }}
            onPressAvatar={this.onPressAvatar}
          />
        </View>
      </View>
    )

  }
}

const mapStateToProps = state => ({
  ...BaseComponent.defaltProps(state),
  chatId: state.chat.currentChatId,
  user: state.auth.currentUser,
  chat: state.chat.currentChat,
  currentTab: state.tab.currentTab
});

const mapDispatchToProps = (dispatch) => ({
  sendMessage: (message) => dispatch(actions.chat.sendMessage(message)),
  closeChat: () => dispatch(actions.chat.closeChat()),
  showUserProfileModal: (userId) => dispatch(actions.userprofile.ShowUserProfileModal(true,userId)),
});

export default connect(mapStateToProps, mapDispatchToProps)(Chats)
