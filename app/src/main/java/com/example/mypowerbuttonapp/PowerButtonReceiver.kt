package com.example.mypowerbuttonapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class PowerButtonReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        when (intent.action) {
            Intent.ACTION_SCREEN_OFF -> {
                // Handle screen off event
                Log.d("PowerButtonReceiver", "Screen OFF")
            }
            Intent.ACTION_SCREEN_ON -> {
                // Handle screen on event
                Log.d("PowerButtonReceiver", "Screen ON")
            }
        }
    }
}
