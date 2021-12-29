package com.fuusy.newhome.di

import com.fuusy.common.network.RetrofitManager
import com.fuusy.newhome.repo.HomeApi
import com.fuusy.newhome.repo.HomeRepo
import com.fuusy.newhome.viewmodel.HomeViewModel


import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val moduleNewHome= module{
    single {
        RetrofitManager.initRetrofit().getService(HomeApi::class.java)
    }

    single {
        HomeRepo(get())
    }

    viewModel { HomeViewModel(get()) }
}