package com.fpp.recycleviewdemo.base.app;

import android.support.multidex.MultiDexApplication;

import com.fpp.recycleviewdemo.BuildConfig;
import com.fpp.recycleviewdemo.utils.LogUtils;
import com.fpp.recycleviewdemo.utils.Utils;

import java.util.logging.Logger;

/**
 * @Description  App
 * @Author fpp
 * @Date 2019/1/6 0006 23:28
 */
public class App extends MultiDexApplication {

    private static App appContext;

    public static App getInstance() {
        return appContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
        Utils.init(this);

        LogUtils.isDebug = true;

    }
}
