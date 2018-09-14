/* eslint no-use-before-define: ["error", { "variables": false }] */
import PropTypes from 'prop-types';
import React from 'react';
import { ActivityIndicator, StyleSheet, Text, View, ViewPropTypes } from 'react-native';

export default class MessageSending extends React.Component {

  constructor(props) {
    super(props);
  }

  render() {

    return (
      <View
        style={[
          styles[this.props.position].container,
          this.props.containerStyle[this.props.position],
        ]}
      >
        <ActivityIndicator size="small" color="#fff" />

      </View>
    );
  }

}

const textStyle = {
  fontSize: 16,
  lineHeight: 20,
  marginTop: 5,
  marginBottom: 5,
  marginLeft: 10,
  marginRight: 10,
};

const styles = {
  left: StyleSheet.create({
    container: {},
    text: {
      color: 'black',
      ...textStyle,
    },
    link: {
      color: 'black',
      textDecorationLine: 'underline',
    },
  }),
  right: StyleSheet.create({
    container: {
      width: 150,
      height: 100,
      flex:1,
      flexDirection: 'column',
      justifyContent: 'center',
      alignItems: 'center'
    },
    text: {
      color: 'white',
      ...textStyle,
    },
    link: {
      color: 'white',
      textDecorationLine: 'underline',
    },
  }),
};

MessageSending.defaultProps = {
  position: 'left',
  currentMessage: {
    text: '',
  },
  containerStyle: {}
};

MessageSending.propTypes = {
  position: PropTypes.oneOf(['left', 'right']),
  currentMessage: PropTypes.object,
  containerStyle: PropTypes.shape({
    left: ViewPropTypes.style,
    right: ViewPropTypes.style,
  })
};
