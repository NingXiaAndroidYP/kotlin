package com.fuusy.webview;

import java.lang.System;

/**
 * @date：2021/5/20
 * @author fuusy
 * @instruction： 动态添加和删除WebView
 */
@com.alibaba.android.arouter.facade.annotation.Route(path = "/module_web/WebviewActivity")
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u0011\u001a\u00020\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/fuusy/webview/WebviewActivity;", "Lcom/fuusy/common/base/BaseActivity;", "Lcom/fuusy/webview/databinding/ActivityWebviewBinding;", "()V", "mWebView", "Landroid/webkit/WebView;", "getLayoutId", "", "initData", "", "savedInstanceState", "Landroid/os/Bundle;", "initToolbar", "title", "", "initWebView", "path", "onDestroy", "webview_debug"})
public final class WebviewActivity extends com.fuusy.common.base.BaseActivity<com.fuusy.webview.databinding.ActivityWebviewBinding> {
    private android.webkit.WebView mWebView;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void initData(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initWebView(java.lang.String path) {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void initToolbar(java.lang.String title) {
    }
    
    public WebviewActivity() {
        super();
    }
}