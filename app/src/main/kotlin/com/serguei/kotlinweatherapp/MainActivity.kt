package com.serguei.kotlinweatherapp

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = "Hello Kotlin";
        toast(applicationContext, "Kotlieeeeenn")
    }

    fun AppCompatActivity.toast(context: Context, x: String) {
        Toast.makeText(context, "Testin toast $x", Toast.LENGTH_SHORT).show()
    }
}
