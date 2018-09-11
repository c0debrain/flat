import React from 'react';
import { l10n } from "../../lib/lang"
import * as utils from '../../lib/myutils'
import { connect } from 'react-redux';

import {
  Text,
  Animated,
  View,
} from 'react-native';

import {
  getCurrentUser,
  checkInitialUser
} from '../../lib/backend/';

import * as actions from "../../actions";

const styles = {
  mainContainer: {
    backgroundColor: '#36C891',
    flex: 1, 
    alignItems: 'center', 
    justifyContent: 'center' 
  },
  loadingText :{
    color: '#fff'
  }
};

class AuthLoadingScreen extends React.Component {

  state = {
    fadeAnim: new Animated.Value(0), 
  }

  constructor(props) {
    super(props);
    this._bootstrapAsync();
  }

  // Fetch the token from storage then navigate to our appropriate place
  _bootstrapAsync = async () => {

    const user = await getCurrentUser();

    // generate default profile is user is not existed in database
    if (user) {
      const userProfile = await checkInitialUser(user);
      this.props.saveUser(userProfile);
      utils.showInfo(l10n('Auto Signin'));
    }

    this.props.navigation.navigate(user ? 'Messenger' : 'Auth');

  };

  cycleAnimation = () => {

    Animated.sequence([
      Animated.timing(
        this.state.fadeAnim,
        {
          toValue: 1, 
          duration: 500,
          useNativeDriver: true
        }
      ),
      Animated.timing(
        this.state.fadeAnim,
        {
          toValue: 0, 
          duration: 500,
          useNativeDriver: true
        }
      )
    ]).start(() => {
      this.cycleAnimation();
    });

  }

  componentDidMount = () => {
    this.cycleAnimation();
  }

  render() {

    let { fadeAnim } = this.state;

    return (
      <View style={styles.mainContainer}>

        <Animated.View
          style={{
            opacity: fadeAnim,
          }}
        >
          <Text style={styles.loadingText} >{l10n('Loading...')}</Text>
        </Animated.View>

      </View>
    );
  }
}

const mapStateToProps = state => ({
})

const mapDispatchToProps = (dispatch) => ({
  saveUser: (user) => dispatch(actions.auth.saveUser(user)),
})

export default connect(mapStateToProps, mapDispatchToProps)(AuthLoadingScreen)
