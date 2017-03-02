package com.test.build;
import com.huan.builder.Builder;
import com.huan.builder.BuilderUtil;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/3/2 0002.
 */
public class BuildMain {
    public static void main(String[] args) throws IOException {
//        Builder.b("app/build/outputs/apk/app-debug.apk", "D:/Tomcat7/webapps/HHybridPlugin/HHPModule", "app.zip"/*, "app/src/main/res/layout"*/);
//        BuilderUtil.copyFile(new File("app/src/main/res/layout/main_layout.xml"), new File("D:/Tomcat7/webapps/HHybridPlugin/HHPModule/main_layout.xml"));
        BuilderUtil.copyFile(new File("app/src/main/app_config.xml"), new File("D:/Tomcat7/webapps/HHybridPlugin/HHPModule/app_config.xml"));
    }
}
