package com.fuusy.project.repo;

import java.lang.System;

/**
 * @date：2021/6/11
 * @author fuusy
 * @instruction：“项目” Repository层
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\u0006J%\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/fuusy/project/repo/ProjectRepo;", "Lcom/fuusy/common/base/BaseRepository;", "service", "Lcom/fuusy/project/repo/ProjectApi;", "(Lcom/fuusy/project/repo/ProjectApi;)V", "pageSize", "", "loadContentById", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/fuusy/project/bean/ProjectContent;", "id", "loadProjectTree", "", "stateLiveData", "Lcom/fuusy/common/network/net/StateLiveData;", "", "Lcom/fuusy/project/bean/ProjectTree;", "(Lcom/fuusy/common/network/net/StateLiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "project_debug"})
public final class ProjectRepo extends com.fuusy.common.base.BaseRepository {
    private final int pageSize = 20;
    private final com.fuusy.project.repo.ProjectApi service = null;
    
    /**
     * 请求项目分类。
     * @param stateLiveData 带有请求状态的LiveData
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadProjectTree(@org.jetbrains.annotations.NotNull()
    com.fuusy.common.network.net.StateLiveData<java.util.List<com.fuusy.project.bean.ProjectTree>> stateLiveData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    /**
     * 通过项目分类的ID，利用Paging3+Flow请求项目详细列表。
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.fuusy.project.bean.ProjectContent>> loadContentById(int id) {
        return null;
    }
    
    public ProjectRepo(@org.jetbrains.annotations.NotNull()
    com.fuusy.project.repo.ProjectApi service) {
        super();
    }
}