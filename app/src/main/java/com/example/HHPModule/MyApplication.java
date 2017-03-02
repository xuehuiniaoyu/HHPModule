package com.example.HHPModule;

import android.content.Context;
import com.huan.hhp.PluginApplication;

/**
 * Created by tjy on 2017/3/2 0002.
 * 如果有自定义view或引用第三方工程时重写PluginApplication
 */
public class MyApplication extends PluginApplication {
    public MyApplication(Context context) {
        super(context);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
