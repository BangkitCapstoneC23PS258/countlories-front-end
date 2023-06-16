package com.example.countlories.ui.landing;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.countlories.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class LandingFragmentDirections {
  private LandingFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLandingFragmentToFragmentLogin() {
    return new ActionOnlyNavDirections(R.id.action_landingFragment_to_fragment_login);
  }

  @NonNull
  public static ActionLandingFragmentToFragmentDetailPage actionLandingFragmentToFragmentDetailPage(
      @NonNull String img, @NonNull String foodName, @NonNull String foodDesc,
      @NonNull String foodCal, @NonNull String foodFat, @NonNull String foodCarb,
      @NonNull String foodProtein, @NonNull String foodId) {
    return new ActionLandingFragmentToFragmentDetailPage(img, foodName, foodDesc, foodCal, foodFat, foodCarb, foodProtein, foodId);
  }

  public static class ActionLandingFragmentToFragmentDetailPage implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionLandingFragmentToFragmentDetailPage(@NonNull String img, @NonNull String foodName,
        @NonNull String foodDesc, @NonNull String foodCal, @NonNull String foodFat,
        @NonNull String foodCarb, @NonNull String foodProtein, @NonNull String foodId) {
      if (img == null) {
        throw new IllegalArgumentException("Argument \"img\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("img", img);
      if (foodName == null) {
        throw new IllegalArgumentException("Argument \"food_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("food_name", foodName);
      if (foodDesc == null) {
        throw new IllegalArgumentException("Argument \"food_desc\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("food_desc", foodDesc);
      if (foodCal == null) {
        throw new IllegalArgumentException("Argument \"food_cal\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("food_cal", foodCal);
      if (foodFat == null) {
        throw new IllegalArgumentException("Argument \"food_fat\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("food_fat", foodFat);
      if (foodCarb == null) {
        throw new IllegalArgumentException("Argument \"food_carb\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("food_carb", foodCarb);
      if (foodProtein == null) {
        throw new IllegalArgumentException("Argument \"food_protein\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("food_protein", foodProtein);
      if (foodId == null) {
        throw new IllegalArgumentException("Argument \"food_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("food_id", foodId);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionLandingFragmentToFragmentDetailPage setImg(@NonNull String img) {
      if (img == null) {
        throw new IllegalArgumentException("Argument \"img\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("img", img);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionLandingFragmentToFragmentDetailPage setFoodName(@NonNull String foodName) {
      if (foodName == null) {
        throw new IllegalArgumentException("Argument \"food_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("food_name", foodName);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionLandingFragmentToFragmentDetailPage setFoodDesc(@NonNull String foodDesc) {
      if (foodDesc == null) {
        throw new IllegalArgumentException("Argument \"food_desc\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("food_desc", foodDesc);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionLandingFragmentToFragmentDetailPage setFoodCal(@NonNull String foodCal) {
      if (foodCal == null) {
        throw new IllegalArgumentException("Argument \"food_cal\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("food_cal", foodCal);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionLandingFragmentToFragmentDetailPage setFoodFat(@NonNull String foodFat) {
      if (foodFat == null) {
        throw new IllegalArgumentException("Argument \"food_fat\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("food_fat", foodFat);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionLandingFragmentToFragmentDetailPage setFoodCarb(@NonNull String foodCarb) {
      if (foodCarb == null) {
        throw new IllegalArgumentException("Argument \"food_carb\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("food_carb", foodCarb);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionLandingFragmentToFragmentDetailPage setFoodProtein(@NonNull String foodProtein) {
      if (foodProtein == null) {
        throw new IllegalArgumentException("Argument \"food_protein\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("food_protein", foodProtein);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionLandingFragmentToFragmentDetailPage setFoodId(@NonNull String foodId) {
      if (foodId == null) {
        throw new IllegalArgumentException("Argument \"food_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("food_id", foodId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("img")) {
        String img = (String) arguments.get("img");
        __result.putString("img", img);
      }
      if (arguments.containsKey("food_name")) {
        String foodName = (String) arguments.get("food_name");
        __result.putString("food_name", foodName);
      }
      if (arguments.containsKey("food_desc")) {
        String foodDesc = (String) arguments.get("food_desc");
        __result.putString("food_desc", foodDesc);
      }
      if (arguments.containsKey("food_cal")) {
        String foodCal = (String) arguments.get("food_cal");
        __result.putString("food_cal", foodCal);
      }
      if (arguments.containsKey("food_fat")) {
        String foodFat = (String) arguments.get("food_fat");
        __result.putString("food_fat", foodFat);
      }
      if (arguments.containsKey("food_carb")) {
        String foodCarb = (String) arguments.get("food_carb");
        __result.putString("food_carb", foodCarb);
      }
      if (arguments.containsKey("food_protein")) {
        String foodProtein = (String) arguments.get("food_protein");
        __result.putString("food_protein", foodProtein);
      }
      if (arguments.containsKey("food_id")) {
        String foodId = (String) arguments.get("food_id");
        __result.putString("food_id", foodId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_landingFragment_to_fragment_detail_page;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getImg() {
      return (String) arguments.get("img");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getFoodName() {
      return (String) arguments.get("food_name");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getFoodDesc() {
      return (String) arguments.get("food_desc");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getFoodCal() {
      return (String) arguments.get("food_cal");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getFoodFat() {
      return (String) arguments.get("food_fat");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getFoodCarb() {
      return (String) arguments.get("food_carb");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getFoodProtein() {
      return (String) arguments.get("food_protein");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getFoodId() {
      return (String) arguments.get("food_id");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionLandingFragmentToFragmentDetailPage that = (ActionLandingFragmentToFragmentDetailPage) object;
      if (arguments.containsKey("img") != that.arguments.containsKey("img")) {
        return false;
      }
      if (getImg() != null ? !getImg().equals(that.getImg()) : that.getImg() != null) {
        return false;
      }
      if (arguments.containsKey("food_name") != that.arguments.containsKey("food_name")) {
        return false;
      }
      if (getFoodName() != null ? !getFoodName().equals(that.getFoodName()) : that.getFoodName() != null) {
        return false;
      }
      if (arguments.containsKey("food_desc") != that.arguments.containsKey("food_desc")) {
        return false;
      }
      if (getFoodDesc() != null ? !getFoodDesc().equals(that.getFoodDesc()) : that.getFoodDesc() != null) {
        return false;
      }
      if (arguments.containsKey("food_cal") != that.arguments.containsKey("food_cal")) {
        return false;
      }
      if (getFoodCal() != null ? !getFoodCal().equals(that.getFoodCal()) : that.getFoodCal() != null) {
        return false;
      }
      if (arguments.containsKey("food_fat") != that.arguments.containsKey("food_fat")) {
        return false;
      }
      if (getFoodFat() != null ? !getFoodFat().equals(that.getFoodFat()) : that.getFoodFat() != null) {
        return false;
      }
      if (arguments.containsKey("food_carb") != that.arguments.containsKey("food_carb")) {
        return false;
      }
      if (getFoodCarb() != null ? !getFoodCarb().equals(that.getFoodCarb()) : that.getFoodCarb() != null) {
        return false;
      }
      if (arguments.containsKey("food_protein") != that.arguments.containsKey("food_protein")) {
        return false;
      }
      if (getFoodProtein() != null ? !getFoodProtein().equals(that.getFoodProtein()) : that.getFoodProtein() != null) {
        return false;
      }
      if (arguments.containsKey("food_id") != that.arguments.containsKey("food_id")) {
        return false;
      }
      if (getFoodId() != null ? !getFoodId().equals(that.getFoodId()) : that.getFoodId() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getImg() != null ? getImg().hashCode() : 0);
      result = 31 * result + (getFoodName() != null ? getFoodName().hashCode() : 0);
      result = 31 * result + (getFoodDesc() != null ? getFoodDesc().hashCode() : 0);
      result = 31 * result + (getFoodCal() != null ? getFoodCal().hashCode() : 0);
      result = 31 * result + (getFoodFat() != null ? getFoodFat().hashCode() : 0);
      result = 31 * result + (getFoodCarb() != null ? getFoodCarb().hashCode() : 0);
      result = 31 * result + (getFoodProtein() != null ? getFoodProtein().hashCode() : 0);
      result = 31 * result + (getFoodId() != null ? getFoodId().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionLandingFragmentToFragmentDetailPage(actionId=" + getActionId() + "){"
          + "img=" + getImg()
          + ", foodName=" + getFoodName()
          + ", foodDesc=" + getFoodDesc()
          + ", foodCal=" + getFoodCal()
          + ", foodFat=" + getFoodFat()
          + ", foodCarb=" + getFoodCarb()
          + ", foodProtein=" + getFoodProtein()
          + ", foodId=" + getFoodId()
          + "}";
    }
  }
}
