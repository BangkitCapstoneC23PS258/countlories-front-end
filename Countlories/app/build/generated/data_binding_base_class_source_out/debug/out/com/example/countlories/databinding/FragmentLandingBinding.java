// Generated by view binder compiler. Do not edit!
package com.example.countlories.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.countlories.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLandingBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final EditText etSearch;

  @NonNull
  public final FloatingActionButton fabCamera;

  @NonNull
  public final FloatingActionButton fabGallery;

  @NonNull
  public final FloatingActionButton fabMedia;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final ProgressBar pbLanding;

  @NonNull
  public final RecyclerView rvLanding;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView tvName;

  private FragmentLandingBinding(@NonNull CoordinatorLayout rootView, @NonNull EditText etSearch,
      @NonNull FloatingActionButton fabCamera, @NonNull FloatingActionButton fabGallery,
      @NonNull FloatingActionButton fabMedia, @NonNull ImageView imageView,
      @NonNull ImageView imageView4, @NonNull NestedScrollView nestedScrollView,
      @NonNull ProgressBar pbLanding, @NonNull RecyclerView rvLanding, @NonNull TextView textView,
      @NonNull TextView tvName) {
    this.rootView = rootView;
    this.etSearch = etSearch;
    this.fabCamera = fabCamera;
    this.fabGallery = fabGallery;
    this.fabMedia = fabMedia;
    this.imageView = imageView;
    this.imageView4 = imageView4;
    this.nestedScrollView = nestedScrollView;
    this.pbLanding = pbLanding;
    this.rvLanding = rvLanding;
    this.textView = textView;
    this.tvName = tvName;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLandingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLandingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_landing, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLandingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.et_search;
      EditText etSearch = ViewBindings.findChildViewById(rootView, id);
      if (etSearch == null) {
        break missingId;
      }

      id = R.id.fab_camera;
      FloatingActionButton fabCamera = ViewBindings.findChildViewById(rootView, id);
      if (fabCamera == null) {
        break missingId;
      }

      id = R.id.fab_gallery;
      FloatingActionButton fabGallery = ViewBindings.findChildViewById(rootView, id);
      if (fabGallery == null) {
        break missingId;
      }

      id = R.id.fab_media;
      FloatingActionButton fabMedia = ViewBindings.findChildViewById(rootView, id);
      if (fabMedia == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.nestedScrollView;
      NestedScrollView nestedScrollView = ViewBindings.findChildViewById(rootView, id);
      if (nestedScrollView == null) {
        break missingId;
      }

      id = R.id.pb_landing;
      ProgressBar pbLanding = ViewBindings.findChildViewById(rootView, id);
      if (pbLanding == null) {
        break missingId;
      }

      id = R.id.rv_landing;
      RecyclerView rvLanding = ViewBindings.findChildViewById(rootView, id);
      if (rvLanding == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.tv_name;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      return new FragmentLandingBinding((CoordinatorLayout) rootView, etSearch, fabCamera,
          fabGallery, fabMedia, imageView, imageView4, nestedScrollView, pbLanding, rvLanding,
          textView, tvName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
