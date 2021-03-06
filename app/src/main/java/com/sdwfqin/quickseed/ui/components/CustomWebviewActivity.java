package com.sdwfqin.quickseed.ui.components;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.qmuiteam.qmui.util.QMUIStatusBarHelper;
import com.sdwfqin.quicklib.webview.BaseWebView;

/**
 * 描述：自定义Webview
 *
 * @author zhangqin
 * @date 2018/6/19
 */
public class CustomWebviewActivity extends BaseWebView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        QMUIStatusBarHelper.setStatusBarLightMode(mContext);
    }

    @Override
    public String getUrl() {
        return "https://www.baidu.com";
    }

    @Override
    public String getActivityTitle() {
        return "sdwfqin.com";
    }
}
