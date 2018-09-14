import React, { Component } from "react";
import Dimensions from 'Dimensions';
import { connect } from 'react-redux';
import {
  Text,
  View,
  TouchableOpacity,
  PixelRatio,
  Platform,
  Animated
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
import consts from '../../../../lib/constants';

import {l10n} from "../../../../lib/lang";
import RNFetchBlob from 'rn-fetch-blob'
import ImagePicker from 'react-native-image-crop-picker';

import uuid from 'uuid';

const deviceHeight = Dimensions.get("window").height;
const deviceWidth = Dimensions.get("window").width;
const headerHeight = PixelRatio.getPixelSizeForLayoutSize(32);

const initialDrawerPosition = 30;

const styles = {
  mainContainer:{
    flex:1,
    flexDirection: 'column',
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
  accessoryContainer:{
    position: 'absolute',
    flex: 1,
    flexDirection: 'row',
    justifyContent: 'flex-start',
    alignItems: 'flex-end',
    paddingBottom:8,
    width: deviceWidth,
    left: deviceWidth - initialDrawerPosition,
    bottom: 0,
    zIndex: 100
  },
  iconHolder:{
    flex:1,
    width:40
  },
  accessoryIcon:{
    color: '#222',
    fontSize: 24,
    marginRight: 15,
    paddingBottom: 7
  }
};

class Chats extends BaseComponent {

  constructor(props){
    super(props);

    this.chatHeightSet = false;
    this.drawerAnimationValue = new Animated.Value(0);

  }

  state = {
    messages: [],
    chatViewHeight: deviceHeight - 200,
    inputHeight:  44,
    mediaDrawerOpened: false
  }

  updateMessagesFromProps = () => {

    if (!this.props.chat || !this.props.chat.messages)
      return;

    let messages = Object.keys(this.props.chat.messages).map(key => this.props.chat.messages[key]);

    const myTemporaryMessages = this.props.temporaryMessages.filter( (msg) => {

      // check exists in real messages
      const exists = messages.find( msg2 => {
        return msg2._id == msg._id
      });

      if(exists)
        return false;

      return msg.chatId == this.props.chatId

    });

    messages = messages.concat(myTemporaryMessages);

    // sort
    messages = messages.sort((msg1, msg2) => {
      return msg2.createdAt - msg1.createdAt;
    });

    const messagesToDisplay = messages.map((message) => {

      // get user
      const messageOwner = this.props.chat.users.find( (user) => {
        return user.userId === message.userId;
      });
      
      // build msg obj for gifted chat

      const messageObj = {
        _id: message._id,
        text: message.text,
        type: message.type,
        createdAt: message.createdAt,
        state: message.state
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
      
      if(message.type == consts.messageTypePhoto && 
          message.state != consts.messageStateSending){

        messageObj.text = null;

        if( message.attachment.pictureUrl){
          messageObj.image = message.attachment.pictureUrl;
        }else{
          messageObj.image = message.attachment.thumbnailUrl;
        }

      }

      return messageObj;

    });

    this.setState({

      messages: messagesToDisplay

    });


  }

  componentDidUpdate = (prevProps, prevState) => {
    
    if (prevProps.chat != this.props.chat) {
      this.updateMessagesFromProps(
        this.props.chat,
        this.props.temporaryMessages
      );
    }

    if (prevProps.temporaryMessages != this.props.temporaryMessages) {
      this.updateMessagesFromProps(
        this.props.chat,
        this.props.temporaryMessages
      );
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
        userId: this.props.user.userId,
        type: consts.messageTypeText
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

  onInputSizeChanged = (contentSize) => {
    
    this.setState({
      inputHeight:contentSize.height
    });

  }
  
  tuggleMedia = () => {

    let initialValue = this.state.mediaDrawerOpened;

    this.setState({
      mediaDrawerOpened: !this.state.mediaDrawerOpened
    });
    
    if(!initialValue){

      Animated.timing(
        this.drawerAnimationValue,
        {
          toValue: new Animated.Value(-1 * deviceWidth + initialDrawerPosition),
          duration: 200, 
          useNativeDriver: true,
        }
      ).start(); 

    } else {

      Animated.timing(
        this.drawerAnimationValue,
        {
          toValue: 0,
          duration: 200, 
          useNativeDriver: true,
        }
      ).start(); 

    }


  }

  getSendingMessage = () => {

    const temporaryMessage = {
      _id: uuid.v4(),
      createdAt: utils.now(),
      text: null,
      attachment: {},
      userId: this.props.user.userId,
      type: consts.messageTypePhoto,
      state: consts.messageStateSending,
      chatId: this.props.chatId
    };

    return temporaryMessage;

  }

  onCamera = async () => {

    const temporaryMessage = this.getSendingMessage();

    const pic = await ImagePicker.openCamera({
      width: constant.picSize,
      height: constant.picSize,
      cropping: true,
      includeBase64: true,
    });
      
    this.props.sendPicture(pic,temporaryMessage);

  }

  onPicture = async () => {

    /* sending picture process
      - show temporary sending message
      - make small thumbnail
      - send message with thumbnail
      - show thumbnail message
      - send real picture
    */

    const temporaryMessage = this.getSendingMessage();

    const pic = await ImagePicker.openPicker({
      width: constant.picSize,
      height: constant.picSize,
      cropping: true,
      includeBase64: true,
    });
      
    this.props.sendPicture(pic,temporaryMessage);

  }

  onVideo = () => {
    utils.showWarning(l10n('This feature is comming soon!'));
  }

  onAudio = () => {
    utils.showWarning(l10n('This feature is comming soon!'));
  }

  onMap = () => {
    utils.showWarning(l10n('This feature is comming soon!'));
  }

  onSticker = () => {
    utils.showWarning(l10n('This feature is comming soon!'));
  }


  render() {

    if(!this.props.chat)
      return <View />
      
    let height = this.state.inputHeight + Platform.select({
      ios: 11, // see Composer.js
      android: 3, // see Composer.js
    });

    if(height < 44)
      height = 44;

    const accessoryStyle = {
      ...styles.accessoryContainer,
      height:height
    };

    if(this.state.mediaDrawerOpened)
      accessoryStyle.backgroundColor = '#fff';

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
            onInputSizeChanged={this.onInputSizeChanged}
          />
        </View>

        <Animated.View 
          style={{
            ...accessoryStyle,
            transform: [{
              translateX: this.drawerAnimationValue
            }]
          }}>
          

          <TouchableOpacity 
            onPress={this.tuggleMedia}>
            {this.state.mediaDrawerOpened ? 
              <Icon style={{...styles.accessoryIcon,paddingBottom:5}} name='chevron-right' type="Entypo"/> : 
              <Icon style={{...styles.accessoryIcon,paddingBottom:5}} name='chevron-left' type="Entypo"/>
            }
          </TouchableOpacity>

          <TouchableOpacity 
            onPress={this.onCamera}>
            <Icon style={{
                ...styles.accessoryIcon,
              color:'#999'
            }} name='camera' type="FontAwesome"/>

          </TouchableOpacity>

          <TouchableOpacity 
            onPress={this.onPicture}>
            <Icon style={{
                ...styles.accessoryIcon,
              color:'#999'
            }} name='image' type="FontAwesome"/>
          </TouchableOpacity>

          <TouchableOpacity 
            onPress={this.onAudio}>
            <Icon style={{
                ...styles.accessoryIcon,
              color:'#999'
            }} name='microphone' type="FontAwesome"/>
          </TouchableOpacity>

          <TouchableOpacity 
            onPress={this.onVideo}>
            <Icon style={{
                ...styles.accessoryIcon,
              color:'#999'
            }} name='video-camera' type="FontAwesome"/>
          </TouchableOpacity>

          <TouchableOpacity 
            onPress={this.onMap}>
            <Icon style={{
                ...styles.accessoryIcon,
              color:'#999'
            }} name='map' type="FontAwesome"/>
          </TouchableOpacity>

          <TouchableOpacity 
            onPress={this.onSticker}>
            <Icon style={{
                ...styles.accessoryIcon,
              color:'#999'
            }} name='smile-o' type="FontAwesome"/>
          </TouchableOpacity>

         
          
        </Animated.View>

      </View>
    )

  }
}

const mapStateToProps = state => ({
  ...BaseComponent.defaltProps(state),
  chatId: state.chat.currentChatId,
  user: state.auth.currentUser,
  chat: state.chat.currentChat,
  temporaryMessages: state.chat.temporaryMessages,
  currentTab: state.tab.currentTab
});

const mapDispatchToProps = (dispatch) => ({
  sendMessage: (message) => dispatch(actions.chat.sendMessage(message)),
  closeChat: () => dispatch(actions.chat.closeChat()),
  showUserProfileModal: (userId) => dispatch(actions.userprofile.ShowUserProfileModal(true,userId)),
  sendPicture: (pic,msg) => dispatch(actions.chat.sendPicture(pic,msg)),
});

export default connect(mapStateToProps, mapDispatchToProps)(Chats)
