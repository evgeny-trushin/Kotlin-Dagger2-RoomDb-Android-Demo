package com.example.server.dagger

import android.app.Activity
import android.app.Application
import com.example.server.dagger.helpers.RoomDbAbstract
import dagger.android.AndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class TestApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var androidInjector: AndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> = androidInjector
    override fun onCreate() {
        super.onCreate()
        RoomDbAbstract.init(applicationContext)
    }
}
