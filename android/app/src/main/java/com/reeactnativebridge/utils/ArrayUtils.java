package com.reeactnativebridge.utils;

import com.facebook.react.bridge.ReadableArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtils {

    public ArrayUtils() { }

    public List<String> sortStringArray(ReadableArray arr) {
        List<String> sortedArray = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            sortedArray.add(i, arr.getString(i));
        }

        Collections.sort(sortedArray);

        return sortedArray;
    }


}