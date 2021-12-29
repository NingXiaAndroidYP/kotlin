package com.fuusy.newlogin.ui

import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.fuusy.common.base.BaseVmActivity
import com.fuusy.common.network.net.IStateObserver
import com.fuusy.common.support.Constants
import com.fuusy.newlogin.R
import com.fuusy.newlogin.databinding.AcLoginBinding
import com.fuusy.common.bean.UserInfo
import com.fuusy.common.support.RouterPath
import com.fuusy.newlogin.viewmodel.LoginViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

@Route(path = RouterPath.Login.PATH_LOGIN)
class LoginAc : BaseVmActivity<AcLoginBinding>() {

    override fun initData() {
    }

    override fun getLayoutId(): Int {
        return R.layout.ac_login;
    }
}