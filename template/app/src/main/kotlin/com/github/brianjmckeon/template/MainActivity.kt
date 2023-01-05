package com.github.brianjmckeon.template

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Logger.i("GStreamer version: [${GStreamer.version()}]")
        setContentView(R.layout.activity_main)
    }
}