package com.fuusy.common.utils

import com.blankj.utilcode.util.PathUtils
import com.fuusy.common.bean.UserInfo
import com.fuusy.common.support.Constants
import com.tencent.mmkv.MMKV


/*
 *
 * 自定义的key-value 轻量数据存储管理类，便于替换
 */
object MMkvHelper {

    private val kv: MMKV by lazy {
        MMKV.defaultMMKV()
    }

    init {
        MMKV.initialize(PathUtils.getInternalAppFilesPath())
    }

    fun put(key: String, value: Any?) {
        when (value) {
            is Boolean -> kv.putBoolean(key, value)
            is ByteArray -> kv.putBytes(key, value)
            is Float -> kv.putFloat(key, value)
            is Int -> kv.putInt(key, value)
            is Long -> kv.putLong(key, value)
            is String -> kv.putString(key, value)
            else -> error("${value?.javaClass?.simpleName} Not Supported By CniaoSpUtils")
        }
    }

    fun getBoolean(key: String, defValue: Boolean = false) = kv.getBoolean(key, defValue)

    fun getBytes(key: String, defValue: ByteArray? = null) = kv.getBytes(key, defValue)

    fun getFloat(key: String, defValue: Float = 0f) = kv.getFloat(key, defValue)

    fun getInt(key: String, defValue: Int = 0) = kv.getInt(key, defValue)

    fun getLong(key: String, defValue: Long = 0L) = kv.getLong(key, defValue)

    fun getString(key: String, defValue: String? = null) = kv.getString(key, defValue)

    fun remove(key: String) = kv.remove(key)

    fun removeValue(key: String) = kv.removeValueForKey(key)

    /**
     * 保存用户信息
     */
    fun saveUserInfo(userInfo: UserInfo?) {
        kv.encode(Constants.USER_INFO, userInfo)
    }

    fun getUserInfo(): UserInfo? {
        return kv.decodeParcelable(Constants.USER_INFO, UserInfo::class.java)
    }

    fun getToken(): String? {
        getUserInfo()?.run {
            return token
        }
        return ""
    }

    fun removeUserInfo() {
        kv.remove(Constants.USER_INFO)
    }
}