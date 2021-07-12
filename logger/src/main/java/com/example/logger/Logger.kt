package com.example.logger

import android.util.Log

object Logger {

    fun projectDebugLogs(msg: String) {
        Log.d("DebugLog ==>", "$msg")
    }

    fun projectErrorLogs(msg: String) {
        Log.d("ErrorLog ==>", "$msg")
    }
}