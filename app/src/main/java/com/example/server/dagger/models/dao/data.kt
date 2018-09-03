package com.example.server.dagger.models.dao

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "testTbl")
data class TestTable(
        val test: String
) {
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}