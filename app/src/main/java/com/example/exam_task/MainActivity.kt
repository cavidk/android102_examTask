package com.example.exam_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment()


    }

    fun addFragment(){

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.myContainer,Sign_in())
        transaction.commit()

    }
}