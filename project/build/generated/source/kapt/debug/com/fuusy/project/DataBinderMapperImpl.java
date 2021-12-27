package com.fuusy.project;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.fuusy.project.databinding.FragmentProjectBindingImpl;
import com.fuusy.project.databinding.FragmentProjectContentBindingImpl;
import com.fuusy.project.databinding.ItemProjectAllBindingImpl;
import com.fuusy.project.databinding.ItemProjectContentBindingImpl;
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
  private static final int LAYOUT_FRAGMENTPROJECT = 1;

  private static final int LAYOUT_FRAGMENTPROJECTCONTENT = 2;

  private static final int LAYOUT_ITEMPROJECTALL = 3;

  private static final int LAYOUT_ITEMPROJECTCONTENT = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fuusy.project.R.layout.fragment_project, LAYOUT_FRAGMENTPROJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fuusy.project.R.layout.fragment_project_content, LAYOUT_FRAGMENTPROJECTCONTENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fuusy.project.R.layout.item_project_all, LAYOUT_ITEMPROJECTALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fuusy.project.R.layout.item_project_content, LAYOUT_ITEMPROJECTCONTENT);
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
        case  LAYOUT_FRAGMENTPROJECT: {
          if ("layout/fragment_project_0".equals(tag)) {
            return new FragmentProjectBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_project is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROJECTCONTENT: {
          if ("layout/fragment_project_content_0".equals(tag)) {
            return new FragmentProjectContentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_project_content is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPROJECTALL: {
          if ("layout/item_project_all_0".equals(tag)) {
            return new ItemProjectAllBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_project_all is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPROJECTCONTENT: {
          if ("layout/item_project_content_0".equals(tag)) {
            return new ItemProjectContentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_project_content is invalid. Received: " + tag);
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
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/fragment_project_0", com.fuusy.project.R.layout.fragment_project);
      sKeys.put("layout/fragment_project_content_0", com.fuusy.project.R.layout.fragment_project_content);
      sKeys.put("layout/item_project_all_0", com.fuusy.project.R.layout.item_project_all);
      sKeys.put("layout/item_project_content_0", com.fuusy.project.R.layout.item_project_content);
    }
  }
}
