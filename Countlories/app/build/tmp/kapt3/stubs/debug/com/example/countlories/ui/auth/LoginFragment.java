package com.example.countlories.ui.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0016H\u0016J\u001a\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010$\u001a\u00020\u0016H\u0002J\u0012\u0010%\u001a\u00020\u00162\b\b\u0002\u0010&\u001a\u00020\'H\u0002J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006,"}, d2 = {"Lcom/example/countlories/ui/auth/LoginFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "()V", "_binding", "Lcom/example/countlories/databinding/FragmentLoginBinding;", "binding", "getBinding", "()Lcom/example/countlories/databinding/FragmentLoginBinding;", "loginPref", "Lcom/example/countlories/helper/LoginPreferences;", "getLoginPref", "()Lcom/example/countlories/helper/LoginPreferences;", "setLoginPref", "(Lcom/example/countlories/helper/LoginPreferences;)V", "viewModel", "Lcom/example/countlories/ui/auth/AuthViewModel;", "getViewModel", "()Lcom/example/countlories/ui/auth/AuthViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "loginFun", "", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "setupModel", "showLoading", "isLoading", "", "toastMaker", "msg", "", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LoginFragment extends androidx.fragment.app.Fragment implements android.view.View.OnClickListener {
    private com.example.countlories.databinding.FragmentLoginBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject()
    public com.example.countlories.helper.LoginPreferences loginPref;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.countlories.ui.auth.LoginFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "Fragment Login";
    
    public LoginFragment() {
        super();
    }
    
    private final com.example.countlories.databinding.FragmentLoginBinding getBinding() {
        return null;
    }
    
    private final com.example.countlories.ui.auth.AuthViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.countlories.helper.LoginPreferences getLoginPref() {
        return null;
    }
    
    public final void setLoginPref(@org.jetbrains.annotations.NotNull()
    com.example.countlories.helper.LoginPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void setupModel() {
    }
    
    private final void toastMaker(java.lang.String msg) {
    }
    
    private final void showLoading(boolean isLoading) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void loginFun() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/countlories/ui/auth/LoginFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}