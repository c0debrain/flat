import React, { Component } from "react";
import Dimensions from 'Dimensions';
import { connect } from 'react-redux';
import { Animated, View, Text, ActivityIndicator } from "react-native";
import { createSwitchNavigator, createStackNavigator } from 'react-navigation';
import { Root } from 'native-base';

import { l10n } from "../lib/lang"
import AuthLoadingScreen from './containers/AuthLoadingScreen'
import StartScreen from './containers/SignIn/StartScreen'
import SendNumberScreen from './containers/SignIn/SendNumber'
import CheckCodeScreen from './containers/SignIn/CheckCode'
import InputUserNameScreen from './containers/SignIn/InputUserName'

import MessengerTopScroon from './containers/Messenger'

import TopNavigationService from './components/TopNavigationService';

const MessengerStack = createStackNavigator({
    History: {
        screen: MessengerTopScroon,
        navigationOptions: ({ navigation }) => ({
            header: null
        }),
    }
});

const AuthStack = createStackNavigator({
    Start: {
        screen: StartScreen,
        navigationOptions: ({ navigation }) => ({
            header: null
        }),
    },
    SendNumber: {
        screen: SendNumberScreen,
        navigationOptions: ({ navigation }) => ({
            header: null
        }),
    },
    CheckCode: {
        screen: CheckCodeScreen,
        navigationOptions: ({ navigation }) => ({
            header: null
        }),
    },
    InputUserName: {
        screen: InputUserNameScreen,
        navigationOptions: ({ navigation }) => ({
            header: null
        }),
    },
});

const Navigator = createSwitchNavigator(
    {
        AuthLoading: AuthLoadingScreen,
        Messenger: MessengerStack,
        Auth: AuthStack,
    },
    {
        initialRouteName: 'AuthLoading',
        //initialRouteName: 'Messenger'
    }
);

const deviceHeight = Dimensions.get("window").height;
const deviceWidth = Dimensions.get("window").width;

const styles = {
    loadingContainer: {
        backgroundColor: "#fff",
        height: 50,
        alignItems: 'center',
        justifyContent: 'center',
        flex: 1,
        flexDirection: 'row',
        position: 'absolute',
        width: deviceWidth,
        zIndex: 100,
        top: 0,
        paddingTop: 20
    },
    loadingText: {
        color: '#222',
        marginLeft: 10
    }
};

class AnimationView extends React.Component {

    constructor(props) {
        super(props);
        this.animationVal = new Animated.Value(-50);
    }

    componentDidUpdate = (prevProps, prevState) => {

        if (prevProps.loading != this.props.loading) {

            // show
            if (this.props.loading) {

                Animated.timing(
                    this.animationVal,
                    {
                        toValue: 0,
                        duration: 300,
                        useNativeDriver: true,
                    }
                ).start();

            } else {
                // hide

                Animated.timing(
                    this.animationVal,
                    {
                        toValue: -50,
                        duration: 300,
                        useNativeDriver: true,
                    }
                ).start();

            }

        }

    }

    render() {

        return (
            <Animated.View
                style={{
                    ...this.props.style,
                    transform: [{
                        translateY: this.animationVal
                    }]
                }}
            >
                {this.props.children}
            </Animated.View>
        );
    }
}

class AppRoot extends Component {

    constructor(props) {
        super(props)
    }

    state = {
        loadingAnim: new Animated.Value(0.01),
    }

    render() {
        return (
            <Root>

                <Navigator 
                    ref={navigatorRef => {
                        TopNavigationService.setTopLevelNavigator(navigatorRef);
                    }}
                />

                <AnimationView style={styles.loadingContainer} loading={this.props.loading}>
                    <ActivityIndicator size="small" color="#222" />
                    <Text style={styles.loadingText}>{this.props.loadingMessage}</Text>
                </AnimationView>

            </Root >
        );
    }

}

const mapStateToProps = state => ({
    loading: state.general.loading,
    loadingMessage: state.general.loadingMessage
})

const mapDispatchToProps = (dispatch) => ({
})

export default connect(mapStateToProps, mapDispatchToProps)(AppRoot)

