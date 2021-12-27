package com.fuusy.project.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/fuusy/project/adapter/ProjectAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/fuusy/project/adapter/ProjectAdapter$ProjectVH;", "()V", "projectTreeList", "", "Lcom/fuusy/project/bean/ProjectTree;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "ProjectVH", "project_debug"})
public final class ProjectAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.fuusy.project.adapter.ProjectAdapter.ProjectVH> {
    private java.util.List<com.fuusy.project.bean.ProjectTree> projectTreeList;
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fuusy.project.bean.ProjectTree> projectTreeList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.fuusy.project.adapter.ProjectAdapter.ProjectVH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.fuusy.project.adapter.ProjectAdapter.ProjectVH holder, int position) {
    }
    
    public ProjectAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/fuusy/project/adapter/ProjectAdapter$ProjectVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/fuusy/project/databinding/ItemProjectAllBinding;", "(Lcom/fuusy/project/databinding/ItemProjectAllBinding;)V", "mBinding", "bind", "", "projectTree", "Lcom/fuusy/project/bean/ProjectTree;", "project_debug"})
    public static final class ProjectVH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.fuusy.project.databinding.ItemProjectAllBinding mBinding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.fuusy.project.bean.ProjectTree projectTree) {
        }
        
        public ProjectVH(@org.jetbrains.annotations.NotNull()
        com.fuusy.project.databinding.ItemProjectAllBinding binding) {
            super(null);
        }
    }
}