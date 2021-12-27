// Generated by data binding compiler. Do not edit!
package com.fuusy.newlogin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.fuusy.common.widget.MyToolbar;
import com.fuusy.newlogin.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FgLoginBinding extends ViewDataBinding {
  @NonNull
  public final Button btLogin;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final EditText etUserName;

  @NonNull
  public final TextView ivPhone;

  @NonNull
  public final MyToolbar toolbar;

  @NonNull
  public final TextView tvPassword;

  @NonNull
  public final TextView tvToRegister;

  protected FgLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btLogin, EditText etPassword, EditText etUserName, TextView ivPhone, MyToolbar toolbar,
      TextView tvPassword, TextView tvToRegister) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btLogin = btLogin;
    this.etPassword = etPassword;
    this.etUserName = etUserName;
    this.ivPhone = ivPhone;
    this.toolbar = toolbar;
    this.tvPassword = tvPassword;
    this.tvToRegister = tvToRegister;
  }

  @NonNull
  public static FgLoginBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fg_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FgLoginBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FgLoginBinding>inflateInternal(inflater, R.layout.fg_login, root, attachToRoot, component);
  }

  @NonNull
  public static FgLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fg_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FgLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FgLoginBinding>inflateInternal(inflater, R.layout.fg_login, null, false, component);
  }

  public static FgLoginBinding bind(@NonNull View view) {
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
  public static FgLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (FgLoginBinding)bind(component, view, R.layout.fg_login);
  }
}
