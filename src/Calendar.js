import { NativeModules, Platform} from 'react-native';
import React, { Component } from 'react';

const CalendarManager = NativeModules.CalendarManager;

export default class CalendarComponent extends Component {

    componentDidMount() {
        this.callCalendar();
    }

    render() {
        return null;
    }

    callCalendar() {
        if (Platform.OS === 'ios') {
            // callback
            CalendarManager.addEvent(
                'Birthday Party',
                '4 Privet Drive, Surrey'
            );
        }
    }
}
