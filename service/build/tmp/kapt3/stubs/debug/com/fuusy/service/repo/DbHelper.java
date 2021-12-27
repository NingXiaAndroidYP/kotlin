package com.fuusy.service.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\t\u00a8\u0006\r"}, d2 = {"Lcom/fuusy/service/repo/DbHelper;", "", "()V", "deleteUserInfo", "", "context", "Landroid/content/Context;", "getLiveUserInfo", "Landroidx/lifecycle/LiveData;", "Lcom/fuusy/service/repo/LoginResp;", "getUserInfo", "insertUserInfo", "user", "service_debug"})
public final class DbHelper {
    public static final com.fuusy.service.repo.DbHelper INSTANCE = null;
    
    /**
     * 获取room数据表中存储的userInfo
     * return liveData形式
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fuusy.service.repo.LoginResp> getLiveUserInfo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * 以普通数据对象的形式，获取userInfo
     */
    @org.jetbrains.annotations.Nullable()
    public final com.fuusy.service.repo.LoginResp getUserInfo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * 删除数据表中的userInfo信息
     */
    public final void deleteUserInfo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * 新增用户数据到数据表
     */
    public final void insertUserInfo(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fuusy.service.repo.LoginResp user) {
    }
    
    private DbHelper() {
        super();
    }
}