package com.fuusy.common.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.blankj.utilcode.util.ActivityUtils;
import com.fuusy.common.R;
import com.fuusy.common.utils.SizeUtils;


/**
 * Created by js on 2016/7/11.
 */

public class MyToolbar extends Toolbar {

    private LayoutInflater mInflater;
    private View mView;
    private TextView mTextTitle;
    private ImageView mBackButton;
    private ImageView ivRight;
    private TextView tvRight;
    private Context context;

    public MyToolbar(Context context) {
        this(context, null);
    }

    public MyToolbar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyToolbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initView();
        //左右两边距离14dp
        setContentInsetsRelative(SizeUtils.dip2px(14), SizeUtils.dip2px(14));
        if (attrs != null) {
            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MyToolbar);
            if (typedArray != null) {
                String title = typedArray.getString(R.styleable.MyToolbar_title);
                int titleSize = typedArray.getInt(R.styleable.MyToolbar_titleSize, 21);
                mTextTitle.setTextSize(titleSize);
                mTextTitle.setText(title);
                typedArray.recycle();
            }
        }
    }

    /**
     * 设置标题
     *
     * @param title
     */
    public void setTitle(String title) {
        mTextTitle.setText(title);
    }

    /**
     * 设置左侧图片
     *
     * @param resIcon
     */
    public void setLeftButtonIcon(int resIcon) {
        ivRight.setImageResource(resIcon);
    }

    /**
     * 设置右侧图片
     *
     * @param resIcon
     */
    public void setRightIcon(int resIcon) {
        ivRight.setImageResource(resIcon);
        ivRight.setVisibility(VISIBLE);
        tvRight.setVisibility(GONE);
    }

    /**
     * 右侧点击时间
     *
     * @param lir
     */
    public void setRightClickListener(OnClickListener lir) {
        //两个控件那个显示就代表点击了那个
        if (ivRight.getVisibility() == View.VISIBLE) {
            ivRight.setOnClickListener(lir);
        } else {
            tvRight.setOnClickListener(lir);
        }
    }

    /**
     * 设置右侧文字
     *
     * @param str
     */
    public void setRightText(String str, int color) {
        //color传入方式为R.color.color_B3B3B3
        tvRight.setText(str);
        ivRight.setVisibility(GONE);
        tvRight.setVisibility(VISIBLE);
        int resColor = ContextCompat.getColor(context, color);
        tvRight.setTextColor(resColor);
    }

    /**
     * 设置右侧文字
     *
     * @param str
     */
    public void setRightText(String str) {
        tvRight.setText(str);
        ivRight.setVisibility(GONE);
        tvRight.setVisibility(VISIBLE);
    }

    /**
     * 隐藏返回键
     */
    public void hideBackView() {
        if (mBackButton != null) {
            mBackButton.setVisibility(GONE);
        }
    }


    private void initView() {
        if (mView == null) {
            mInflater = LayoutInflater.from(getContext());
            mView = mInflater.inflate(R.layout.layout_toolbar, null);
            mBackButton = (ImageView) mView.findViewById(R.id.toolbar_backButton);
            mTextTitle = (TextView) mView.findViewById(R.id.toolbar_title);
            ivRight = (ImageView) mView.findViewById(R.id.iv_right);
            tvRight = (TextView) mView.findViewById(R.id.tv_right);
            //设置宽和高
            LayoutParams lp = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER_HORIZONTAL);
            addView(mView, lp);

        }
        /**
         * 返回键事件
         */
        mBackButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity activity = ActivityUtils.getTopActivity();
                ActivityCompat.finishAfterTransition(activity);
            }
        });
    }
}
