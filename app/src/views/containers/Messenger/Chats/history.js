import React, { Component } from "react";
import Dimensions from 'Dimensions';
import { connect } from 'react-redux';

import {
  Text,
  View,
  TouchableOpacity,
  ListView,
  FlatList
} from "react-native";

import {
  Container,
  Header,
  Content,
  ListItem,
  Thumbnail,
  Body,
  Right,
  Left,
  Button,
  Icon,
  Input,
  SwipeRow
} from "native-base";

import AvatarImage from "../../../components/AvatarImage";
import DateTime from "../../../components/DateTime";
import BaseComponent from "../../BaseContainer";
import NewRoomModal from "./NewRoomModal";

import * as actions from "../../../../actions";
import ProfilePool from "../../../../lib/ProfilePool";

const deviceHeight = Dimensions.get("window").height;
const deviceWidth = Dimensions.get("window").width;

const styles = {
  headerStyle: {
    justifyContent: 'center',
    paddingTop: 0,
    backgroundColor: '#fff',
    borderBottomColor: '#ccc',
    borderBottomWidth: 1
  },
  headerContainer: {
    flex: 1,
    flexDirection: "row"
  },
  searchBarContainer: {
    width: deviceWidth - 25
  },
  addButtonContainer: {
    width: 30,
    paddingTop: 17,
    paddingLeft: 5
  },
  addButtonIcon: {

  },
  headerIcon: {
    width: 40,
    paddingTop: 17,
    paddingLeft: 5
  },
  headerInput: {
    width: deviceWidth - 70,
    paddingTop: 20,
  },
  listViewContainer: {
    flex: 1,
    flexDirection: "row"
  },
  listViewAvatarContainer: {
    flex: 1,
    alignItems: 'center',
  },
  listViewDetailContaier: {
    flex: 5,
    flexDirection: "column",
    paddingTop: 3,
    paddingLeft: 5,
    paddingRight: 5,
    paddingBottom: 3
  },
  listViewChatNameContainer: {
    flex: 1,
    flexDirection: "row",
    justifyContent: 'space-between',
  },
  
  listViewAvatar: {
    width: 50,
    height: 50,
    borderRadius: 25,
  },
  listViewChatName: {

  },
  listViewChatNameBold: {
    fontWeight: 'bold'
  }, 
  listViewLastMessageDate: {
    color: '#999'
  },
  lastMessageContainer: {
    flex: 1,
    flexDirection: "row",
    paddingTop: 3,
  },
  lastMessageAvatar: {
    width: 20,
    height: 20,
    borderRadius: 10,
    marginRight: 5
  },
  listViewLastMessage: {
    color: '#999'
  },
  listViewLastMessageBold: {
    color: '#222',
    fontWeight: 'bold'
  }
};

class Chats extends BaseComponent {

  constructor(props) {
    super(props);
    this.chatsFiltered = null;
  }

  state = {
    chatsToDisplay: [],
    keyword: "",
    showModal: false
  };

  startChat = (chatId) => {
    this.props.startChat(chatId);
  }

  deleteRow(chatId) {


  }

  filterList = (keyword) => {

    if (!this.state.chatsToDisplay)
      return;

    this.chatsFiltered = this.state.chatsToDisplay.filter((chat) => {

      if (!keyword || keyword.length == 0)
        return true;

      const re = new RegExp("^" + keyword + ".*");

      if (chat.lastMessage)
        return re.test(chat.chatName) || re.test(chat.lastMessage.text);
      else
        return re.test(chat.chatName);

    }).sort( (obj1,obj2) => {

      let obj1date = obj1.lastMessage.date ? obj1.lastMessage.date : 0;
      let obj2date = obj2.lastMessage.date ? obj2.lastMessage.date : 0;

      if(obj1date == 0)
        obj1date = obj1.created;

      if(obj2date == 0)
        obj2date = obj2.created;

      return obj2date - obj1date;

    });

  }

  updateDataSource = (historyData) => {

    const ds = new ListView.DataSource({ rowHasChanged: (r1, r2) => r1 !== r2 });
    const chats = Object.keys(historyData).map(key => historyData[key]);

    const chatsToDisplay = chats.map((chat) => {

      let photoUrl = "";
      let chatName = "";

      // get another user

      if(chat.users.length == 2){

        const friend = chat.users.find((user) => {

          if(!user) return false;
          return user.userId != this.props.user.userId;
          
        });
  
        if(friend)
          photoUrl = friend.photoUrl;
  
        if(friend)
          chatName = friend.displayName;

          
      }

      if(chat.title)
        chatName = chat.title;

      if(chat.photoUrl)
        photoUrl = chat.photoUrl;

      const row = {
        chatId: chat.chatId,
        key: chat.chatId,
        photoUrl: photoUrl,
        chatName: chatName,
        created:chat.created,
        lastMessage: {
          text: chat.lastMessage ? chat.lastMessage.text : "",
          date: chat.lastUpdate,
          userId: chat.lastMessage ? chat.lastMessage.userId : null
        }
      };

      return row;

    });

    (async () => {

      // add last update user profile asynchrony
      for(let i = 0 ; i < chatsToDisplay.length ; i++){

        if(chatsToDisplay[i].lastMessage && 
          chatsToDisplay[i].lastMessage.userId){

            chatsToDisplay[i].lastMessage.user = await ProfilePool.get(chatsToDisplay[i].lastMessage.userId);

        }

      }


      this.setState({
        chatsToDisplay: chatsToDisplay
      });
      
    })();

  }

  newConversation = () => {
    this.props.setNewRoomModalVisible(true);
  }

  componentWillMount = () => {
    this.updateDataSource(this.props.history);
    this.props.loadChatOpenLog();
    
  }

  componentWillUpdate = (nextProps, nextState) => {

    if (nextProps.history != this.props.history) {
      this.updateDataSource(nextProps.history);
    }

  }

  componentDidUpdate = (prevProps, prevState) => {

    if(
      prevProps.openNewCreatedRoom != this.props.openNewCreatedRoom &&
      this.props.openNewCreatedRoom) {

        this.startChat(this.props.chat.chatId);

      }

      if (prevProps.pushnotificationOpenChatId != this.props.pushnotificationOpenChatId) {
        this.startChat(this.props.pushnotificationOpenChatId);
      }

      if (prevProps.chat != this.props.chat && this.props.chat != null) {
        this.props.navigation.navigate('Chat');
      }

  }

  checkUnread = (chat) => {

    if(!this.props.chatOpenLogs){
      return true;
    }
    
    const lastOpenTime = this.props.chatOpenLogs[chat.chatId] ? 
                          this.props.chatOpenLogs[chat.chatId] : 0;

    const lastMessage = chat.lastMessage ? 
                          chat.lastMessage.date : 0;

    return lastOpenTime < lastMessage;

  }

  render() {

    this.filterList(this.state.keyword);
    
    return (
      <Container>

        <Header style={styles.headerStyle}>
          <View style={styles.headerContainer}>
            <Icon style={styles.headerIcon} name="ios-search" />
            <Input
              style={styles.headerInput}
              placeholder="Search" value={this.state.searchText}
              onChangeText={(text) => {
                this.setState({ keyword: text });
              }}
            />
            <TouchableOpacity style={styles.addButtonContainer} onPress={this.newConversation}>
              <Icon name='add' style={{ color: '#333' }} />
            </TouchableOpacity>
          </View>
        </Header>

        <Content>

          <FlatList
            data={this.chatsFiltered}
            rightOpenValue={-75}
            renderItem={({ item }) => <SwipeRow
              rightOpenValue={-75}
              body={
                <TouchableOpacity style={styles.listViewContainer} key={item.chatId} onPress={_ => this.startChat(item.chatId)}>
                  <View style={styles.listViewAvatarContainer}>
                    <AvatarImage 
                      name={item.chatName}
                      style={styles.listViewAvatar} 
                      source={item.photoUrl} />
                  </View>
                  <View style={styles.listViewDetailContaier}>
                    <View style={styles.listViewChatNameContainer}>
                      {this.checkUnread(item) ? 
                        <Text style={styles.listViewChatNameBold}>{item.chatName}</Text> :
                        <Text style={styles.listViewChatName}>{item.chatName}</Text> 
                      }
                      <DateTime style={styles.listViewLastMessageDate} note numberOfLines={1} timestamp={item.lastMessage.date}></DateTime>
                    </View>

                    {item.lastMessage ?
                      <View style={styles.lastMessageContainer}>
                        {item.lastMessage.user ?
                             <AvatarImage 
                              style={styles.lastMessageAvatar} 
                              name={item.lastMessage.user.displayName} 
                              textStyle={{fontSize:10}} 
                              source={item.lastMessage.user.photoUrl} /> : null
                          }
                        {this.checkUnread(item) ? 
                          <Text style={styles.listViewLastMessageBold} note numberOfLines={1}>{item.lastMessage.text}</Text>:
                          <Text style={styles.listViewLastMessage} note numberOfLines={1}>{item.lastMessage.text}</Text>
                        }

                      </View> : null
                    }
                  </View>
                </TouchableOpacity>
              }
              right={
                < Button full danger onPress={_ => this.deleteRow(item.uid)}>
                  <Icon active name="trash" />
                </Button>
              } />
            }
          />
        </Content>

        <NewRoomModal visible={this.props.showNewRoomModal}/>

      </Container >
    );
  }
}


const mapStateToProps = state => ({
  ...BaseComponent.defaltProps(state),
  history: state.chat.history,
  chat: state.chat.currentChat,
  user: state.auth.currentUser,
  showNewRoomModal: state.chat.showNewRoomModal,
  openNewCreatedRoom: state.history.openNewCreatedRoom,
  chatOpenLogs: state.history.chatOpenLogs,
  pushnotificationOpenChatId: state.chat.pushnotificationOpenChatId
})

const mapDispatchToProps = (dispatch) => ({
  startChat: (chatId) => dispatch(actions.chat.startChat(chatId)),
  setNewRoomModalVisible: (visible) => dispatch(actions.chat.setNewRoomModalVisible(visible)),
  loadChatOpenLog: () => dispatch(actions.history.loadChatOpenLog())
  
})

export default connect(mapStateToProps, mapDispatchToProps)(Chats)
