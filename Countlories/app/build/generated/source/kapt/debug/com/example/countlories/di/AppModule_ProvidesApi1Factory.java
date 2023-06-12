// Generated by Dagger (https://dagger.dev).
package com.example.countlories.di;

import com.example.countlories.data.remote.retrofit.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesApi1Factory implements Factory<ApiService> {
  @Override
  public ApiService get() {
    return providesApi1();
  }

  public static AppModule_ProvidesApi1Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ApiService providesApi1() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesApi1());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvidesApi1Factory INSTANCE = new AppModule_ProvidesApi1Factory();
  }
}