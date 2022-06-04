package com.example.davaleba8

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

private var TAG= MyBroadcastReceiver::class.simpleName


class MyBroadcastReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        Log.d(TAG, "onRecive")


    }
}