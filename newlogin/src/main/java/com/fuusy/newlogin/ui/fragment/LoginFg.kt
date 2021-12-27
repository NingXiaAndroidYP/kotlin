package com.fuusy.newlogin.fragment

import android.view.View
import com.alibaba.android.arouter.launcher.ARouter
import com.fuusy.common.base.BaseFragment
import com.fuusy.common.network.net.IStateObserver
import com.fuusy.newlogin.R
import com.fuusy.newlogin.databinding.FgLoginBinding
import com.fuusy.common.bean.UserInfo
import com.fuusy.common.support.Constants
import com.fuusy.common.support.LiveDataBus
import com.fuusy.common.support.RouterPath
import com.fuusy.common.utils.MMkvHelper
import com.fuusy.newlogin.viewmodel.LoginViewModel
import kotlinx.android.synthetic.main.fg_login.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginFg : BaseFragment<FgLoginBinding>() {

    private val loginViewModel: LoginViewModel by viewModel()

    override fun initData() {
        registerObserve()
        mBinding?.run {
            bt_login.setOnClickListener {
                loginViewModel.login(etUserName.text.toString(), etPassword.text.toString())
            }
        }
    }

    override fun getLayoutId(): Int {
        return R.layout.fg_login
    }

    fun registerObserve() {
        loginViewModel.loginViewModel.observe(this, object : IStateObserver<UserInfo>(null) {
            override fun onReload(v: View?) {
            }

            override fun onDataChange(data: UserInfo?) {
                super.onDataChange(data)
                MMkvHelper.saveUserInfo(data)
                //发送消息
                LiveDataBus.get().with(Constants.KEY_LIVEDATA_BUS_LOGIN)
                    .postValue(data)
                ARouter.getInstance().build(RouterPath.Main.PATH_MAIN).navigation()
            }

        })
    }

}