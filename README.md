### React Native Bridge Example:

![alt text](https://i.imgur.com/Ana2X4h.png)
#### Android :

1. A native module is a Java class that usually extends the ReactContextBaseJavaModule class and implements the functionality required by the JavaScript. Our goal here is to be able to write ToastExample.show('Awesome', ToastExample.SHORT); from JavaScript to display a short toast on the screen.

2. Create a new Java Class named ToastModule.java inside `android/app/src/main/java/com/your-app-name/`.

3. Register the Module - The last step within Java is to register the Module; this happens in the createNativeModules of your apps package. If a module is not registered it will not be available from JavaScript. Create a new Java Class named CustomToastPackage.java inside `android/app/src/main/java/com/your-app-name/` folder.

#### IOS :

1. Open the ./ios/ project folder. Open the .xcodeproj file or the .xcworkspace file in Xcode.

2. Create a header file Device.h by following the steps File -> New -> File -> Header File and then name the file Device.h and choose the targets. Create a new folder Device if you like to organize files in a folder like me.
3. Let modify our Device.h file.
4. Now let's create the corresponding implementation file Device.m in the same location.
5. Similar to Android's getName method, here we have RCT_EXPORT_MODULE() macro. If no name is explicitly provided, it will take the name of the module. Here the name of the module is 'Device'. In order to expose a method from native module to Javascript just write a method inside the RCT_EXPORT_METHOD macro. These methods can be accessed from NativeModules of the react-native package.

#### Native Modules Setup

1. Simple CLI to build React Native libraries for different targets.
Link - https://www.npmjs.com/package/@react-native-community/bob

2. To create new project with Bob, run the following:
`yarn add --dev @react-native-community/bob`

3. Automatic Config with yarn:
`npx @react-native-community/bob create react-native-awesome-module`

![alt text](https://i.imgur.com/ryVUSoq.png)

![alt text](https://i.imgur.com/5jMJAiU.png)

* Git:
`git push -u origin main  `
