package com.fuusy.frame

import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import com.fuusy.common.base.BaseActivity
import com.fuusy.common.support.RouterPath
import com.fuusy.frame.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override fun initData(savedInstanceState: Bundle?) {
//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//        finish()
        ARouter.getInstance().build(RouterPath.Login.PATH_LOGIN).navigation()
        finish()
    }

    override fun getLayoutId(): Int = R.layout.activity_splash

}