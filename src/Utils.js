/**
 * This exposes the native ToastExample module as a JS module. This has a
 * function 'show' which takes the following parameters:
 *
 * 1. String message: A string with the text to toast
 * 2. int duration: The duration of the toast. May be ToastExample.SHORT or
 *    ToastExample.LONG
 */
import { NativeModules, Platform} from 'react-native';
import React, { Component } from 'react';

const Utils = NativeModules.UtilsExample;

export default class CallbackExample extends Component {

    componentDidMount() {
        this.callUtils();
    }

    render() {
        return null;
    }

    callUtils() {
        if (Platform.OS === 'android') {

            // React Native Bridge Callback Example
            const arr = ["Shubham", "Rohan", "Ayush", "Nayan"]
            Utils.sort(arr.slice(), (err, data) => {
                console.log("Result: ", data)
                console.log("Error: ", err)
            });
        }
    }
}
