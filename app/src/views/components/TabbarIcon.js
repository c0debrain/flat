import React, { Component } from "react";
import { connect } from 'react-redux';

import { 
    View,
    Text
} from "react-native";

import {
    Icon,
    Badge
} from "native-base";

const styles = {

    holder:{
        position:'relative'
    },
    icon:{

    },
    badge:{
        position:'absolute',
        right:0,
        top:0,
        width:10,
        height:10,
        borderRadius:5,
        backgroundColor:'#c00'
    }
}
class TabbarIcon extends Component {

    render() {
        
        let showUnreadIcon = false;

        Object.keys(this.props.history)
            .map( key => this.props.history[key])
            .forEach( chat => {

                if(!this.props.chatOpenLogs)
                    return;

                
                const lastOpened = this.props.chatOpenLogs[chat.chatId] ? 
                    this.props.chatOpenLogs[chat.chatId] : 0;

                const lastMessage = chat.lastMessage ?
                    chat.lastMessage.createdAt : 0;

                if(lastMessage > lastOpened)
                    showUnreadIcon = true

        });

        return <View style={styles.holder}>
            <Icon 
                name={this.props.name} 
                type="MaterialIcons"
                style={{...styles.icon,fontSize: 24, color: this.props.tintColor }} />

            {this.props.name == 'chat' &&
                showUnreadIcon ? <View style={styles.badge}></View> : null }

        </View>

    }
    
}

const mapStateToProps = state => ({
    history: state.chat.history,
    chatOpenLogs: state.history.chatOpenLogs
})

const mapDispatchToProps = (dispatch) => ({
})

export default connect(mapStateToProps, mapDispatchToProps)(TabbarIcon)

