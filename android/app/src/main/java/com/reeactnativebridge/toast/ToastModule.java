// ToastModule.java
package com.reeactnativebridge.toast;

import android.widget.Toast;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;
import java.util.HashMap;

// A native module is a Java class that usually extends the ReactContextBaseJavaModule class
public class ToastModule extends ReactContextBaseJavaModule {
  private static ReactApplicationContext reactContext;

  private static final String DURATION_SHORT_KEY = "SHORT";
  private static final String DURATION_LONG_KEY = "LONG";

  ToastModule(ReactApplicationContext context) {
    super(context);
    reactContext = context;
  }

  // ReactContextBaseJavaModule requires that a method called getName is implemented.
  // The purpose of this method is to return the string name of the NativeModule,
  // which represents this class in JavaScript. 
  // Ex - React.NativeModules.ToastExample (in JavaScript).
  @Override
  public String getName() {
    return "ToastExample";
  }

  // An optional method called getConstants returns the constant values exposed to JavaScript.
  // Its implementation is not required but is very useful to key pre-defined values,
  // that need to be communicated from JavaScript to Java in sync.
  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    constants.put(DURATION_SHORT_KEY, Toast.LENGTH_SHORT);
    constants.put(DURATION_LONG_KEY, Toast.LENGTH_LONG);
    return constants;
  }

  // To expose a method to JavaScript, A Java method must be annotated using @ReactMethod.
  // The return type of bridge methods is always void.
  // React Native bridge is asynchronous, so the only way to pass a result to JavaScript is by using callbacks or emitting events.
  @ReactMethod
  public void show(String message, int duration) {
    Toast.makeText(getReactApplicationContext(), message, duration).show();
  }

  // Argument Types:
  //  Boolean -> Bool
  //  Integer -> Number
  //  Double -> Number
  //  Float -> Number
  //  String -> String
  //  Callback -> function
  //  ReadableMap -> Object
  //  ReadableArray -> Array

}