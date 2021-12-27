// Generated by data binding compiler. Do not edit!
package com.fuusy.newlogin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.fuusy.common.widget.MyToolbar;
import com.fuusy.newlogin.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FgRegisterBinding extends ViewDataBinding {
  @NonNull
  public final MyToolbar toolbar;

  protected FgRegisterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MyToolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.toolbar = toolbar;
  }

  @NonNull
  public static FgRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fg_register, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FgRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FgRegisterBinding>inflateInternal(inflater, R.layout.fg_register, root, attachToRoot, component);
  }

  @NonNull
  public static FgRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fg_register, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FgRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FgRegisterBinding>inflateInternal(inflater, R.layout.fg_register, null, false, component);
  }

  public static FgRegisterBinding bind(@NonNull View view) {
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
  public static FgRegisterBinding bind(@NonNull View view, @Nullable Object component) {
    return (FgRegisterBinding)bind(component, view, R.layout.fg_register);
  }
}
