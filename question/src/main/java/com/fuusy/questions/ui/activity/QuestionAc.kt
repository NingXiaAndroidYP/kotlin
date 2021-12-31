package com.fuusy.questions.ui.activity

import com.fuusy.common.base.BaseVmActivity
import com.fuusy.questions.R
import com.fuusy.questions.databinding.AcQuestionBinding
import com.fuusy.questions.widget.AnswerRange

class QuestionAc : BaseVmActivity<AcQuestionBinding>() {
    var pos: Int = -1

    override fun initData() {
        val content = "纷纷扬扬的___下了半尺多厚。"
        // 答案范围集合
        val rangeList: MutableList<AnswerRange> = ArrayList()
        rangeList.add(AnswerRange(5, 8))
        mBinding?.run {
            fbvContent?.setData(content, rangeList)
        }


    }

    override fun getLayoutId(): Int {
        return R.layout.ac_question
    }

}