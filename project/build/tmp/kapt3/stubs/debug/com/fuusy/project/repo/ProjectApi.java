package com.fuusy.project.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/fuusy/project/repo/ProjectApi;", "", "loadContentById", "Lcom/fuusy/common/network/BaseResp;", "Lcom/fuusy/common/network/BasePagingResp;", "", "Lcom/fuusy/project/bean/ProjectContent;", "path", "", "cid", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadProjectTree", "Lcom/fuusy/project/bean/ProjectTree;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "project_debug"})
public abstract interface ProjectApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "project/tree/json")
    public abstract java.lang.Object loadProjectTree(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fuusy.common.network.BaseResp<java.util.List<com.fuusy.project.bean.ProjectTree>>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "project/list/{path}/json")
    public abstract java.lang.Object loadContentById(@retrofit2.http.Path(value = "path")
    int path, @retrofit2.http.Query(value = "cid")
    int cid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fuusy.common.network.BaseResp<com.fuusy.common.network.BasePagingResp<java.util.List<com.fuusy.project.bean.ProjectContent>>>> p2);
}