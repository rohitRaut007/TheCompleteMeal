// Generated by view binder compiler. Do not edit!
package com.rohitraut.thecompletemeal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.rohitraut.thecompletemeal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RecepieLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final TextView recipeDesc;

  @NonNull
  public final ImageView recipeImg;

  @NonNull
  public final TextView recipeTitle;

  private RecepieLayoutBinding(@NonNull LinearLayoutCompat rootView, @NonNull TextView recipeDesc,
      @NonNull ImageView recipeImg, @NonNull TextView recipeTitle) {
    this.rootView = rootView;
    this.recipeDesc = recipeDesc;
    this.recipeImg = recipeImg;
    this.recipeTitle = recipeTitle;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static RecepieLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RecepieLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.recepie_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RecepieLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.recipe_desc;
      TextView recipeDesc = ViewBindings.findChildViewById(rootView, id);
      if (recipeDesc == null) {
        break missingId;
      }

      id = R.id.recipe_img;
      ImageView recipeImg = ViewBindings.findChildViewById(rootView, id);
      if (recipeImg == null) {
        break missingId;
      }

      id = R.id.recipe_title;
      TextView recipeTitle = ViewBindings.findChildViewById(rootView, id);
      if (recipeTitle == null) {
        break missingId;
      }

      return new RecepieLayoutBinding((LinearLayoutCompat) rootView, recipeDesc, recipeImg,
          recipeTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
