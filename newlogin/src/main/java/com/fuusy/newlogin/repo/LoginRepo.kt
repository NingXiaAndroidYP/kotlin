package com.fuusy.newlogin.repo

import com.fuusy.common.base.BaseRepository
import com.fuusy.common.bean.UserInfo
import com.fuusy.common.network.net.StateLiveData
import com.fuusy.common.utils.AESUtils
import com.google.gson.Gson
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody
import java.util.*

class LoginRepo(private val service: LoginApi) : BaseRepository() {
    /**
     * 登录
     */
    suspend fun login(name: String, password: String, liveData: StateLiveData<UserInfo>) {
        val map: MutableMap<String, String> = HashMap()
        val params: MutableMap<String, String> = HashMap()
        map["account"] = name
        map["password"] = password
        params["data"] = AESUtils.encrypt(Gson().toJson(map))
        val body = RequestBody.create(
            "application/json; charset=utf-8".toMediaTypeOrNull(),
            Gson().toJson(params)
        )
        executeResp({ service.login(body) }, liveData)
    }
}