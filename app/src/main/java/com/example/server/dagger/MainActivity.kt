package com.example.server.dagger

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.server.dagger.helpers.DaggerActivityComponent
import com.example.server.dagger.models.dao.TestDao
import com.example.server.dagger.models.dao.TestTable
import com.example.server.eudaggerdemo.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var testDao: TestDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerActivityComponent.create().inject(this)
        setContentView(R.layout.activity_main)
        //TODO show data
        testDao.insert(TestTable("Test"))
        val data = testDao.getAll()
        Log.d(MainActivity::javaClass::class.java.simpleName, data.toString())
    }
}
