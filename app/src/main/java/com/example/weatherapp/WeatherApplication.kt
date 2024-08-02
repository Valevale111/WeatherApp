package com.example.weatherapp

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class WeatherApplication :Application(){
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context:Context
        private const val TOKEN = "1TPsPRRMB3UR5Efg"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}