package com.example.alfredo.streetbear;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Alfredo on 2015-11-09.
 */
public class StreetBearApp extends Application {
    @Override
        public void onCreate(){
        super.onCreate();
        Parse.initialize(this, "yASJvgfSNyWTJUqnahdw3IXlmu6UU7IZwkSJmsuU", "XPGk4tveqC1HzG3tbPrsaEhrHh75igK5I0Xx1YlS");

        ParseObject testObject = new ParseObject("testObject22");
        testObject.put("foot", "barlll");
        testObject.saveInBackground();
    }
}
