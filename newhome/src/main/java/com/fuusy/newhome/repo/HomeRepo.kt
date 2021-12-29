package com.fuusy.newhome.repo

import com.fuusy.common.base.BaseRepository
import com.fuusy.common.network.BaseListDataBean
import com.fuusy.common.network.net.StateLiveData
import com.fuusy.newhome.bean.ArticleBean

class HomeRepo(private val service: HomeApi) : BaseRepository() {

    suspend fun goverMent(map: Map<String, Any>,liveData: StateLiveData<BaseListDataBean<ArticleBean>>) {
        executeResp({service.goverMent(map)},liveData)

    }
    suspend fun propagand(map: Map<String, Any>,liveData: StateLiveData<BaseListDataBean<ArticleBean>>) {
        executeResp({service.propagand(map)},liveData)

    }

}