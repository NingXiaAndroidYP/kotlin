package com.fuusy.service.repo;

import java.lang.System;

@androidx.room.Database(entities = {com.fuusy.service.repo.LoginResp.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/fuusy/service/repo/UserDB;", "Landroidx/room/RoomDatabase;", "()V", "userDao", "Lcom/fuusy/service/repo/UserDao;", "getUserDao", "()Lcom/fuusy/service/repo/UserDao;", "Companion", "service_debug"})
public abstract class UserDB extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DB_NAME = "tb_user";
    private static volatile com.fuusy.service.repo.UserDB instance;
    public static final com.fuusy.service.repo.UserDB.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fuusy.service.repo.UserDao getUserDao();
    
    public UserDB() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/fuusy/service/repo/UserDB$Companion;", "", "()V", "DB_NAME", "", "instance", "Lcom/fuusy/service/repo/UserDB;", "get", "context", "Landroid/content/Context;", "service_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.fuusy.service.repo.UserDB get(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}