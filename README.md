### React Native Bridge Example:

#### Android (Toast Example) :

1. We start by creating a native module. A native module is a Java class that usually extends the ReactContextBaseJavaModule class and implements the functionality required by the JavaScript. Our goal here is to be able to write ToastExample.show('Awesome', ToastExample.SHORT); from JavaScript to display a short toast on the screen.

2. Create a new Java Class named ToastModule.java inside `android/app/src/main/java/com/your-app-name/`.

3. Register the Module - The last step within Java is to register the Module; this happens in the createNativeModules of your apps package. If a module is not registered it will not be available from JavaScript. Create a new Java Class named CustomToastPackage.java inside `android/app/src/main/java/com/your-app-name/` folder.


