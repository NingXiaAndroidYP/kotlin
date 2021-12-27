package com.fuusy.common.network

import com.fuusy.common.network.Interceptor.BodyInterceptor
import com.fuusy.common.network.Interceptor.MyLoggingInterceptor
import com.fuusy.common.network.config.LocalCookieJar
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

private const val TAG = "RetrofitManager"

object RetrofitManager {

    private val mOkClient = OkHttpClient.Builder()
        .callTimeout(10, TimeUnit.SECONDS)
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(10, TimeUnit.SECONDS)
        .writeTimeout(10, TimeUnit.SECONDS)
        .retryOnConnectionFailure(true)
        .followRedirects(false)
        .cookieJar(LocalCookieJar())
        .addInterceptor(BodyInterceptor())
        .addInterceptor(MyLoggingInterceptor())
        .build()

    private var mRetrofit: Retrofit? = null


    fun initRetrofit(): RetrofitManager {
        mRetrofit = Retrofit.Builder()
           // .baseUrl("https://www.wanandroid.com/")
            .baseUrl("http://192.168.119.249:11094/")
            .client(mOkClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return this
    }

    fun <T> getService(serviceClass: Class<T>): T {
        if (mRetrofit == null) {
            throw UninitializedPropertyAccessException("Retrofit必须初始化")
        } else {
            return mRetrofit!!.create(serviceClass)
        }
    }
}