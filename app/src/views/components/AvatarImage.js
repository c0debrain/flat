import React, { Component } from "react";
import Dimensions from 'Dimensions';
import { Image } from "react-native";
import RNFetchBlob from 'rn-fetch-blob'
import md5 from 'md5';
import ImageResizer from 'react-native-image-resizer';

import { GiftedAvatar } from './giftedchat/GiftedChat';

import * as utils from "../../lib/myutils"
import consts from "../../lib/constants"

const deviceHeight = Dimensions.get("window").height;
const styles = {
};


const defaultAvatar = require("../images/defaultAvatar.png");

// file scope
const counter = 0;
let queue = [];

function addToQueue(avatarImage){

    let toInitiate = false;

    if(queue.length == 0)
        toInitiate = true;

    queue.push(avatarImage);
 
    if(toInitiate)
        processNext();

}

function removeFromQueue(avatarImage){

    queue = queue.filter( obj => {
        return obj != avatarImage;
    });

}

async function processNext(){
    
    const target = queue[0];

    if(target)
        await target._showImage();
    
    if(queue.length > 0){
        queue.shift();

        await processNext();
    }
    

}

class AvatarImage extends Component {

    state = {
        base64Image: null
    }

    constructor(props) {
        super(props);
        this.mounted = false;
    }

    showImage = async () => {
        await addToQueue(this);
    }

    _showImage = async () => {

        if(!this.mounted)
            return;

        if(!this.props.source){
            return this.setState({
                base64Image: null
            });
        }

        // cache
        const dir = RNFetchBlob.fs.dirs.CacheDir;
        const fileName = md5(this.props.source);
        const filePath = dir + "/" + fileName + ".jpg";

        const isExists = await RNFetchBlob.fs.exists(filePath);

        if (isExists) {

            const result = await RNFetchBlob.fs.readFile(filePath, 'base64');

            if (result) {

                return this.setState({
                    base64Image: result
                });

            }

        }

        if (!this.props.source) {
            return this.setState({
                base64Image: null
            });
        }

        const res = await RNFetchBlob.config({
            fileCache: false
        }).fetch('GET', this.props.source);

         //shrinc image

        const base64 = await res.base64();

        this.setState({
            base64Image: base64
        });

        let result = await RNFetchBlob.fs.writeFile(filePath, base64, 'base64')

        const imageResizeResult = await ImageResizer.createResizedImage(
                filePath, 
                consts.cacheImageSize, 
                consts.cacheImageSize, 
                'JPEG', 
                80, 
                0);

        // override with resized image

        if(imageResizeResult){
            await RNFetchBlob.fs.unlink(filePath);
            await RNFetchBlob.fs.cp(imageResizeResult.path,filePath);
        }

    }

    componentDidMount = () => {
        this.mounted = true;
        this.showImage();
    }

    componentDidUpdate = (prevProps, prevState) => {
        
        if(prevProps.source != this.props.source){
            this.showImage();
        }
    }

    componentWillUnmount = () => {
        this.mounted = false;
        removeFromQueue(this);
    }

    render() {

        let source = this.state.base64Image;

        const user = {};

        if(source){

            source = { uri: "data:image/jpeg;base64," + source };

            user.avatar = () => {
                return <Image style={{ ...this.props.style }} source={source} />
            }

            user.name = this.props.name;

        }

        else if(this.props.name)
            user.name = this.props.name;
        
        else{
            user.avatar = () => {
                return <Image style={{ ...this.props.style }} source={defaultAvatar} />
            }
            user.name = this.props.name;
        }

        return (
            <GiftedAvatar 
                style={{ ...this.props.style }} 
                avatarStyle={{ ...this.props.style }} 
                textStyle={this.props.textStyle}
                user={user} />
        );


    }
}

export default AvatarImage;
