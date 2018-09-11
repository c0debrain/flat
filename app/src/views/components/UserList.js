import React, { Component } from 'react';
import {
    Text,
    View,
    TouchableOpacity,
    FlatList
} from "react-native";

import {
    SwipeRow,
    Button,
    Icon,
} from "native-base";

import AvatarImage from "./AvatarImage";
import * as utils from "../../lib/myutils";

const styles = {
    statusText: {
        marginTop: 5,
        fontSize: 14,
        color: '#999'
    },
    listRow: {
        flex: 1,
        flexDirection: "row",

    },
    avatarContainer: {
        paddingLeft: 5,
        paddingRight: 5
    },
    thumb: {
        marginLeft: 10,
        width: 45,
        height: 45,
        borderRadius: 22.5
    },
}

class UserList extends Component {

    constructor(props) {
        super(props);
        this.component = [];
        this.selectedRow = null;
    }


    onRowPress = (key) => {
        if(this.props.onRowPress)
            this.props.onRowPress(key)
    }

    onDelete = (key) => {

        if(this.selectedRow && this.selectedRow.root)
            this.selectedRow._root.closeRow();

        if(this.props.onDelete)
            this.props.onDelete(key);
            
    }

    render() {

        return (
            <FlatList
                rightOpenValue={-75}
                data={this.props.source}
                renderItem={({ item }) => <SwipeRow
                    ref={(c) => { this.component[item.key] = c }}
                    rightOpenValue={this.props.onDelete ? -75 : 0 }
                    body={
                        <TouchableOpacity style={styles.listRow} onPress={_ => this.onRowPress(item.userId)}>
                            <View style={styles.avatarContainer}>
                                <AvatarImage 
                                    name={item.displayName}
                                    style={styles.thumb} 
                                    source={item.photoUrl} />
                            </View>
                            <View style={styles.nameContainer}>
                                <Text>{item.displayName}</Text>
                                <Text style={styles.statusText}>{utils.truncate(item.status, 30)}</Text>
                            </View>
                        </TouchableOpacity>
                    }
                    right={
                        <Button full danger onPress={_ => this.onDelete(item.key)}>
                            <Icon active name="trash" />
                        </Button>
                    }
                    onRowOpen={() => {
                        if (this.selectedRow && this.selectedRow !== this.component[item.key]) { 
                            if(this.selectedRow._root) this.selectedRow._root.closeRow(); 
                        }
                        this.selectedRow = this.component[item.key]
                    }}
                />}

            />
        );
    }

}


export default UserList;
