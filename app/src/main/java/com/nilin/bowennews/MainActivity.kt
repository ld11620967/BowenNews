package com.nilin.bowennews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mob.cms.gui.CMSGUI
import com.mob.cms.gui.themes.defaultt.DefaultTheme
import com.mob.ums.gui.UMSGUI


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        CMSGUI.setTheme(DefaultTheme::class.java)
        CMSGUI.showNewsListPageWithUMSSDKUser(com.mob.ums.gui.themes.defaultt.DefaultTheme::class.java)
          //“我的”界面
//        UMSGUI.showProfilePage()
    }
}
