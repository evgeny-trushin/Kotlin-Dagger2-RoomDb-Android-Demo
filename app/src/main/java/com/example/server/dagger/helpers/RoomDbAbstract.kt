package com.example.server.dagger.helpers

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.example.server.dagger.models.dao.TestDao
import com.example.server.dagger.models.dao.TestTable
import dagger.Module
import dagger.Provides
import javax.inject.Singleton



@Database(entities = [TestTable::class], version = 1)
abstract class RoomDbAbstract : RoomDatabase() {

    abstract fun roomDao(): TestDao

    companion object {

        @JvmStatic
        lateinit var instance: RoomDbAbstract

        @JvmStatic
        fun init(context: Context, dbName: String = "ktDemo") {
            instance = Room.databaseBuilder(context, RoomDbAbstract::class.java, dbName)
                    // allow queries on the main thread.
                    // Don't do this on a real app! See PersistenceBasicSample for an example.
                    // TODO Replace with the threads poll.
                    .allowMainThreadQueries()
                    .build()

        }
    }
}