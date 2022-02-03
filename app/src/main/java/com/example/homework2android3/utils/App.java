package com.example.homework2android3.utils;

import android.app.Application;

import com.example.homework2android3.data.remote.PostApi;
import com.example.homework2android3.data.remote.RetrofitClient;


public class App extends Application {

    private RetrofitClient client;
    public static PostApi api;

    @Override
    public void onCreate() {
        super.onCreate();
        client = new RetrofitClient();
        api = client.provideApi();
    }
}
