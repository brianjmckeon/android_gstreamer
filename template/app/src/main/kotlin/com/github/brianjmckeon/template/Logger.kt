package com.github.brianjmckeon.template

import android.util.Log

/** Logging interface. */
interface Logger {
    companion object {
        private const val TAG = "Logger"

        /**
         * Log an exception.
         *
         * @param message A descriptive message.
         * @param exception The [Exception] to log.
         */
        fun e(message: String, exception: Exception) {
            Log.e(TAG, message, exception)
        }

        /**
         * Log an informational message.
         *
         * @param message A message.
         */
        fun i(message: String) {
            Log.i(TAG, message)
        }
    }
}