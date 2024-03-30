package com.example.intent_kotlin_vazifa1

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity:AppCompatActivity() {
    val TAG = DetailActivity::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initViews()
    }

    fun initViews(){
        var tv_detail = findViewById<TextView>(R.id.tv_detail)

        var name = intent.getStringExtra("name")
        Log.d(TAG, name!!)

        var age = intent.getStringExtra("age")
        Log.d(TAG, age!!)

        tv_detail.setText("Name: "+name + " Age: "+age)
    }
}