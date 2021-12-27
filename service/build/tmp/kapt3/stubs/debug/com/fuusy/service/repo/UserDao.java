package com.fuusy.service.repo;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/fuusy/service/repo/UserDao;", "", "deleteUser", "", "info", "Lcom/fuusy/service/repo/LoginResp;", "insertUser", "queryLiveUser", "Landroidx/lifecycle/LiveData;", "id", "", "queryUser", "updateUser", "service_debug"})
public abstract interface UserDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertUser(@org.jetbrains.annotations.NotNull()
    com.fuusy.service.repo.LoginResp info);
    
    @androidx.room.Update(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void updateUser(@org.jetbrains.annotations.NotNull()
    com.fuusy.service.repo.LoginResp info);
    
    @androidx.room.Delete()
    public abstract void deleteUser(@org.jetbrains.annotations.NotNull()
    com.fuusy.service.repo.LoginResp info);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from tb_user where id =:id")
    public abstract androidx.lifecycle.LiveData<com.fuusy.service.repo.LoginResp> queryLiveUser(int id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from tb_user where id =:id")
    public abstract com.fuusy.service.repo.LoginResp queryUser(int id);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}