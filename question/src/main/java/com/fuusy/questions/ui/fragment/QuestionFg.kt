package com.fuusy.questions.ui.fragment

import com.alibaba.android.arouter.facade.annotation.Route
import com.fuusy.common.base.BaseFragment
import com.fuusy.common.support.RouterPath
import com.fuusy.questions.R
import com.fuusy.questions.databinding.FgQuestionBinding

@Route(path = RouterPath.Questions.PATH_QUESTIONS)
class QuestionFg : BaseFragment<FgQuestionBinding>() {
    override fun initData() {
    }

    override fun getLayoutId(): Int {
        return R.layout.fg_question
    }

}