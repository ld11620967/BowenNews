package com.nilin.bowennews

import android.app.Application
import com.mob.MobApplication
import com.mob.MobSDK


/**
 * Created by liangd on 2017/11/16.
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        MobSDK.init(this)
    }
}