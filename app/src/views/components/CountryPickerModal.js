import React, { Component } from "react";
import Dimensions from 'Dimensions';
import { connect } from 'react-redux';
import {
    Text,
    View,
    ActivityIndicator,
    Modal,
    TouchableOpacity,
    FlatList
} from "react-native";

import {
    Container,
    Icon,
} from "native-base";

import { l10n } from "../../lib/lang";
import * as utils from "../../lib/myutils";
import * as actions from "../../actions";
import AvatarImage from "./AvatarImage";
import TabNavigationService from "./TabNavigationService";
import CountryCodes from "../../lib/countryCodes";

const deviceHeight = Dimensions.get("window").height;
const deviceWidth = Dimensions.get("window").width;

const styles = {
    content:{
        height: '100%',
        flex:1,
        flexDirection: 'column',
    },
    headerContainer:{
        flex:1,
        paddingTop:15,
        paddingBottom:10,
        backgroundColor:"#F7F7F7",
        borderBottomColor: '#CCCCCC',
        borderBottomWidth: 1,
        flexDirection: 'row',
        justifyContent: 'space-between'
    },
    headerLeft:{
        width:75,
        height:'100%',
        paddingTop:10,
        flexDirection: 'column',
        justifyContent: 'center',
        alignItems: 'flex-start'
    },
    headerCenter:{
        width: deviceWidth - 150,
        height:'100%',
        paddingTop:10,
        flexDirection: 'row',
        justifyContent: 'center',
        alignItems: 'center'
    },
    headerRight:{
        width:75,
        height:'100%',
        paddingTop:10,
        flexDirection: 'row',
        justifyContent: 'center',
        alignItems: 'flex-start'
    },
    backButton:{
        color:'#242424'
    },
    backButtonTouch:{
        width:50,
        height:'100%',
        flexDirection: 'column',
        justifyContent: 'center',
        alignItems: 'center'
    },
    countryListContaier:{
        width:'100%',
        flex: 12
    },
    countryList:{
        height: '100%',
        width: '100%'
    },
    listRow:{
        paddingTop: 15,
        paddingBottom: 15,
        borderBottomWidth: 1,
        borderBottomColor: '#eee',
        paddingLeft: 15,
        paddingRight: 15
    },
    listText:{
        color: '#222',
        fontSize: 14
    },
    listIcon:{
        color: '#222',
        fontSize: 14,
        position: 'absolute',
        right: 0,
        top: 0
    }
};

class CountryPickerModal extends Component {

    onRowPress = (code) => {
        this.props.select(code);
        this.props.close();
    }

    render() {

        return (
            <Modal
                animationType="slide"
                transparent={false}
                visible={this.props.visible}
                onRequestClose={() => {
                    alert('Modal has been closed.');
                }}>
                
                <Container>

                    <View style={styles.content}>

                        <View style={styles.headerContainer}>

                            <View style={styles.headerLeft} >
                                <TouchableOpacity onPress={this.props.close} style={styles.backButtonTouch}>
                                    <Icon name='angle-left' type='FontAwesome' style={styles.backButton}/>
                                </TouchableOpacity>
                            </View>
                            <View style={styles.headerCenter} >
                                <Text style={styles.chatTitleText}>{l10n('Please select Country')}</Text>
                            </View>
                            <View style={styles.headerRight} >

                            </View>

                        </View>

                        <View style={styles.countryListContaier}>
                            <FlatList
                                style={styles.countryList}
                                data={CountryCodes}
                                keyExtractor={(item, index) => item.name}
                                renderItem={({ item }) => <View 
                                            style={styles.listRow} >

                                        <TouchableOpacity 
                                            style={styles.listRowContainer} 
                                            onPress={_ => this.onRowPress(item.dial_code)} >

                                            <Text style={styles.listText}>{`${item.name}` + " (" + `${item.dial_code}` + ")"}</Text>
                                            <Icon style={styles.listIcon} name="arrow-forward" />

                                         </TouchableOpacity>
                                    </View>
                                }

                            />
                        </View>

                    </View>

                </Container>

            </Modal>
        );
    }
}


const mapStateToProps = state => ({
    visible: state.auth.showCountryPicker,
})

const mapDispatchToProps = (dispatch) => ({
    close: () => dispatch(actions.auth.showCountryList(false)),
    select: (code) => dispatch(actions.auth.selectCountryCode(code)),
})

export default connect(mapStateToProps, mapDispatchToProps)(CountryPickerModal)
