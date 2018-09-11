import React, { Component } from "react";
import Dimensions from 'Dimensions';
import { connect } from 'react-redux';
import {
  Text,
  View,
  Image,
  ScrollView
} from "react-native";

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
import RNFetchBlob from 'rn-fetch-blob'

import BaseComponent from "../../BaseContainer";
import * as actions from "../../../../actions";
import * as utils from "../../../../lib/myutils";
import AvatarImage from "../../../components/AvatarImage";

const defaultAvatar = require("../../../images/defaultAvatar.png");

const deviceHeight = Dimensions.get("window").height;
const deviceWidth = Dimensions.get("window").width;

const styles = {
  avatartContainer: {
    alignItems: 'center',
    marginTop: 50,
    marginBottom: 50,
    justifyContent: 'center'
  },
  avatarImage: {
    width: deviceWidth / 3,
    height: deviceWidth / 3,
    borderRadius: deviceWidth / 6,
    borderWidth: 1,
    borderColor: "#999"

  },
  name: {
    marginTop: 10,
    fontSize: 24
  },
  status: {
    marginTop: 10,
    fontSize: 14,
    color: '#999'
  }
};

class Profile extends BaseComponent {

  state = {
    avatarImage: null
  };


  goEdit = () => {
    this.props.navigation.navigate('EditProfile');
  }

  getAvatar = async () => {

    // save avatar pic locally to get better quality 
    const myAvatarCachePath = await utils.storageGetItem(constant.storageKeyMyProfileAvatarPath);
    let isExists = false;
    if(myAvatarCachePath)
      isExists = await RNFetchBlob.fs.exists(myAvatarCachePath);

    if (isExists) {
        const result = await RNFetchBlob.fs.readFile(myAvatarCachePath, 'base64');
        if (result) {
            this.setState({
                avatarImage: result
            });
        }
        
    } else if(this.props.user.photoUrl){

      const res = await RNFetchBlob.config({
        fileCache: false
      }).fetch('GET', this.props.user.photoUrl);

      const base64 = await res.base64();

      this.setState({
        avatarImage: base64
      });

    }

  }

  componentDidUpdate = (prevProps, prevState) => {

    if (prevProps.user != this.props.user) {
      this.getAvatar();
    }

  }

  componentDidMount = () => {

    // get user avatar
    this.getAvatar();
    
  }

  render() {

    let avatarImage

    if(this.state.avatarImage){
      avatarImage = { uri:"data:image/jpeg;base64," + this.state.avatarImage}
    }else{
      avatarImage = defaultAvatar;
    }

    return (
      <Container>
        <ScrollView>

          <View style={styles.avatartContainer}>
            <Image style={styles.avatarImage} source={avatarImage} />
            <Text style={styles.name}>{this.props.user.displayName}</Text>
            <View>
              <Text style={styles.status}>{this.props.user.status}</Text>
            </View>
          </View>

          <View>
            <ListItem icon onPress={this.goEdit}>
              <Left>
                <Icon name="edit" type='MaterialIcons' />
              </Left>
              <Body>
                <Text>Edit Profile</Text>
              </Body>
              <Right>
                <Icon name="arrow-forward" />
              </Right>
            </ListItem>

            {/* // this is disabled because messenger doesnt need signout
            
            <ListItem icon onPress={this.props.signout}>
              <Left>
                <Icon name="exit-to-app" type='MaterialIcons' />
              </Left>
              <Body>
                <Text>Logout</Text>
              </Body>
              <Right>
                <Icon active name="arrow-forward" />
              </Right>
            </ListItem>

            */}

          </View>

        </ScrollView>
      </Container>
    );
  }
}

const mapStateToProps = state => ({
  ...BaseComponent.defaltProps(state),
  user: state.auth.currentUser
})

const mapDispatchToProps = (dispatch) => ({
  signout: () => dispatch(actions.auth.signOut()),
})

export default connect(mapStateToProps, mapDispatchToProps)(Profile)
