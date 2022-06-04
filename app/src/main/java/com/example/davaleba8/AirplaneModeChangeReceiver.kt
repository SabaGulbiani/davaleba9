package com.example.davaleba8

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangeReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        var isAirplaneModeEnabled: Boolean = intent?.getBooleanExtra( "state", false) ?: return

        if(isAirplaneModeEnabled) {
            Toast.makeText(context, "airplane mode enabled", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context, "airplane mode enabled", Toast.LENGTH_LONG).show()

        }
    }
}