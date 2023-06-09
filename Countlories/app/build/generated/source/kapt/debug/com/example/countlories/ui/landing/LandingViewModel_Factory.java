// Generated by Dagger (https://dagger.dev).
package com.example.countlories.ui.landing;

import com.example.countlories.domain.MyRepository;
import com.example.countlories.helper.LoginPreferences;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LandingViewModel_Factory implements Factory<LandingViewModel> {
  private final Provider<MyRepository> repoProvider;

  private final Provider<LoginPreferences> loginPrefProvider;

  public LandingViewModel_Factory(Provider<MyRepository> repoProvider,
      Provider<LoginPreferences> loginPrefProvider) {
    this.repoProvider = repoProvider;
    this.loginPrefProvider = loginPrefProvider;
  }

  @Override
  public LandingViewModel get() {
    return newInstance(DoubleCheck.lazy(repoProvider), loginPrefProvider.get());
  }

  public static LandingViewModel_Factory create(Provider<MyRepository> repoProvider,
      Provider<LoginPreferences> loginPrefProvider) {
    return new LandingViewModel_Factory(repoProvider, loginPrefProvider);
  }

  public static LandingViewModel newInstance(Lazy<MyRepository> repo, LoginPreferences loginPref) {
    return new LandingViewModel(repo, loginPref);
  }
}
