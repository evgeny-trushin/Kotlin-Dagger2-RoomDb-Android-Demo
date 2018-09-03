package com.example.server.dagger.models.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.example.server.dagger.helpers.BaseDao

@Dao
interface TestDao : BaseDao<TestTable> {
    @Query("SELECT * FROM testTbl")
    fun getAll(): List<TestTable>
}