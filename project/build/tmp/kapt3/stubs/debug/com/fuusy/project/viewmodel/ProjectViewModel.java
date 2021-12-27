package com.fuusy.project.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/fuusy/project/viewmodel/ProjectViewModel;", "Lcom/fuusy/common/base/BaseViewModel;", "repo", "Lcom/fuusy/project/repo/ProjectRepo;", "(Lcom/fuusy/project/repo/ProjectRepo;)V", "mProjectTreeLiveData", "Lcom/fuusy/common/network/net/StateLiveData;", "", "Lcom/fuusy/project/bean/ProjectTree;", "getMProjectTreeLiveData", "()Lcom/fuusy/common/network/net/StateLiveData;", "loadProjectContentById", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/fuusy/project/bean/ProjectContent;", "id", "", "loadProjectTree", "", "project_debug"})
public final class ProjectViewModel extends com.fuusy.common.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.fuusy.common.network.net.StateLiveData<java.util.List<com.fuusy.project.bean.ProjectTree>> mProjectTreeLiveData = null;
    private final com.fuusy.project.repo.ProjectRepo repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fuusy.common.network.net.StateLiveData<java.util.List<com.fuusy.project.bean.ProjectTree>> getMProjectTreeLiveData() {
        return null;
    }
    
    /**
     * 向Repository层请求项目分类。
     */
    public final void loadProjectTree() {
    }
    
    /**
     * 根据项目ID请求项目列表详情。Paging3+Flow
     *
     * @param id 项目分类ID
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.fuusy.project.bean.ProjectContent>> loadProjectContentById(int id) {
        return null;
    }
    
    public ProjectViewModel(@org.jetbrains.annotations.NotNull()
    com.fuusy.project.repo.ProjectRepo repo) {
        super();
    }
}