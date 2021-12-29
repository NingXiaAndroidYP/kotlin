package com.fuusy.common.widget;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by tyranny on 2017/4/10 20:22.
 *
 * 嵌套 recyclerview 用 recyclerview
 * @version 1.0.0
 */

public class SubRecyclerView extends RecyclerView {

    public SubRecyclerView(Context context) {
        super(context);
    }

    public SubRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SubRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE>>2, MeasureSpec.AT_MOST);
        super.onMeasure(widthSpec, expandSpec);
    }

}
