package com.fuusy.common.utils;

import android.text.TextUtils;
import android.widget.Toast;

public class ToastUtil {
    private static Toast toast;

    public static void show(String msg) {
        if (TextUtils.isEmpty(msg) || AppUtil.INSTANCE.getApplication() == null) {
            return;
        }
        if (toast == null) {
            toast = Toast.makeText(AppUtil.INSTANCE.getApplication(), "", Toast.LENGTH_SHORT);
        }
        toast.setText(msg);
        toast.show();
    }
}
