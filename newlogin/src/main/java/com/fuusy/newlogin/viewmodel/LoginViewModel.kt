package com.fuusy.newlogin.viewmodel

import androidx.lifecycle.viewModelScope
import com.fuusy.common.base.BaseViewModel
import com.fuusy.common.network.net.StateLiveData
import com.fuusy.newlogin.repo.LoginRepo
import com.fuusy.common.bean.UserInfo
import kotlinx.coroutines.launch

class LoginViewModel(private val loginRepo: LoginRepo) : BaseViewModel() {

     val loginViewModel = StateLiveData<UserInfo>()

    fun login(userName: String, password: String){
        viewModelScope.launch {
            loginRepo.login(userName,password,loginViewModel)
        }
    }
}