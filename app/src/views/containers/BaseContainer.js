import React, { Component } from "react";
import { connect } from 'react-redux';

class Base extends Component {

    constructor(props) {
        super(props)
    }

    componentDidUpdate = (prevProps, prevState) => {

        if (prevProps.screen != this.props.screen) {
            this.props.navigation.navigate(this.props.screen.goto)
        }

    }

}

Base.defaltProps = (state) => {
    return {
        screen: state.navigation.screen
    }
}

export default Base
