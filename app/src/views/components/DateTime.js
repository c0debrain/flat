import React, { Component } from 'react';
import {
    Text
} from "react-native";


class DateTime extends Component {

    state = {
        formattedTimeStamp: ""
    }

    //component updates itself each minute for the first 1 minutes or when receiving new props
    componentDidMount() {
        this.intervalID = setInterval(() => this.updateDate(this.props.timestamp), 60000);

        this.setState({
            formattedTimeStamp: this.formatDate(this.props.timestamp)
        })

    }

    componentDidUpdate(prevProps) {

        if (this.props.timestamp && prevProps.timestamp && this.props.timestamp !== prevProps.timestamp) {
            this.setState({
                formattedTimeStamp: this.formatDate(this.props.timestamp)
            })
        }

    }

    updateDate(ut) {
        let interval = (new Date().getTime() - this.props.timestamp) / 1000;

        if (interval < 60 * 60) this.setState({ formattedTimeStamp: this.formatDate(this.props.timestamp) })

        else clearInterval(this.intervalID)

    }

    componentWillUnmount() {
        clearInterval(this.intervalID);
    }

    formatDate(ut) {

        if (!ut || ut === 0)
            return "";

        var date = new Date(ut);
        // hours part from the timestamp
        var hours = date.getHours();
        // minutes part from the timestamp
        var minutes = date.getMinutes();
        // seconds part from the timestamp
        var seconds = date.getSeconds();

        // will display time in 10:30:23 format
        var month = date.getMonth() + 1;
        var day = date.getDate();
        var year = date.getFullYear();

        // dont want include browser detaction library so use this dumb style.

        if (hours < 10)
            hours = '0' + hours;

        if (minutes < 10)
            minutes = '0' + minutes;

        if (seconds < 10)
            seconds = '0' + seconds;

        if (month < 10)
            month = '0' + month;

        if (day < 10)
            day = '0' + day;

        var formattedTime = year + '/' + month + '/' + day;

        var nowDate = new Date();
        var now = new Date().getTime();
        var interval = (now - ut) / 1000;

        if (interval < 60) {
            return 'now';
        }
        else if (interval < 60 * 60) {
            return Math.floor(interval / 60) + " min ago";
        }
        else if (nowDate.getDate() == date.getDate() && nowDate.getMonth() == date.getMonth() && nowDate.getYear() == date.getYear()) {
            return hours + ':' + minutes;
        }
        else {
            formattedTime;
        }


        return formattedTime;
    }

    render() {

        return (
            <Text dateTime={this.props.timestamp} style={{ ...this.props.style }}>
                {this.state.formattedTimeStamp}
            </Text>
        );
    }

}


export default DateTime;
