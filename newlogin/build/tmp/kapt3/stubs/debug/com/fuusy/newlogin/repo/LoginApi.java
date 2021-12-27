package com.fuusy.newlogin.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/fuusy/newlogin/repo/LoginApi;", "", "login", "Lcom/fuusy/common/network/BaseResp;", "Lcom/fuusy/common/bean/UserInfo;", "body", "Lokhttp3/RequestBody;", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "username", "", "password", "repassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newlogin_debug"})
public abstract interface LoginApi {
    
    /**
     * 注册
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/register")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object register(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "repassword")
    java.lang.String repassword, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fuusy.common.network.BaseResp<com.fuusy.common.bean.UserInfo>> p3);
    
    /**
     * 登录
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "login/app/signIn")
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fuusy.common.network.BaseResp<com.fuusy.common.bean.UserInfo>> p1);
}