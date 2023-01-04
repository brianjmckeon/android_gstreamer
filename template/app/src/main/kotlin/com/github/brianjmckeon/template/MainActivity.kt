package com.github.brianjmckeon.template

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.freedesktop.gstreamer.GStreamer

class MainActivity : AppCompatActivity() {
    private external fun nativeGetGStreamerInfo(): String?

    init {
        System.loadLibrary("gstreamer_android")
        System.loadLibrary("template")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            GStreamer.init(this)
            val version = nativeGetGStreamerInfo()
            println("GStreamer version: [$version]")
        } catch(e: Exception) {
            println("Exception initing gstreamer: [$e]")
        }

        setContentView(R.layout.activity_main)
    }
}