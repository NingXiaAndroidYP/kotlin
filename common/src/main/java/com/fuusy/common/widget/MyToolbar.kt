package com.fuusy.common.widget

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.blankj.utilcode.util.ActivityUtils
import com.fuusy.common.R
import com.fuusy.common.utils.SizeUtils.Companion.dip2px

/**
 * Created by js on 2016/7/11.
 */
class MyToolbar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : Toolbar(context, attrs, defStyleAttr) {
    private var mView: View? = null
    private var mTextTitle: TextView? = null
    private var mBackButton: ImageView? = null
    private var ivRight: ImageView? = null
    private var tvRight: TextView? = null

    /**
     * 设置标题
     *
     * @param title
     */
    fun setTitle(title: String?) {
        mTextTitle!!.text = title
    }

    /**
     * 设置左侧图片
     *
     * @param resIcon
     */
    fun setLeftButtonIcon(resIcon: Int) {
        ivRight!!.setImageResource(resIcon)
    }

    /**
     * 设置右侧图片
     *
     * @param resIcon
     */
    fun setRightIcon(resIcon: Int) {
        ivRight!!.setImageResource(resIcon)
        ivRight!!.visibility = VISIBLE
        tvRight!!.visibility = GONE
    }

    /**
     * 右侧点击时间
     *
     * @param lir
     */
    fun setRightClickListener(lir: OnClickListener?) {
        //两个控件那个显示就代表点击了那个
        if (ivRight!!.visibility == VISIBLE) {
            ivRight!!.setOnClickListener(lir)
        } else {
            tvRight!!.setOnClickListener(lir)
        }
    }

    /**
     * 设置右侧文字
     *
     * @param str
     */
    fun setRightText(str: String?, color: Int) {
        //color传入方式为R.color.color_B3B3B3
        tvRight?.run {
            text = str
            visibility = GONE
            visibility = VISIBLE
            val resColor = ContextCompat.getColor(context, color)
            setTextColor(resColor)
        }

    }

    /**
     * 设置右侧文字
     *
     * @param str
     */
    fun setRightText(str: String?) {
        tvRight?.run {
            text = str
            visibility = GONE
            visibility = VISIBLE
        }

    }

    /**
     * 隐藏返回键
     */
    fun hideBackView() {
        mBackButton?.let {
            it.visibility = GONE
        }

    }

    private fun initView() {
        if (mView == null) {
            val mInflater = LayoutInflater.from(context)
            mView = mInflater.inflate(R.layout.layout_toolbar, null)
            mView?.run {
                mBackButton = findViewById<View>(R.id.toolbar_backButton) as ImageView
                mTextTitle = findViewById<View>(R.id.toolbar_title) as TextView
                ivRight = findViewById<View>(R.id.iv_right) as ImageView
                tvRight = findViewById<View>(R.id.tv_right) as TextView
                //设置宽和高
                val lp = LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    Gravity.CENTER_HORIZONTAL
                )
                addView(mView, lp)
            }

        }
        /**
         * 返回键事件
         */
        mBackButton!!.setOnClickListener {
            val activity = ActivityUtils.getTopActivity()
            ActivityCompat.finishAfterTransition(activity)
        }
    }

    init {
        initView()
        //左右两边距离14dp
        setContentInsetsRelative(dip2px(14f), dip2px(14f))
        if (attrs != null) {
            val typedArray = context.obtainStyledAttributes(attrs, R.styleable.MyToolbar)
            if (typedArray != null) {
                val title = typedArray.getString(R.styleable.MyToolbar_title)
                val titleSize = typedArray.getInt(R.styleable.MyToolbar_titleSize, 21)
                mTextTitle?.run {
                    textSize = titleSize.toFloat()
                    text = title
                }
                typedArray.recycle()
            }
        }
    }
}