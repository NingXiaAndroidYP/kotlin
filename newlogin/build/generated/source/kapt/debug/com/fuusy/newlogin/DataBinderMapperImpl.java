package com.fuusy.newlogin;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.fuusy.newlogin.databinding.AcLoginBindingImpl;
import com.fuusy.newlogin.databinding.FgLoginBindingImpl;
import com.fuusy.newlogin.databinding.FgRegisterBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACLOGIN = 1;

  private static final int LAYOUT_FGLOGIN = 2;

  private static final int LAYOUT_FGREGISTER = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fuusy.newlogin.R.layout.ac_login, LAYOUT_ACLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fuusy.newlogin.R.layout.fg_login, LAYOUT_FGLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fuusy.newlogin.R.layout.fg_register, LAYOUT_FGREGISTER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACLOGIN: {
          if ("layout/ac_login_0".equals(tag)) {
            return new AcLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for ac_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FGLOGIN: {
          if ("layout/fg_login_0".equals(tag)) {
            return new FgLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fg_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FGREGISTER: {
          if ("layout/fg_register_0".equals(tag)) {
            return new FgRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fg_register is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.fuusy.common.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/ac_login_0", com.fuusy.newlogin.R.layout.ac_login);
      sKeys.put("layout/fg_login_0", com.fuusy.newlogin.R.layout.fg_login);
      sKeys.put("layout/fg_register_0", com.fuusy.newlogin.R.layout.fg_register);
    }
  }
}
