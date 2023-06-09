// Generated by Dagger (https://dagger.dev).
package com.example.countlories.helper;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginPreferences_Factory implements Factory<LoginPreferences> {
  private final Provider<Context> contextProvider;

  public LoginPreferences_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public LoginPreferences get() {
    return newInstance(contextProvider.get());
  }

  public static LoginPreferences_Factory create(Provider<Context> contextProvider) {
    return new LoginPreferences_Factory(contextProvider);
  }

  public static LoginPreferences newInstance(Context context) {
    return new LoginPreferences(context);
  }
}
