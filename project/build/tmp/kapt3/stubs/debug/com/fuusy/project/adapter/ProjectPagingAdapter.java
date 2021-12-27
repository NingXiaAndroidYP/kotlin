package com.fuusy.project.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0014\u00a8\u0006\u000e"}, d2 = {"Lcom/fuusy/project/adapter/ProjectPagingAdapter;", "Lcom/fuusy/common/base/paging/BasePagingAdapter;", "Lcom/fuusy/project/bean/ProjectContent;", "()V", "bindData", "", "helper", "Lcom/fuusy/common/base/paging/BasePagingAdapter$ItemHelper;", "data", "getItemLayout", "", "position", "onItemClick", "Companion", "project_debug"})
public final class ProjectPagingAdapter extends com.fuusy.common.base.paging.BasePagingAdapter<com.fuusy.project.bean.ProjectContent> {
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.fuusy.project.bean.ProjectContent> diffCallback = null;
    public static final com.fuusy.project.adapter.ProjectPagingAdapter.Companion Companion = null;
    
    @java.lang.Override()
    protected int getItemLayout(int position) {
        return 0;
    }
    
    @java.lang.Override()
    protected void onItemClick(@org.jetbrains.annotations.Nullable()
    com.fuusy.project.bean.ProjectContent data) {
    }
    
    @java.lang.Override()
    protected void bindData(@org.jetbrains.annotations.NotNull()
    com.fuusy.common.base.paging.BasePagingAdapter.ItemHelper helper, @org.jetbrains.annotations.Nullable()
    com.fuusy.project.bean.ProjectContent data) {
    }
    
    public ProjectPagingAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/fuusy/project/adapter/ProjectPagingAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/fuusy/project/bean/ProjectContent;", "getDiffCallback", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "project_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.fuusy.project.bean.ProjectContent> getDiffCallback() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}