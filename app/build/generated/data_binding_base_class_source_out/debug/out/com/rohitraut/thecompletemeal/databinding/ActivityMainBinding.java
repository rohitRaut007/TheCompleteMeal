// Generated by view binder compiler. Do not edit!
package com.rohitraut.thecompletemeal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.rohitraut.thecompletemeal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LottieAnimationView Lottie1;

  @NonNull
  public final Button btnCalculate;

  @NonNull
  public final EditText editText;

  @NonNull
  public final EditText etHeight;

  @NonNull
  public final EditText etWeight;

  @NonNull
  public final RadioButton rbMale;

  @NonNull
  public final RadioButton rbfemale;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView tvAge;

  @NonNull
  public final TextView tvHeight;

  @NonNull
  public final TextView tvWeight;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull LottieAnimationView Lottie1, @NonNull Button btnCalculate,
      @NonNull EditText editText, @NonNull EditText etHeight, @NonNull EditText etWeight,
      @NonNull RadioButton rbMale, @NonNull RadioButton rbfemale, @NonNull TextView textView2,
      @NonNull TextView tvAge, @NonNull TextView tvHeight, @NonNull TextView tvWeight) {
    this.rootView = rootView;
    this.Lottie1 = Lottie1;
    this.btnCalculate = btnCalculate;
    this.editText = editText;
    this.etHeight = etHeight;
    this.etWeight = etWeight;
    this.rbMale = rbMale;
    this.rbfemale = rbfemale;
    this.textView2 = textView2;
    this.tvAge = tvAge;
    this.tvHeight = tvHeight;
    this.tvWeight = tvWeight;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Lottie1;
      LottieAnimationView Lottie1 = ViewBindings.findChildViewById(rootView, id);
      if (Lottie1 == null) {
        break missingId;
      }

      id = R.id.btnCalculate;
      Button btnCalculate = ViewBindings.findChildViewById(rootView, id);
      if (btnCalculate == null) {
        break missingId;
      }

      id = R.id.editText;
      EditText editText = ViewBindings.findChildViewById(rootView, id);
      if (editText == null) {
        break missingId;
      }

      id = R.id.etHeight;
      EditText etHeight = ViewBindings.findChildViewById(rootView, id);
      if (etHeight == null) {
        break missingId;
      }

      id = R.id.etWeight;
      EditText etWeight = ViewBindings.findChildViewById(rootView, id);
      if (etWeight == null) {
        break missingId;
      }

      id = R.id.rbMale;
      RadioButton rbMale = ViewBindings.findChildViewById(rootView, id);
      if (rbMale == null) {
        break missingId;
      }

      id = R.id.rbfemale;
      RadioButton rbfemale = ViewBindings.findChildViewById(rootView, id);
      if (rbfemale == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.tvAge;
      TextView tvAge = ViewBindings.findChildViewById(rootView, id);
      if (tvAge == null) {
        break missingId;
      }

      id = R.id.tvHeight;
      TextView tvHeight = ViewBindings.findChildViewById(rootView, id);
      if (tvHeight == null) {
        break missingId;
      }

      id = R.id.tvWeight;
      TextView tvWeight = ViewBindings.findChildViewById(rootView, id);
      if (tvWeight == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, Lottie1, btnCalculate, editText,
          etHeight, etWeight, rbMale, rbfemale, textView2, tvAge, tvHeight, tvWeight);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
