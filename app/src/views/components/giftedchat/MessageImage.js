/* eslint no-use-before-define: ["error", { "variables": false }] */

import PropTypes from 'prop-types';
import React from 'react';
import md5 from 'md5';
import { Image, StyleSheet, View, ViewPropTypes } from 'react-native';
import Lightbox from 'react-native-lightbox';
import RNFetchBlob from 'rn-fetch-blob'

export default class MessageImage extends React.Component {

  state = {
    imageSource : null
  }

  constructor(props) {
    super(props);
  }

  showImageFromCache = () => {

    if(!this.props.currentMessage.image)
      return;

    (async() => {

      const imageUrl = this.props.currentMessage.image;

      const dir = RNFetchBlob.fs.dirs.CacheDir;
      const fileName = md5(imageUrl);
      const filePath = dir + "/" + fileName + ".jpg";

      // check cache existance
      const isExists = await RNFetchBlob.fs.exists(filePath);

      if (isExists) {
        const base64 = await RNFetchBlob.fs.readFile(filePath, 'base64');
        if (base64) {
            return this.setState({
              imageSource : { uri: "data:image/jpeg;base64," + base64}
            });
        }
      }

      // Download Image
      const res = await RNFetchBlob.config({
        fileCache: false
      }).fetch('GET', imageUrl);

      const base64 = await res.base64();

      this.setState({
        imageSource : { uri: "data:image/jpeg;base64," + base64}
      });

      // write to cache
      await RNFetchBlob.fs.writeFile(filePath, base64, 'base64')

    })();

  }

  componentDidUpdate = (prevProps,prevState) => {

    if(prevProps.currentMessage.image != this.props.currentMessage.image){
      this.showImageFromCache();
    }

  }

  componentWillMount = () => {

    this.showImageFromCache();
    
  }

  render() {

    const {
      containerStyle,
      lightboxProps,
      imageProps,
      imageStyle,
      currentMessage,
    } = this.props;

    return (
      <View style={[styles.container, containerStyle]}>
        <Lightbox
          activeProps={{
            style: styles.imageActive,
          }}
          {...lightboxProps}
        >
          <Image
            {...imageProps}
            style={[styles.image, imageStyle]}
            source={this.state.imageSource}
          />
        </Lightbox>
      </View>
    );
  }

}

const styles = StyleSheet.create({
  container: {},
  image: {
    width: 150,
    height: 100,
    borderRadius: 13,
    margin: 3,
    resizeMode: 'cover',
  },
  imageActive: {
    flex: 1,
    resizeMode: 'contain',
  },
});

MessageImage.defaultProps = {
  currentMessage: {
    image: null,
  },
  containerStyle: {},
  imageStyle: {},
  imageProps: {},
  lightboxProps: {},
};

MessageImage.propTypes = {
  currentMessage: PropTypes.object,
  containerStyle: ViewPropTypes.style,
  imageStyle: Image.propTypes.style,
  imageProps: PropTypes.object,
  lightboxProps: PropTypes.object,
};
