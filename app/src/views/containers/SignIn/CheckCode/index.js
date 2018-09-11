import React, { Component } from "react";
import Dimensions from 'Dimensions';
import { connect } from 'react-redux';
import { ImageBackground, View, StatusBar, ScrollView, Alert } from "react-native";
import { Container, Button, H3, Text, Form, Item, Input, Label, Content } from "native-base";

import { l10n } from "../../../../lib/lang"
import BaseComponent from "../../BaseContainer";
import * as actions from "../../../../actions";
import * as utils from "../../../../lib/myutils";

const deviceHeight = Dimensions.get("window").height;
const styles = {
  contentContainer: {
    flex: 1,
    flexDirection: 'column',
    justifyContent: 'space-between',
    height: deviceHeight
  },
  logoContainer: {
    marginTop: deviceHeight / 8,
    alignItems: 'center',
  },
  imageContainer: {
    flex: 1,
    width: null,
    height: null
  },
  formContainer: {
  },
  buttonContainer: {
    height: deviceHeight / 8,
    marginBottom: deviceHeight / 8,
    justifyContent: 'center',
    alignItems: 'center',
    flexDirection: 'row',
  },
  button: {
    marginRight: 10
  },
  logo: {
    width: 280,
    height: 124
  },

};

const launchscreenBg = require("../../../images/bg.png");
const launchscreenLogo = require("../../../images/logo.png");

class CheckCode extends BaseComponent {

  constructor(props) {
    super(props);
  }

  state = {
    code: ""
  };

  sendCode = () => {

    if (!/^[0-9]{6}$/.test(this.state.code)) {
      return utils.showWarning(l10n("Please input 6 digit numbers."));
    }

    this.props.send(this.state.code);
  }

  render() {
    return (
      <Container>

        <StatusBar barStyle="light-content" />

        <ImageBackground source={launchscreenBg} style={styles.imageContainer}>

          <Content>

            <View style={styles.contentContainer}>

              <View style={styles.logoContainer}>
                <ImageBackground source={launchscreenLogo} style={styles.logo} />
              </View>

              <Form style={styles.formContainer}>
                <Item floatingLabel>
                  <Label style={{ color: "#fff" }}>{l10n("Verification Code")}</Label>
                  <Input
                    value={this.state.code}
                    onChangeText={text => this.setState({ code: text })}
                    style={{ color: "#fff" }}
                    keyboardType="phone-pad"
                  />
                </Item>
              </Form>

              <View style={styles.buttonContainer}>

                <Button
                  style={{ backgroundColor: "#f44", alignSelf: "center", marginRight: 10 }}
                  onPress={() => this.props.navigation.goBack()}
                >
                  <Text>{l10n("Back")}</Text>
                </Button>

                <Button
                  style={{ backgroundColor: "#444", alignSelf: "center" }}
                  onPress={() => this.sendCode()}
                >
                  <Text>{l10n("Send Code")}</Text>
                </Button>

              </View>

            </View>

          </Content>

        </ImageBackground>

      </Container>
    );
  }
}


const mapStateToProps = state => ({
  ...BaseComponent.defaltProps(state)
})

const mapDispatchToProps = (dispatch) => ({
  send: (code) => dispatch(actions.auth.verifyCode(code)),
})

export default connect(mapStateToProps, mapDispatchToProps)(CheckCode)
