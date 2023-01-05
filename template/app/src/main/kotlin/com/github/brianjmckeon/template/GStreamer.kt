package com.github.brianjmckeon.template

import android.content.Context

abstract class GStreamer {
    companion object {
        @JvmStatic
        private external fun nativeGetGStreamerInfo(): String?

        fun init(context: Context) {
            try {
                System.loadLibrary("gstreamer_android")
                System.loadLibrary("template")
                org.freedesktop.gstreamer.GStreamer.init(context)
            } catch (e: Exception) {
                println("Couldn't init GStreamer: [$e]")
            }
        }

        fun version(): String? {
            return nativeGetGStreamerInfo()
        }
    }
}