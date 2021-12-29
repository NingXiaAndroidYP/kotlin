package com.fuusy.newhome.ui.fragment

import android.view.View
import com.fuusy.common.base.BaseFragment
import com.fuusy.common.network.BaseListDataBean
import com.fuusy.common.network.net.IStateObserver
import com.fuusy.newhome.R
import com.fuusy.newhome.bean.ArticleBean
import com.fuusy.newhome.databinding.FgHomeBinding
import com.fuusy.newhome.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.*

class HomeFg : BaseFragment<FgHomeBinding>() {
    private val homeViewModel: HomeViewModel by viewModel()


    override fun initData() {
        registerObserve()
        val httpMap: MutableMap<String, Any> = HashMap()
        httpMap["current"] = 1
        httpMap["size"] = 3
        httpMap["status"] = "1"
        homeViewModel.goverMent(httpMap)
        homeViewModel.propagand(httpMap)
    }

    override fun getLayoutId(): Int {
        return R.layout.fg_home
    }

    fun registerObserve() {
        homeViewModel.liveData.observe(this,
            object : IStateObserver<BaseListDataBean<ArticleBean>>(null) {
                override fun onReload(v: View?) {
                    TODO("Not yet implemented")
                }

                override fun onDataChange(data: BaseListDataBean<ArticleBean>?) {
                    super.onDataChange(data)

                }


            })
    }

}