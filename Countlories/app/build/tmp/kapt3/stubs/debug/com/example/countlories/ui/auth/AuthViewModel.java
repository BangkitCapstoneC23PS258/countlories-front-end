package com.example.countlories.ui.auth;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018J\u001e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/countlories/ui/auth/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Ldagger/Lazy;", "Lcom/example/countlories/domain/MyRepository;", "loginPref", "Lcom/example/countlories/helper/LoginPreferences;", "(Ldagger/Lazy;Lcom/example/countlories/helper/LoginPreferences;)V", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "_isRegistered", "Lcom/example/countlories/data/remote/response/ResponseRegister;", "_loginProc", "", "isLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "isRegistered", "loginProc", "getLoginProc", "isFavorite", "", "foodId", "", "login", "email", "pass", "register", "username", "setLoginDone", "Companion", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    private final dagger.Lazy<com.example.countlories.domain.MyRepository> repo = null;
    private final com.example.countlories.helper.LoginPreferences loginPref = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _loginProc = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> loginProc = null;
    private final androidx.lifecycle.MutableLiveData<com.example.countlories.data.remote.response.ResponseRegister> _isRegistered = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.countlories.data.remote.response.ResponseRegister> isRegistered = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.countlories.ui.auth.AuthViewModel.Companion Companion = null;
    private static final java.lang.String TAG = "Auth Viewmodel";
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.example.countlories.domain.MyRepository> repo, @org.jetbrains.annotations.NotNull()
    com.example.countlories.helper.LoginPreferences loginPref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getLoginProc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.countlories.data.remote.response.ResponseRegister> isRegistered() {
        return null;
    }
    
    public final void register(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass) {
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass) {
    }
    
    public final void isFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String foodId) {
    }
    
    public final void setLoginDone() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/countlories/ui/auth/AuthViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}