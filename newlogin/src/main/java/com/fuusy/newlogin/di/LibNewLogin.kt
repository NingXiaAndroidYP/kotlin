package com.fuusy.newlogin.di

import com.fuusy.common.network.RetrofitManager
import com.fuusy.newlogin.repo.LoginApi
import com.fuusy.newlogin.repo.LoginRepo
import com.fuusy.newlogin.viewmodel.LoginViewModel


import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val moduleNewLogin= module{
    single {
        RetrofitManager.initRetrofit().getService(LoginApi::class.java)
    }

    single {
        LoginRepo(get())
    }

    viewModel { LoginViewModel(get()) }
}