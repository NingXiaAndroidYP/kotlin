// Generated by data binding compiler. Do not edit!
package com.fuusy.project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.fuusy.project.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemProjectContentBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivProjectIcon;

  @NonNull
  public final TextView tvProjectName;

  @NonNull
  public final TextView tvSubName;

  protected ItemProjectContentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivProjectIcon, TextView tvProjectName, TextView tvSubName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivProjectIcon = ivProjectIcon;
    this.tvProjectName = tvProjectName;
    this.tvSubName = tvSubName;
  }

  @NonNull
  public static ItemProjectContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_project_content, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemProjectContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemProjectContentBinding>inflateInternal(inflater, R.layout.item_project_content, root, attachToRoot, component);
  }

  @NonNull
  public static ItemProjectContentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_project_content, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemProjectContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemProjectContentBinding>inflateInternal(inflater, R.layout.item_project_content, null, false, component);
  }

  public static ItemProjectContentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemProjectContentBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemProjectContentBinding)bind(component, view, R.layout.item_project_content);
  }
}
