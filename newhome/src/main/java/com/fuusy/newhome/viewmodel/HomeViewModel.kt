package com.fuusy.newhome.viewmodel

import androidx.lifecycle.viewModelScope
import com.fuusy.common.base.BaseViewModel
import com.fuusy.common.network.BaseListDataBean
import com.fuusy.common.network.net.StateLiveData
import com.fuusy.newhome.bean.ArticleBean
import com.fuusy.newhome.repo.HomeRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(private val homeRepo: HomeRepo) : BaseViewModel() {
    val liveData = StateLiveData<BaseListDataBean<ArticleBean>>();

     fun goverMent(map: Map<String, Any>) {
        viewModelScope.launch(Dispatchers.IO){
            homeRepo.goverMent(map,liveData);
        }
    }

     fun propagand(map: Map<String, Any>) {
        viewModelScope.launch(Dispatchers.IO) {
            homeRepo.propagand(map,liveData);
        }
    }
}