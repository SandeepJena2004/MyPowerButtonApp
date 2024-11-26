package com.example.mypowerbuttonapp

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class PowerButtonService : Service() {

    override fun onBind(intent: Intent?): IBinder? {
        // Service binding is not used in this example
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Start the service in the foreground
        Log.d("PowerButtonService", "Service started")
        return START_STICKY
    }
}
