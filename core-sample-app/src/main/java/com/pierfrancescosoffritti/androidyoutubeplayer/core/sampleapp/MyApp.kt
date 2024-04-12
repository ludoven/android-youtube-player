package com.pierfrancescosoffritti.androidyoutubeplayer.core.sampleapp

import android.app.Application
import androidx.multidex.MultiDex

/**
 *
 *  author： ludoven
 *  date :   2024/4/11 14:47
 *
 */
class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this)
    }
}