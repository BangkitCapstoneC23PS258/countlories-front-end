package com.example.countlories.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J#\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J+\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J#\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J+\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J#\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/example/countlories/domain/MyRepository;", "", "addToFavorite", "Lcom/example/countlories/data/remote/response/ResponseRegister;", "userId", "", "foodId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addToTracker", "getAllFood", "", "Lcom/example/countlories/data/remote/response/OutputItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFoodByName", "name", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFoodName", "Lcom/example/countlories/data/remote/response/ResponseImageFood;", "file", "Lokhttp3/MultipartBody$Part;", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavorite", "Lcom/example/countlories/data/remote/response/ResponseCheckFavorite;", "token", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/example/countlories/data/remote/response/ResponseLogin;", "email", "pass", "register", "username", "removeFromFavorite", "app_debug"})
public abstract interface MyRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object register(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.countlories.data.remote.response.ResponseRegister> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.countlories.data.remote.response.ResponseLogin> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFoodName(@org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.countlories.data.remote.response.ResponseImageFood> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFoodByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.countlories.data.remote.response.OutputItem>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllFood(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.countlories.data.remote.response.OutputItem>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addToTracker(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String foodId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.countlories.data.remote.response.ResponseRegister> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String foodId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.countlories.data.remote.response.ResponseCheckFavorite> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addToFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String foodId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.countlories.data.remote.response.ResponseRegister> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeFromFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String foodId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.countlories.data.remote.response.ResponseRegister> continuation);
}