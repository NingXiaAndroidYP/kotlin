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
     * 登录
     */
    @POST("login/app/signIn")
    suspend fun login(
        @Body body: RequestBody
    ): BaseResp<UserInfo>


}