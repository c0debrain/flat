import React, { Component } from "react";
import Dimensions from 'Dimensions';
import { connect } from 'react-redux';
import {
    Text,
    View,
    ActivityIndicator,
    Modal,
    TouchableOpacity
} from "react-native";

import {
    Container,
    Content,
    Form,
    Label,
    Item,
    Input,
    Icon,
    Button,
    ListItem,
    Left,
    Body,
    Right
} from "native-base";

import { l10n } from "../../lib/lang";
import * as utils from "../../lib/myutils";
import * as actions from "../../actions";
import AvatarImage from "./AvatarImage";
import TabNavigationService from "./TabNavigationService";

const deviceHeight = Dimensions.get("window").height;
const deviceWidth = Dimensions.get("window").width;

const styles = {
    headerContainer:{
        flex:1,
        paddingTop:15,
        paddingBottom:10,
        backgroundColor:"#F7F7F7",
        borderBottomColor: '#CCCCCC',
        borderBottomWidth: 1,
        flexDirection: 'row',
        justifyContent: 'space-between'
    },
    headerLeft:{
        width:75,
        height:'100%',
        paddingTop:10,
        flexDirection: 'column',
        justifyContent: 'center',
        alignItems: 'flex-start'
    },
    headerCenter:{
        width: deviceWidth - 150,
        height:'100%',
        paddingTop:10,
        flexDirection: 'row',
        justifyContent: 'center',
        alignItems: 'center'
    },
    headerRight:{
        width:75,
        height:'100%',
        paddingTop:10,
        flexDirection: 'row',
        justifyContent: 'center',
        alignItems: 'flex-start'
    },
    backButton:{
        color:'#242424'
    },
    backButtonTouch:{
        width:50,
        height:'100%',
        flexDirection: 'column',
        justifyContent: 'center',
        alignItems: 'center'
    },
    userProfileContainer: {
        width:'100%',
        flex: 1,
        flexDirection: 'column',
        alignItems: 'center',
        justifyContent: 'center'
    },
    avatarImage: {
        marginTop:100,
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
        color: '#999',
        marginBottom: 50,
    },
    menyContainer:{
        width:'100%'
    },
    menuText:{
        color:'#222'
    },
    menuIcon:{
        color:'#222'
    },
    menuTextDisbled:{
        color:'#999'
    },
    menuIconDisabled:{
        color:'#999'
    }
};

class UserProfileModal extends Component {

    addUserToContact = async () => {

        let existsInContact = false;

        if(this.props.contacts &&
            this.props.user){

                existsInContact = this.props.contacts.find( user => {

                    return user.userId == this.props.user.userId
        
                }) != null;

        }

        if(existsInContact)
            return;

        await this.props.addToContact(this.props.user);
        TabNavigationService.navigate('Contacts');
        this.props.close();

    }

    startChat = async () => {

        (async() => {
            await this.props.startChatWithUser(this.props.user);
            this.props.close();
            TabNavigationService.navigate("Home");
        })();

    }

    render() {

        let existsInContact = false;

        if(this.props.contacts &&
            this.props.user){

                existsInContact = this.props.contacts.find( user => {

                    return user.userId == this.props.user.userId
        
                }) != null;

        }

        let addToContactTextStyle = styles.menuText;
        let addToContactIConStyle = styles.menuIcon;

        if(existsInContact){
            addToContactTextStyle = styles.menuTextDisbled;
            addToContactIConStyle = styles.menuIconDisabled;
        }

        return (
            <Modal
                animationType="slide"
                transparent={false}
                visible={this.props.visible}
                onRequestClose={() => {
                    alert('Modal has been closed.');
                }}>
                
                <Container>
                    <Content>

                        <View style={styles.headerContainer}>

                            <View style={styles.headerLeft} >
                                <TouchableOpacity onPress={this.props.close} style={styles.backButtonTouch}>
                                    <Icon name='angle-left' type='FontAwesome' style={styles.backButton}/>
                                </TouchableOpacity>
                            </View>
                            <View style={styles.headerCenter} >
                                <Text style={styles.chatTitleText}>{this.props.user.displayName}</Text>
                            </View>
                            <View style={styles.headerRight} >

                            </View>

                        </View>

                        <View style={styles.userProfileContainer}>

                            <AvatarImage 
                                name={this.props.user.displayName}
                                style={styles.avatarImage} 
                                source={this.props.user.photoUrl} />
                            <Text style={styles.name}>{this.props.user.displayName}</Text>
                            <View>
                                <Text style={styles.status}>{this.props.user.status}</Text>
                            </View>

                            <View style={styles.menyContainer}>
                                <ListItem icon onPress={this.addUserToContact}>
                                <Left>
                                    <Icon style={addToContactIConStyle} name="add" type='MaterialIcons' />
                                </Left>
                                <Body>
                                    <Text style={addToContactTextStyle}>{l10n('Add to contact')}</Text>
                                </Body>
                                <Right>
                                    {!existsInContact ? 
                                    <Icon name="arrow-forward" /> : null}
                                </Right>
                                </ListItem>
                                <ListItem icon onPress={this.startChat}>
                                <Left>
                                    <Icon style={styles.menuIcon} name="chat" type='MaterialIcons' />
                                </Left>
                                <Body>
                                    <Text style={styles.menuText}>{l10n('Start Chat')}</Text>
                                </Body>
                                <Right>
                                    <Icon active name="arrow-forward" />
                                </Right>
                                </ListItem>
                            </View>
                            
                        </View> 

                    </Content>
                </Container>

            </Modal>
        );
    }
}


const mapStateToProps = state => ({
    visible: state.userprofile.showModal,
    user: state.userprofile.currentUser,
    contacts: state.contact.contacts
})

const mapDispatchToProps = (dispatch) => ({
    search: (number) => dispatch(actions.contact.searchUserByNumber(number)),
    addToContact: (user) => dispatch(actions.contact.addToContact(user)),
    startChatWithUser: (user) => dispatch(actions.contact.startChatWithUser(user)),
    close: () => dispatch(actions.userprofile.ShowUserProfileModal(false,null)),
})

export default connect(mapStateToProps, mapDispatchToProps)(UserProfileModal)
