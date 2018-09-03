package com.example.server.dagger.helpers

import com.example.server.dagger.MainActivity
import com.example.server.dagger.models.dao.TestDao
import dagger.Component
import javax.inject.Singleton

@Component(modules = [RoomDbModule::class])
@ApplicationScope
interface ActivityComponent {
    fun getTestDao(): TestDao
    fun inject(mainActivity: MainActivity)
}
