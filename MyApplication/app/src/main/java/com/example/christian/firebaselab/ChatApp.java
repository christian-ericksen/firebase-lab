package com.example.christian.firebaselab;

import com.firebase.client.Firebase;

/**
 * Created by Christian on 4/1/16.
 */
public class ChatApp extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}