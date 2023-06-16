package com.example.countlories.ui.auth;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.countlories.R;

public class RegisterFragmentDirections {
  private RegisterFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFragmentRegisterToFragmentLogin() {
    return new ActionOnlyNavDirections(R.id.action_fragment_register_to_fragment_login);
  }
}
