package com.example.mypowerbuttonapp

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Check for WRITE_SETTINGS permission
        if (Settings.System.canWrite(this)) {
            // You have permission, proceed with your functionality
            startPowerButtonService()
        } else {
            val intent = Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS)
            startActivity(intent)
        }
    }

    private fun startPowerButtonService() {
        // Start the service to monitor power button presses
        val serviceIntent = Intent(this, PowerButtonService::class.java)
        ContextCompat.startForegroundService(this, serviceIntent)
    }
}
