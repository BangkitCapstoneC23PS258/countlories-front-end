package com.example.countlories.data.remote.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ-\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ-\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/countlories/data/remote/retrofit/ApiService;", "", "RegisterUser", "Lretrofit2/Response;", "Lcom/example/countlories/data/remote/response/ResponseRegister;", "body", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addToFavorite", "addToTrack", "getAllFood", "Lcom/example/countlories/data/remote/response/ResponseFood;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFoodByName", "foodName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavorite", "Lcom/example/countlories/data/remote/response/ResponseCheckFavorite;", "token", "userId", "foodId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginUser", "Lcom/example/countlories/data/remote/response/ResponseLogin;", "removeFromFavorite", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmSuppressWildcards()
    @retrofit2.http.POST(value = "login")
    public abstract java.lang.Object loginUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.Map<java.lang.String, java.lang.Object> body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<retrofit2.Response<com.example.countlories.data.remote.response.ResponseLogin>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmSuppressWildcards()
    @retrofit2.http.POST(value = "register")
    public abstract java.lang.Object RegisterUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.Map<java.lang.String, java.lang.Object> body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<retrofit2.Response<com.example.countlories.data.remote.response.ResponseRegister>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "getfoodname/{name}")
    public abstract java.lang.Object getFoodByName(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "name")
    java.lang.String foodName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.countlories.data.remote.response.ResponseFood>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "getfood")
    public abstract java.lang.Object getAllFood(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.countlories.data.remote.response.ResponseFood>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmSuppressWildcards()
    @retrofit2.http.POST(value = "posttracker")
    public abstract java.lang.Object addToTrack(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.Map<java.lang.String, java.lang.Object> body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<retrofit2.Response<com.example.countlories.data.remote.response.ResponseRegister>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "getfavid/{userId}/{foodId}")
    public abstract java.lang.Object isFavorite(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "userId")
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "foodId")
    java.lang.String foodId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.countlories.data.remote.response.ResponseCheckFavorite>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmSuppressWildcards()
    @retrofit2.http.POST(value = "postfav")
    public abstract java.lang.Object addToFavorite(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.Map<java.lang.String, java.lang.Object> body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<retrofit2.Response<com.example.countlories.data.remote.response.ResponseRegister>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "deletefav/{userId}/{foodId}")
    public abstract java.lang.Object removeFromFavorite(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "userId")
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "foodId")
    java.lang.String foodId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.countlories.data.remote.response.ResponseRegister>> continuation);
}