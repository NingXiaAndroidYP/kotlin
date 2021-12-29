package com.fuusy.newhome.repo

import com.fuusy.common.network.BaseListDataBean
import com.fuusy.common.network.BaseResp
import com.fuusy.newhome.bean.ArticleBean
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface HomeApi {

    /**
     * 政务公开
     *
     * @return
     */
    @GET("pc/governmentaffairs/pageList")
    suspend fun goverMent(@QueryMap params: @JvmSuppressWildcards Map<String, Any>): BaseResp<BaseListDataBean<ArticleBean>>

    /**
     * 普法宣传
     *
     * @return
     */
    @GET("pc/popularizelaw/pageList")
    suspend fun propagand(@QueryMap params: @JvmSuppressWildcards Map<String, Any>): BaseResp<BaseListDataBean<ArticleBean>>

}