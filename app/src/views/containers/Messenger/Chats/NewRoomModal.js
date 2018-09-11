import React, {Component} from 'react';
import Dimensions from 'Dimensions';
import {
    Modal, 
    Text, 
    TouchableOpacity, 
    View,
    ScrollView,
    Image
} from 'react-native';
import ImagePicker from 'react-native-image-crop-picker';

import { connect } from 'react-redux';

import {
    Icon,
    Form,
    Item,
    ActionSheet,
    Input
  } from "native-base";

import AvatarImage from "../../../components/AvatarImage";
import UserList from "../../../components/UserList";
import { l10n } from "../../../../lib/lang";
import * as utils from "../../../../lib/myutils";
import * as actions from "../../../../actions";

const deviceHeight = Dimensions.get("window").height;
const deviceWidth = Dimensions.get("window").width;

const styles = {
    mainContainer:{
        flex:1,
        flexDirection: 'column'
    },
    headerContainer:{
        flex:1,
        paddingTop:10,
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
    formsContainer:{
        flex:10,
        flexDirection: 'column'
    },
    createTextDisabled:{
        color:'#ccc'
    },
    createTextEnabled:{
        color:'#222'
    },
    avatarNameContainer:{
        flex:2,
        flexDirection: 'row',
        alignItems: 'center',
    },
    avatarContainer:{
        marginTop:10,
        marginLeft:30,
        borderBottomColor:'#ccc',
        borderBottomWidth: 1,
        borderTopColor:'#ccc',
        borderTopWidth: 1,
        borderRightColor:'#ccc',
        borderRightWidth: 1,
        borderLeftColor:'#ccc',
        borderLeftWidth: 1,
        width:40,
        height:40,
        borderRadius: 20,
        justifyContent: 'center',
        alignItems: 'center'
    },
    nameContainer:{
        marginTop:10,
        marginBottom:10,
        marginRight:80,
    },
    cameraButton:{
        color:'#ccc',
        fontSize: 18
    },
    cameraButtonImage:{
        width:40,
        height:40,
        borderRadius:20,
    },
    selectedUserContainer:{
        flex:3
    },
    selectedUserRow:{
        flex:1,
        flexDirection: 'column',
        justifyContent: 'center',
        alignItems: 'center',
        width:50,
        height:'100%',
        position: 'relative'
    },
    selectedUserImage:{
        width:35,
        height:35,
        borderRadius: 17.5
    },
    selectedUserName:{
        fontSize: 10,
        color:"#666"
    },
    selectedDeleteIconHolder:{
        position: 'absolute',
        width:18,
        height:19,
        borderRadius:9,
        backgroundColor: "#fff",
        right:3,
        top:3,
        justifyContent: 'center',
        alignItems: 'center'
    },
    selectedDeleteIcon:{
        fontSize: 15,
        color:"#944"
    },
    searchBarContainer:{
        flex:1,
        backgroundColor: "#f3f3f3",
        padding: 5,
    },
    searchInput:{
        backgroundColor: "#fff",
        padding: 5,
        paddingLeft:10,
        borderBottomWidth: 0,
        height: '100%'
    },
    searchIcon:{
        paddingTop:5,
        color:'#ccc',
        fontSize: 24
    },
    userListContainer:{
        flex:8
    }
};


class NewRoomModal extends Component {

    state = {
        modalVisible: false,
        filteredUsers: [],
        searchText: "",
        selectedUsers: [],
        avatarPic: null,
        groupName: ""
    };

    onBack = () => {
        this.props.setVisible(false);
    }

    onCreate = () => {

        if(this.state.groupName.length == 0)
            return;

        this.props.setVisible(false);

        (async() => {

            await this.props.createNewRoom({
                name:this.state.groupName,
                pic:this.state.avatarPic,
                users:this.state.selectedUsers
            });


        })();


    }

    filterList = (keyword) => {

        this.setState({
            filteredUsers:this.props.users.filter((user) => {

                if(this.state.selectedUsers.find( selectedUser => user.userId == selectedUser.userId))
                    return false;

                if (!keyword || keyword.length == 0)
                    return true;

                const re = new RegExp("^" + keyword + ".*","i");
                return re.test(user.displayName);
            })
        });

    }

    componentDidUpdate = (prevProps, prevState) => {
        if (prevProps.users != this.props.users) {
            this.filterList(this.state.searchText);
        }
        if (prevState.selectedUsers != this.state.selectedUsers){
            this.filterList(this.state.searchText);
        }
        if (prevState.groupName != this.state.groupName){
            
        }
        if(prevProps.showNewRoomModal != this.props.showNewRoomModal &&
            this.props.showNewRoomModal === false){

                // reset values when close
                this.setState({
                    modalVisible: false,
                    filteredUsers: [],
                    searchText: "",
                    selectedUsers: [],
                    avatarPic: null,
                    groupName: ""
                });
            
        }
    }

    componentDidMount = () => {

        // reset data

        (async() => {

            await this.props.fetch();
            this.filterList(this.state.searchText);
            
        })();

    }

    addUser = (userId) => {
        const selectedUser = this.props.users.find( user => user.userId == userId);  
        
        this.setState({
            selectedUsers: this.state.selectedUsers.concat([selectedUser])
        });

    }

    deselectUser = (userId) => {

        const selectedUser = this.state.selectedUsers.filter( user => user.userId != userId);  

        this.setState({
            selectedUsers: selectedUser
        });
        
    }

    takePicture = async (source) => {

        let pic = null;

        if (source == 'camera') {

            pic = await ImagePicker.openCamera({
                width: constant.picSize,
                height: constant.picSize,
                cropping: true,
                includeBase64: true,
            });

        } else {

            pic = await ImagePicker.openPicker({
                width: constant.picSize,
                height: constant.picSize,
                cropping: true,
                includeBase64: true,
            });

        }

        if (!pic)
            return;

        this.setState({
            avatarPic:pic
        })

    }

    setPictureStep1 = () => {

        // show action sheet
        ActionSheet.show(
            {
                options: [l10n('Camera'), l10n('Photos'), l10n('Cancel')],
                cancelButtonIndex: 3,
                title: l10n("Please choose source...")
            },
            buttonIndex => {
                if (buttonIndex == 0) {

                    this.takePicture('camera');

                } else if (buttonIndex == 1) {

                    this.takePicture('library');

                }
            }
        )

    }

    render() {
        return (
            <Modal
                animationType="slide"
                transparent={false}
                visible={this.props.visible}
                onRequestClose={() => {
                    alert('Modal has been closed.');
                }}>


                <View style={styles.mainContainer}>
                    
                    <View style={styles.headerContainer}>

                        <View style={styles.headerLeft} >
                            <TouchableOpacity onPress={this.onBack} style={styles.backButtonTouch}>
                                <Icon name='angle-left' type='FontAwesome' style={styles.backButton}/>
                            </TouchableOpacity>
                        </View>
                        <View style={styles.headerCenter} >
                            <Text style={styles.chatTitleText}>{l10n('New Conversation')}</Text>
                        </View>
                        <View style={styles.headerRight} >
                            <TouchableOpacity onPress={this.onCreate} style={styles.backButtonTouch}>
                                <Text 
                                    style={this.state.groupName.length > 0 ? styles.createTextEnabled : styles.createTextDisabled }>
                                    {l10n('Create')}
                                </Text>
                            </TouchableOpacity>
                        </View>
                    </View>

                    <View style={styles.formsContainer}>

                        <Form style={styles.avatarNameContainer}>
                            
                            <TouchableOpacity 
                                style={styles.avatarContainer}
                                onPress={this.setPictureStep1}>

                                {this.state.avatarPic ? 
                                    <Image source={{ uri: "data:" + this.state.avatarPic.mime + ";base64," + this.state.avatarPic.data}} style={styles.cameraButtonImage}/> :
                                    <Icon name='camera' type='FontAwesome' style={styles.cameraButton}/> 
                                }
                            </TouchableOpacity>

                            <Item style={styles.nameContainer}>
                                <Input
                                    onChangeText={(text) => {
                                        this.setState({ groupName: text });
                                    }}
                                    value={this.state.groupName}
                                    placeholder={l10n('Enter Group Name')}
                                />
                            </Item>

                        </Form>

                        <ScrollView 
                            horizontal={true}
                            style={styles.selectedUserContainer}>

                            {this.state.selectedUsers.map( user => {

                                let name = user.displayName;
                                if(name){
                                    const nameSplitted = user.displayName.split(" ");
                                    name = nameSplitted[0];
                                }

                                return <TouchableOpacity 
                                            key={user.userId} 
                                            style={styles.selectedUserRow}
                                            onPress={ e => this.deselectUser(user.userId)}
                                            key={user.userId}>

                                    <AvatarImage style={styles.selectedUserImage} source={user.photoUrl}/>
                                    <Text 
                                        numberOfLines={1}
                                        style={styles.selectedUserName}
                                    >   
                                        {utils.truncate(user.displayName,6,"")}
                                    </Text>
                                    <View style={styles.selectedDeleteIconHolder}>
                                        <Icon style={styles.selectedDeleteIcon} type="FontAwesome" name='times-circle' />
                                    </View>
                                    
                                </TouchableOpacity>

                            })}

                        </ScrollView>

                        <View style={styles.searchBarContainer}>

                            <Item style={styles.searchInput}>
                                <Icon style={styles.searchIcon} name='search' />
                                <Input 
                                    onChangeText={(text) => {
                                        this.setState({ searchText: text });
                                        this.filterList(text);
                                    }}
                                    value={this.state.searchText}
                                    style={styles.searchText} 
                                    placeholder='Search Users'/>
                            </Item>

                        </View>

                        <View style={styles.userListContainer}>

                            <UserList 
                                source={this.state.filteredUsers} 
                                onRowPress={this.addUser} />

                        </View>

                    </View>
                </View>

            </Modal>
        );
    }
}


const mapStateToProps = state => ({
    users: state.contact.contacts,
    showNewRoomModal: state.chat.showNewRoomModal
})

const mapDispatchToProps = (dispatch) => ({
    fetch: () => dispatch(actions.contact.fetchContacts(true)),
    setVisible: (visible) => dispatch(actions.chat.setNewRoomModalVisible(visible)),
    createNewRoom: (params) => dispatch(actions.newRoom.create(params)),
})
  
export default connect(mapStateToProps, mapDispatchToProps)(NewRoomModal)