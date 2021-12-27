package com.fuusy.newlogin.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/fuusy/newlogin/viewmodel/LoginViewModel;", "Lcom/fuusy/common/base/BaseViewModel;", "loginRepo", "Lcom/fuusy/newlogin/repo/LoginRepo;", "(Lcom/fuusy/newlogin/repo/LoginRepo;)V", "loginViewModel", "Lcom/fuusy/common/network/net/StateLiveData;", "Lcom/fuusy/common/bean/UserInfo;", "getLoginViewModel", "()Lcom/fuusy/common/network/net/StateLiveData;", "login", "", "userName", "", "password", "newlogin_debug"})
public final class LoginViewModel extends com.fuusy.common.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.fuusy.common.network.net.StateLiveData<com.fuusy.common.bean.UserInfo> loginViewModel = null;
    private final com.fuusy.newlogin.repo.LoginRepo loginRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fuusy.common.network.net.StateLiveData<com.fuusy.common.bean.UserInfo> getLoginViewModel() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.fuusy.newlogin.repo.LoginRepo loginRepo) {
        super();
    }
}