package ru.netology.nerecipe

import android.app.Application
import android.content.Context

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }

    companion object {

        lateinit var appContext: Context
    }
}