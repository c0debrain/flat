import React, { Component } from "react";
import Dimensions from 'Dimensions';
import { connect } from 'react-redux';
import {
    Text,
    View,
    ActivityIndicator
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

import { l10n } from "../../../../lib/lang";
import * as utils from "../../../../lib/myutils";
import BaseComponent from "../../BaseContainer";
import * as actions from "../../../../actions";
import AvatarImage from "../../../components/AvatarImage";
import TabNavigationService from "../../../components/TabNavigationService";

const deviceHeight = Dimensions.get("window").height;
const deviceWidth = Dimensions.get("window").width;

const styles = {
    numberFormatNote: {
        color: '#0009',
        fontSize: 14,
        paddingLeft: 15,
        marginTop: 10
    },
    searchResultContainer: {
        flex: 1,
        flexDirection: "column",
        alignItems: 'center',
        height: deviceHeight / 2,
        justifyContent: 'center',
        height: '100%'
    },
    notfoundContainer: {
        alignItems: 'center',
        justifyContent: 'center'
    },
    foundContainer: {
        width:'100%',
        height: '100%',
        flex: 1,
        flexDirection: 'column',
        alignItems: 'center',
        justifyContent: 'center'
    },
    avatarImage: {
        marginTop:50,
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
        marginBottom: 25,
    },
    menuContainer:{
        width:'100%',
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

class AddNew extends BaseComponent {

    state = {
        searchNumber: "0907063333"
    };

    addToContact = () => {

        this.props.navigation.navigate('AddNew');

    }

    doSearch = async () => {

        if (this.state.searchNumber.length == 0) {
            return utils.showWarning(l10n('Please input number.'));
        }

        await this.props.search(this.state.searchNumber);

    }

    addUserToContact = async () => {

        let existsInContact = false;

        if(this.props.contacts &&
            this.props.userFound){

                existsInContact = this.props.contacts.find( user => {

                    return user.userId == this.props.userFound.userId
        
                }) != null;

        }

        if(existsInContact)
            return;

        await this.props.addToContact(this.props.userFound);

        this.setState({ searchNumber: "" });
        this.props.reset();
        this.props.navigation.goBack();

    }

    startChat = async () => {

        (async() => {
            await this.props.startChatWithUser(this.props.userFound);
            TabNavigationService.navigate("Home");
        })();

    }

    render() {

        let existsInContact = false;

        if(this.props.contacts &&
            this.props.userFound){

                existsInContact = this.props.contacts.find( user => {

                    return user.userId == this.props.userFound.userId
        
                }) != null;

        }

        let addToContactTextStyle = styles.menuText;
        let addToContactIConStyle = styles.menuIcon;

        if(existsInContact){
            addToContactTextStyle = styles.menuTextDisbled;
            addToContactIConStyle = styles.menuIconDisabled;
        }

        return (
            <Container>
                <Content>
                    <Form style={styles.formContainer}>
                        <Item floatingLabel>
                            <Label style={{ color: "#999" }}>{l10n("Telephone Number")}</Label>
                            <Input
                                value={this.state.searchNumber}
                                onChangeText={text => this.setState({ searchNumber: text })}
                                keyboardType="phone-pad"
                                style={{ color: "#222" }}
                            />
                            <Icon onPress={this.doSearch} active name='search' />
                        </Item>
                        <Text style={styles.numberFormatNote}>{l10n("Please input telephone number of your friend.")}</Text>
                    </Form>

                    <View style={styles.searchResultContainer}>

                        {this.props.searching ? <ActivityIndicator size="small" color="#999" /> : null}
                        {this.props.searching === false && this.props.userFound === -1 ?
                            <View style={styles.notfoundContainer}>
                                <Icon
                                    type="MaterialIcons"
                                    name="sentiment-dissatisfied"
                                    style={{ fontSize: 80, color: '#cc0' }}
                                />
                                <Text> {l10n('No user found. Please check telephone number')} </Text>
                            </View> : null
                        }
                        {this.props.searching === false && this.props.userFound && this.props.userFound !== -1 ?
                            <View style={styles.foundContainer}>
                                <AvatarImage 
                                    name={this.props.userFound.displayName}
                                    style={styles.avatarImage} 
                                    source={this.props.userFound.photoUrl} />
                                <Text style={styles.name}>{this.props.userFound.displayName}</Text>
                                <View>
                                    <Text style={styles.status}>{this.props.userFound.status}</Text>
                                </View>

                                <View style={styles.menuContainer}>
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
                                
                            </View> : null
                        }

                    </View>
                </Content>
            </Container>
        );
    }
}


const mapStateToProps = state => ({
    ...BaseComponent.defaltProps(state),
    searching: state.contact.searchingUserByNumber,
    userFound: state.contact.userFound,
    contacts: state.contact.contacts,
})

const mapDispatchToProps = (dispatch) => ({
    search: (number) => dispatch(actions.contact.searchUserByNumber(number)),
    addToContact: (user) => dispatch(actions.contact.addToContact(user)),
    reset: () => dispatch(actions.general.resetData("addnewcontact")),
    startChatWithUser: (user) => dispatch(actions.contact.startChatWithUser(user))
})

export default connect(mapStateToProps, mapDispatchToProps)(AddNew)
