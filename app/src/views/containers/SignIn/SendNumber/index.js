import React, { Component } from "react";
import Dimensions from 'Dimensions';
import { connect } from 'react-redux';
import { 
  ImageBackground, 
  View, 
  StatusBar,
  TouchableOpacity
} from "react-native";

import { 
  Container, 
  Button, 
  H3, 
  Text, 
  Form, 
  Item, 
  Input, 
  Label, 
  Content, 
  Picker,
  Icon
} from "native-base";

import { l10n } from "../../../../lib/lang"
import BaseComponent from "../../BaseContainer";
import * as actions from "../../../../actions";
import * as utils from "../../../../lib/myutils";
import CountryModal from "../../../components/CountryPickerModal";

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
    marginTop: deviceHeight / 8,
    flex: 1,
    flexDirection: 'column'
  },
  buttonContainer: {
    marginBottom: deviceHeight / 8,
  },
  logo: {
    width: 280,
    height: 124
  },
  numberFormatNote: {
    color: '#fff9',
    fontSize: 14,
    paddingLeft: 15,
    marginTop: 10
  },
  textbox:{
    alignItems: 'flex-start'
  },
  pickerText:{
    paddingLeft:5,
    marginTop: 10,
    color: '#fff',
    fontWeight: 'bold'
  },
  textBoxText:{
    paddingLeft:5,
    color: '#fff',
    fontWeight: 'bold'
  }

};

const launchscreenBg = require("../../../images/bg.png");
const launchscreenLogo = require("../../../images/logo.png");

class SendNumber extends BaseComponent {

  constructor(props) {
    super(props);
  }

  state = {
    telnum: ""
  };

  sendNumber = () => {

    if (!/^[0-9]+$/.test(this.state.telnum)) {
      return utils.showWarning(l10n("Please input only numbers."));
    }

    let localTelNum = this.state.telnum;
    const firstLetter = this.state.telnum.substr(0,1);

    console.log('firstLetter',firstLetter);
    
    if(firstLetter == '0')
      localTelNum = localTelNum.substr(1);

    this.props.send(this.props.countryCode + localTelNum);

  }

  countrySelected = (val) => {

    this.setState({
      country: val
    });
    //console.log(e);
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

                <View style={{flex:3}}>

                  <Item stackedLabel style={styles.textbox}>
                    <Label style={{ color: "#fff" }}>{l10n("Country Code")}</Label>
                    <TouchableOpacity onPress={this.props.showCountryList}>

                      {this.props.countryCode ? <Text style={styles.pickerText}>{this.props.countryCode}</Text> :
                        <Text style={styles.pickerText}>{l10n("Please select country")}</Text>}
                    </TouchableOpacity>
                  </Item>

                </View>

                <View style={{flex:5}}>

                  <Item stackedLabel style={styles.textbox}>
                    <Label style={{ color: "#fff" }}>{l10n("Telephone Number")}</Label>
                    <Input
                      value={this.state.telnum}
                      onChangeText={text => this.setState({ telnum: text })}
                      style={styles.textBoxText}
                      keyboardType="phone-pad"
                    />
                  </Item>
                  <Text style={styles.numberFormatNote}>{l10n("Please input without country code")}</Text>
                  
                </View>

              </Form>

              <View style={styles.buttonContainer}>

                <Button
                  style={{ backgroundColor: "#444", alignSelf: "center" }}
                  onPress={() => this.sendNumber()}
                >
                  <Text>{l10n("Send Number")}</Text>

                </Button>

              </View>

            </View>

          </Content>

        </ImageBackground>

        <CountryModal />

      </Container >

    );
  }
}


const mapStateToProps = state => ({
  ...BaseComponent.defaltProps(state),
  countryCode:state.auth.countryCode
})

const mapDispatchToProps = (dispatch) => ({
  send: (tel) => dispatch(actions.auth.sendNumber(tel)),
  showCountryList: () => dispatch(actions.auth.showCountryList(true)),
})

export default connect(mapStateToProps, mapDispatchToProps)(SendNumber)
