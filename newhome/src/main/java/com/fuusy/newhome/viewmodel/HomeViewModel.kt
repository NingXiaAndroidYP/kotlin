package com.fuusy.newhome.viewmodel

import androidx.lifecycle.viewModelScope
import com.fuusy.common.base.BaseViewModel
import com.fuusy.common.network.BaseListDataBean
import com.fuusy.common.network.net.StateLiveData
import com.fuusy.newhome.bean.ArticleBean
import com.fuusy.newhome.repo.HomeRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.File

class HomeViewModel(private val homeRepo: HomeRepo) : BaseViewModel() {
    val goverMentLiveData = StateLiveData<BaseListDataBean<ArticleBean>>()
    val propagandLiveData = StateLiveData<BaseListDataBean<ArticleBean>>()

    fun goverMent(map: Map<String, Any>) {
        viewModelScope.launch(Dispatchers.IO) {
            homeRepo.goverMent(map, goverMentLiveData);
        }
    }

    fun propagand(map: Map<String, Any>) {
        viewModelScope.launch(Dispatchers.IO) {
            homeRepo.propagand(map, propagandLiveData)
        }
    }
}