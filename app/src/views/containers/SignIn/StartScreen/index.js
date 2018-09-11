import React, { Component } from "react";
import Dimensions from 'Dimensions';
import Platform from 'Platform';
import { connect } from 'react-redux';
import { ImageBackground, View, StatusBar } from "react-native";
import { Container, Button, H3, Text } from "native-base";

import { l10n } from "../../../../lib/lang"
import BaseComponent from "../../BaseContainer";

const deviceHeight = Dimensions.get("window").height;
const styles = {
  imageContainer: {
    flex: 1,
    width: null,
    height: null
  },
  logoContainer: {
    flex: 1,
    marginTop: deviceHeight / 8,
    alignItems: 'center'
  },
  logo: {
    width: 280,
    height: 124
  },
  text: {
    color: "#fff",
    bottom: 6,
    marginTop: 5
  }
};

const launchscreenBg = require("../../../images/bg.png");
const launchscreenLogo = require("../../../images/logo.png");

class Home extends BaseComponent {

  render() {
    return (
      <Container>
        <StatusBar barStyle="light-content" />
        <ImageBackground source={launchscreenBg} style={styles.imageContainer}>
          <View style={styles.logoContainer}>
            <ImageBackground source={launchscreenLogo} style={styles.logo} />
          </View>
          <View
            style={{
              alignItems: "center",
              marginBottom: 50,
              backgroundColor: "transparent"
            }}
          >
            <H3 style={styles.text}>{l10n("Welcome to Flat Messenger")}</H3>
            <View style={{ marginTop: 8 }} />
            <H3 style={styles.text}>{l10n("Tap the button to signup")}</H3>
            <View style={{ marginTop: 8 }} />
          </View>
          <View style={{ marginBottom: 80 }}>
            <Button
              style={{ backgroundColor: "#444", alignSelf: "center" }}
              onPress={() => this.props.navigation.navigate("SendNumber")}
            >
              <Text>{l10n("Lets Go!")}</Text>
            </Button>
          </View>
        </ImageBackground>
      </Container>
    );
  }
}

const mapStateToProps = state => ({
  ...BaseComponent.defaltProps(state)
})

const mapDispatchToProps = (dispatch) => ({
})

export default connect(mapStateToProps, mapDispatchToProps)(Home)
