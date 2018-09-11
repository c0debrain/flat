import React, { Component } from "react";
import Dimensions from 'Dimensions';
import { connect } from 'react-redux';
import {
    Text,
    KeyboardAvoidingView,
    TouchableOpacity,
    Image,
    ScrollView
} from "react-native";

import {
    Container,
    ActionSheet,
    Content,
    Form,
    Label,
    Textarea,
    Left,
    Button,
    Icon,
    Item,
    Input
} from "native-base";
import RNFetchBlob from 'rn-fetch-blob'
import ImagePicker from 'react-native-image-crop-picker';
import firebase from 'react-native-firebase';

import * as constants from "../../../../lib/constants";
import { l10n } from "../../../../lib/lang";
import * as utils from "../../../../lib/myutils";
import BaseComponent from "../../BaseContainer";
import * as actions from "../../../../actions";
import AvatarImage from "../../../components/AvatarImage";

const deviceHeight = Dimensions.get("window").height;
const deviceWidth = Dimensions.get("window").width;

const styles = {
    avatartContainer: {
        alignItems: 'center',
        height: deviceHeight / 3,
        justifyContent: 'center',
        width: deviceWidth / 3,
        height: deviceWidth / 3,
        borderRadius: deviceWidth / 6,
        borderWidth: 1,
        borderColor: "#999",
        marginTop:50,
        alignSelf: "center",
        marginBottom:10,
        position: 'relative'
    },
    avatarImage: {
        width: deviceWidth / 3,
        height: deviceWidth / 3,
        borderRadius: deviceWidth / 6,
    },
    cameraButton:{
        position: 'absolute',
        color: '#ccc'
    },
    avatarNote: {
        marginTop: 10,
        fontSize: 12,
        color: "#999",
        alignSelf: "center",
        marginBottom:50
    },
    textarea: {
        width: deviceWidth,
        borderWidth: 0,
        borderColor: 'transparent',
        paddingLeft: 8,
        paddingTop: 5
    },
    button: {
        marginLeft: 10,
        marginRight: 10,
        marginTop: 10,
        marginBottom: 10
    },
    buttonText: {
        color: '#fff'
    }
};

class EditProfile extends BaseComponent {

    state = {
        displayName: this.props.user.displayName,
        status: this.props.user.status,
        avatarPicNew:null,
        avatarPicOld:null
    };


    componentDidUpdate = (prevProps, prevState) => {

        if (prevProps.user != this.props.user) {
        this.getAvatar();
        }

    }

    componentDidMount = () => {

        // get user avatar
        this.getAvatar();
        
    }
    
    getAvatar = async () => {

        // save avatar pic locally to get better quality 
        const myAvatarCachePath = await utils.storageGetItem(constant.storageKeyMyProfileAvatarPath);
        
        
        if(!myAvatarCachePath)
            return;

        
        const isExists = await RNFetchBlob.fs.exists(myAvatarCachePath);

        if (isExists) {

            const result = await RNFetchBlob.fs.readFile(myAvatarCachePath, 'base64');

            if (result) {
                this.setState({
                    avatarPicOld: result
                });
            }

            
        }
    
      }

    save = async () => {

        await this.props.saveProfile({
            displayName: this.state.displayName,
            status: this.state.status,
            avatarPic: this.state.avatarPicNew
        })

        await utils.wait(1);

        this.props.navigation.goBack();

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
            avatarPicNew:pic
        });

    }


    uploadPictureStep1 = () => {

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

        let imageSource = null;

        if(this.state.avatarPicNew){
            imageSource = { uri:"data:" + this.state.avatarPicNew.mime + ";base64," + this.state.avatarPicNew.data};
        } else if(this.state.avatarPicOld){
            imageSource = { uri:"data:image/jpeg;base64," + this.state.avatarPicOld};
        }

        return (
            <Container>

                <Content>

                    <TouchableOpacity onPress={this.uploadPictureStep1} style={styles.avatartContainer}>
                        {imageSource ? <Image style={styles.avatarImage} source={imageSource} /> : null }
                        <Icon name='camera' type='FontAwesome' style={styles.cameraButton}/> 
                    </TouchableOpacity>
                    <Text style={styles.avatarNote}>{l10n('Tap to edit avatar picture')}</Text>

                    <Form style={styles.formContainer}>
                        <Item stackedLabel>
                            <Label>{l10n('Username')}</Label>
                            <Input
                                value={this.state.displayName}
                                onChangeText={text => this.setState({ displayName: text })}
                                placeholder={l10n("Please input your name")} />
                        </Item>

                        <Item stackedLabel>
                            <Label>{l10n('Status')}</Label>
                            <Textarea
                                value={this.state.status}
                                onChangeText={text => this.setState({ status: text })}
                                style={styles.textarea}
                                rowSpan={3} bordered
                                placeholder={l10n('Your status here')} />
                        </Item>

                    </Form>

                    <Button onPress={this.save} style={styles.button} block>
                        <Text style={styles.buttonText}>{l10n('Save')}</Text>
                    </Button>

                </Content>

            </Container>
        );
    }
}


const mapStateToProps = state => ({
    ...BaseComponent.defaltProps(state),
    user: state.auth.currentUser,
    test: state.auth.test
})

const mapDispatchToProps = (dispatch) => ({
    updateAvatar: (path) => dispatch(actions.profile.updateAvatar(path)),
    saveProfile: (data) => dispatch(actions.profile.saveProfile(data)),
})

export default connect(mapStateToProps, mapDispatchToProps)(EditProfile)
