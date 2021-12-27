package com.fuusy.common.network.Interceptor;

import com.fuusy.common.utils.MMkvHelper;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @date: 2019\5\29 0029
 * @author: zlx
 * @email: 1170762202@qq.com
 * @description: 公共参数拦截器
 */
public class BodyInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        String device = "device";
        String packageId = "1";
        String version = "1.1.0";
        HttpUrl url = originalRequest.url()
                .newBuilder()
                .addQueryParameter("token", "")
                .build();
//        Log.e("TAG", "统一参数： " + selfID + "   " + token);
        Request authorised = originalRequest.newBuilder()
                .header("device", device)
                .header("packageId", packageId)
                .header("version", version)
                .header("Content_Type", "application/json")
                .header("charset", "UTF-8")
                .header("TOKEN", MMkvHelper.INSTANCE.getToken())
                .url(url)
                .build();

        Response response = chain.proceed(authorised);
        return response;
    }
}
