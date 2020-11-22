/**
 * This exposes the native ToastExample module as a JS module. This has a
 * function 'show' which takes the following parameters:
 *
 * 1. String message: A string with the text to toast
 * 2. int duration: The duration of the toast. May be ToastExample.SHORT or
 *    ToastExample.LONG
 */
import { NativeModules, View , Platform} from 'react-native';
import React, { Component } from 'react';

const Toast = NativeModules.ToastExample;

export default class ToastComponent extends Component {

    componentDidMount() {
        this.callToast();
    }

    render() {
        return null;
    }

    callToast() {
        if (Platform.OS === 'android') {
            Toast.show('Awesome', Toast.SHORT);
        }
    }
}
