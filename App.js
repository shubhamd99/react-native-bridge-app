/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React from 'react';
import { SafeAreaView, StyleSheet, View, Text, StatusBar } from 'react-native';
import ToastComponent from './src/Toast';
import Utils from './src/Utils';


const App = () => {
  return (
    <>
      <StatusBar barStyle="dark-content" />
      <SafeAreaView>
          <View style={styles.container}>
            <Text style={styles.title}>React Native Bridge Example</Text>
            <ToastComponent />
            <Utils />
          </View>
      </SafeAreaView>
    </>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    marginTop: 20
  },
  title: {
    fontSize: 20
  }
});

export default App;
