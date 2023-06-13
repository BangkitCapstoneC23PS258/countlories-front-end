package com.example.countlories.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\bH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/countlories/di/AppModule;", "", "()V", "provideRepository", "Lcom/example/countlories/domain/MyRepository;", "api", "Lcom/example/countlories/data/remote/retrofit/ApiService;", "apiML", "Lcom/example/countlories/data/remote/retrofit/ApiServiceML;", "providesApi", "providesApiML", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.countlories.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.countlories.data.remote.retrofit.ApiService providesApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.countlories.data.remote.retrofit.ApiServiceML providesApiML() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.countlories.domain.MyRepository provideRepository(@org.jetbrains.annotations.NotNull()
    com.example.countlories.data.remote.retrofit.ApiService api, @org.jetbrains.annotations.NotNull()
    com.example.countlories.data.remote.retrofit.ApiServiceML apiML) {
        return null;
    }
}