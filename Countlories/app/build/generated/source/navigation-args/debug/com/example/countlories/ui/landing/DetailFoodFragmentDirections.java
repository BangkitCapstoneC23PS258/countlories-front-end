package com.example.countlories.ui.landing;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.countlories.R;

public class DetailFoodFragmentDirections {
  private DetailFoodFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFragmentDetailPageToLandingFragment() {
    return new ActionOnlyNavDirections(R.id.action_fragment_detail_page_to_landingFragment);
  }
}
