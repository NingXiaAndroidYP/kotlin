package com.fuusy.questions.ui.fragment

import androidx.recyclerview.widget.OrientationHelper
import com.alibaba.android.arouter.facade.annotation.Route
import com.fuusy.common.base.BaseFragment
import com.fuusy.common.support.RouterPath
import com.fuusy.questions.R
import com.fuusy.questions.bean.QuestionBean
import com.fuusy.questions.databinding.FgQuestionBinding
import com.fuusy.questions.ui.adapter.QuestionAdapter
import com.fuusy.questions.widget.OnViewPagerListener
import com.fuusy.questions.widget.ViewPagerLayoutManager
import java.util.*
import kotlin.collections.ArrayList

@Route(path = RouterPath.Questions.PATH_QUESTIONS)
class QuestionFg : BaseFragment<FgQuestionBinding>() {
    private var mCurPos: Int = 0


    override fun initData() {
        initRecyclerView()
    }

    override fun getLayoutId(): Int {
        return R.layout.fg_question
    }

    fun initRecyclerView() {
        val list: ArrayList<QuestionBean> = ArrayList()
        for (i in 0..10) {
            var questionBean = QuestionBean()
            questionBean.title = "1.请回答下面的问题：小学是几年级: "
            questionBean.a = "a: 3年"
            questionBean.b = "b: 4年"
            questionBean.c = "c: 5年"
            questionBean.d = "d: 6年"
            list.add(questionBean)
        }
        val adapter = QuestionAdapter(list)
        val layoutManager = ViewPagerLayoutManager(activity, OrientationHelper.HORIZONTAL)
        mBinding?.run {
            recyclerview.layoutManager = layoutManager
            recyclerview.adapter = adapter
            adapter.setOnItemClick(object : QuestionAdapter.onItemClick {
                override fun prePage() {

                }

                override fun nextPage() {
                    recyclerview.smoothScrollToPosition(mCurPos + 1)
                }
            })

        }

        layoutManager.setOnViewPagerListener(object : OnViewPagerListener {
            override fun onInitComplete() {
            }

            override fun onPageRelease(isNext: Boolean, position: Int) {

            }

            override fun onPageSelected(position: Int, isBottom: Boolean) {
                mCurPos = position
            }

        })
    }
}