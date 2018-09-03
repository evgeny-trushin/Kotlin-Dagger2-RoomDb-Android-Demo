package com.example.server.dagger.helpers

import com.example.server.dagger.models.dao.TestDao

import dagger.Module
import dagger.Provides
import javax.inject.Singleton
@Module
class RoomDbModule {


    @Provides
    @ApplicationScope
    fun roomTestDao(): TestDao = RoomDbAbstract.instance.roomDao()

}
