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
  imageContainer: {
    flex: 1,
    width: null,
    height: null
  },
  mainLabel: {
    marginTop: deviceHeight / 8,
    alignItems: 'center',
  },
  mainLabelText1: {
    color: '#fff',
    fontSize: 24,
    fontWeight: 'bold'
  },
  mainLabelText2: {
    color: '#fff',
    fontSize: 24
  },
  noteText: {
    color: '#fff9',
    fontSize: 14,
    paddingLeft: 15,
    marginTop: 10
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

class InputUserName extends BaseComponent {

  constructor(props) {
    super(props);
  }

  state = {
    displayName: ""
  };

  save = () => {

    if (this.state.displayName.length < 3) {
      return utils.showWarning(l10n("Name must be more than 3 characters."));
    }

    this.props.send(this.state.displayName);
    
  }

  render() {
    return (
      <Container>

        <StatusBar barStyle="light-content" />

        <ImageBackground source={launchscreenBg} style={styles.imageContainer}>

          <Content>

            <View style={styles.contentContainer}>

              <View style={styles.mainLabel}>
              <Text style={styles.mainLabelText1}>{l10n("Last step!")}</Text>
                <Text style={styles.mainLabelText2}>{l10n("Please inpiut your user name")}</Text>
              </View>

              <Form style={styles.formContainer}>
                <Item floatingLabel>
                  <Label style={{ color: "#fff" }}>{l10n("User Name")}</Label>
                  <Input
                    value={this.state.displayName}
                    onChangeText={text => this.setState({ displayName: text })}
                    style={{ color: "#fff" }}
                  />
                </Item>
                <Text style={styles.noteText}>{l10n("You can change this anytime by editing your profile.")}</Text>
              </Form>

              <View style={styles.buttonContainer}>

                <Button
                  style={{ backgroundColor: "#444", alignSelf: "center" }}
                  onPress={() => this.save()}
                >
                  <Text>{l10n("Start !")}</Text>
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
  send: (name) => dispatch(actions.auth.updateName(name)),
})

export default connect(mapStateToProps, mapDispatchToProps)(InputUserName)
