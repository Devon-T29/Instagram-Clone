package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("wn94mZivj4tOEFy4YnEfxpDGPbPsAOkrSAqUVFrz")
                .clientKey("TijbZBaxeGVZJaLrfc7QrC5E7RaMlQUIzz9oX7TA")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
