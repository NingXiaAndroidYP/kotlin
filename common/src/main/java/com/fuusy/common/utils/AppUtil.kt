package com.fuusy.common.utils
import android.app.Application

/**
 * 全局的Application
 */
object AppUtil {
    fun getApplication(): Application? {
        return ActivityLifecycleImpl.INSTANCE.applicationByReflect
    }
}