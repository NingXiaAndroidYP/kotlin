package com.fuusy.frame

import android.content.Intent
import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import com.fuusy.common.base.BaseActivity
import com.fuusy.common.bean.UserInfo
import com.fuusy.common.support.RouterPath
import com.fuusy.common.utils.MMkvHelper
import com.fuusy.frame.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override fun initData(savedInstanceState: Bundle?) {
        MMkvHelper.getUserInfo()?.token?.let {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
            return
        }
        ARouter.getInstance().build(RouterPath.Login.PATH_LOGIN).navigation()
        finish()
    }

    override fun getLayoutId(): Int = R.layout.activity_splash

}