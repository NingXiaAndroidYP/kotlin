package com.fuusy.newlogin.repo

import com.fuusy.common.bean.UserInfo
import com.fuusy.common.network.BaseResp
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface LoginApi {

    /**
     * 注册
     */
    @FormUrlEncoded
    @POST("user/register")
    suspend fun register(
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("repassword") repassword: String
    ): BaseResp<UserInfo>

    /**
     * 登录
     */
    @POST("login/app/signIn")
    suspend fun login(
        @Body body: RequestBody
    ): BaseResp<UserInfo>


}