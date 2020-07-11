package com.sj.appinstall.net;

import com.sj.appinstall.pattern.Instance;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public final class HttpUtil {
    private OkHttpClient mClient;
    public HttpUtil() {
        mClient = new OkHttpClient.Builder()
                .callTimeout(1, TimeUnit.SECONDS)
                .connectTimeout(1, TimeUnit.SECONDS)
                .build();
    }

    public void getFileInfo(Callback callback) {
        Request request = new Request.Builder()
                .url("127.0.0.1/info")
                .build();
        Call call = mClient.newCall(request);
        call.enqueue(callback);
    }

}
