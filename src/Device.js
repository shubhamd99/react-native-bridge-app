import { NativeModules, Platform} from 'react-native';
import React, { Component } from 'react';

const Device = NativeModules.Device;

export default class DeviceComponent extends Component {

    componentDidMount() {
        this.callDevice();
    }

    render() {
        return null;
    }

    callDevice() {
        if (Platform.OS === 'ios') {
            // callback
            Device.getDeviceName((err ,name) => {
                console.log("Device Native Module: ", err, name); // null iPhone 11
            });
        }
    }
}
