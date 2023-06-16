package com.example.countlories.ui.auth;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.countlories.R;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFragmentLoginToLandingFragment() {
    return new ActionOnlyNavDirections(R.id.action_fragment_login_to_landingFragment);
  }

  @NonNull
  public static NavDirections actionFragmentLoginToFragmentRegister() {
    return new ActionOnlyNavDirections(R.id.action_fragment_login_to_fragment_register);
  }
}
