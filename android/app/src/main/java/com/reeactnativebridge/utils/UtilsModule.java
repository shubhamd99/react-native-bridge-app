// UtilsModule.java
package com.reeactnativebridge.utils;

import android.widget.Toast;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;

import java.util.List;

// A native module is a Java class that usually extends the ReactContextBaseJavaModule class
public class UtilsModule extends ReactContextBaseJavaModule {
  private static ReactApplicationContext reactContext;

  UtilsModule(ReactApplicationContext context) {
    super(context);
    reactContext = context;
  }

  // ReactContextBaseJavaModule requires that a method called getName is implemented.
  // The purpose of this method is to return the string name of the NativeModule,
  // which represents this class in JavaScript. 
  // Ex - React.NativeModules.ToastExample (in JavaScript).
  @Override
  public String getName() {
    return "UtilsExample";
  }

  //Custom function that we are going to export to JS
  @ReactMethod
  public void sort(ReadableArray arr, Callback cb) {

      try {
          ArrayUtils arrayUtils = new ArrayUtils();
          List<String> sortedArr = arrayUtils.sortStringArray(arr);

          cb.invoke(null, sortedArr.toString());
      } catch (Exception e) {
          cb.invoke(e.toString(), null);
      }
  }

}