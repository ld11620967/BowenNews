package com.nilin.bowennews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mob.cms.gui.CMSGUI
import com.mob.cms.gui.themes.defaultt.DefaultTheme


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 先设置界面主题，不同的主题对应不同的界面风格
        CMSGUI.setTheme(DefaultTheme::class.java)

        // 如果您希望用户以“游客”的身份查看资讯和进行评论
        CMSGUI.showNewsListPageWithAnonymousUser();

    }
}
