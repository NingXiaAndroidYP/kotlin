package com.fuusy.common.utils

import android.text.TextUtils
import android.widget.Toast
import com.fuusy.common.utils.AppUtil.getApplication

object ToastUtil {
    private var toast: Toast? = null
    fun show(msg: String?) {
        if (TextUtils.isEmpty(msg) || getApplication() == null) {
            return
        }
        if (toast == null) {
            toast = Toast.makeText(getApplication(), "", Toast.LENGTH_SHORT)
        }
        toast!!.setText(msg)
        toast!!.show()
    }
}