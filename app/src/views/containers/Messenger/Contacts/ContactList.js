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
    SwipeRow,
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

import UserList from "../../../components/UserList";
import BaseComponent from "../../BaseContainer";
import * as actions from "../../../../actions";
import TabNavigationService from "../../../components/TabNavigationService";

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
        flexDirection: "row",
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
    }

};

class Contacts extends BaseComponent {

    constructor(props) {
        super(props);
    }

    state = {
        searchText: "",
        contacts: []
    };

    addToContact = () => {
        this.props.navigation.navigate('AddNew');
    }

    filterList = (keyword) => {

        this.setState({
            contacts: this.props.users.filter((user) => {

                if (!keyword || keyword.length == 0)
                    return true;

                const re = new RegExp("^" + keyword + ".*","i");
                return re.test(user.displayName);

            }),
        })

    }

    componentDidMount = () => {
        this.props.fetch();
    }

    componentDidUpdate = (prevProps, prevState) => {

        if (prevProps.users != this.props.users) {
            this.filterList(this.state.searchText);
        }

    }

    deleteRow = (key) => {
        const user = this.props.users.find(o => { return o.key == key });
        this.props.delete(user.userId);
    }

    openChat = (key) => {
        const user = this.props.users.find(o => { return o.key == key });

        (async() => {
            await this.props.startChatWithUser(user);
            TabNavigationService.navigate("Home");
        })();

    }

    render() {
        
        return (
            <Container>
                <Header style={styles.headerStyle}>
                    <View style={styles.headerContainer}>
                        <Icon style={styles.headerIcon} name="ios-search" />

                        <Input
                            style={styles.headerInput}
                            placeholder="Search"
                            value={this.state.searchText}
                            onChangeText={(text) => {
                                this.setState({ searchText: text });
                                this.filterList(text);
                            }}
                        />

                        <TouchableOpacity style={styles.addButtonContainer} onPress={this.addToContact}>
                            <Icon name='add' style={{ color: '#333' }} />
                        </TouchableOpacity>

                    </View>
                </Header>

                <Content>
                    <UserList source={this.state.contacts} onRowPress={this.openChat} onDelete={this.deleteRow}/>
                </Content>

            </Container>
        );
    }
}


const mapStateToProps = state => ({
    ...BaseComponent.defaltProps(state),
    users: state.contact.contacts,
    currentChatId: state.chat.currentChatId
})

const mapDispatchToProps = (dispatch) => ({
    fetch: () => dispatch(actions.contact.fetchContacts(true)),
    delete: (deleteUserId) => dispatch(actions.contact.deleteContacts(deleteUserId)),
    startChatWithUser: (user) => dispatch(actions.contact.startChatWithUser(user))
})

export default connect(mapStateToProps, mapDispatchToProps)(Contacts)
