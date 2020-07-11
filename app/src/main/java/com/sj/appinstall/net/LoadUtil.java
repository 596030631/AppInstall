package com.sj.appinstall.net;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

public class LoadUtil {
    private OkHttpClient mClient;

    public LoadUtil() {
        mClient = new OkHttpClient.Builder()
                .callTimeout(1, TimeUnit.SECONDS)
                .connectTimeout(1, TimeUnit.SECONDS)
                .build();
    }
}
