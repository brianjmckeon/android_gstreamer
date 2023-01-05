package com.github.brianjmckeon.template

import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        GStreamer.init(this)
    }
}