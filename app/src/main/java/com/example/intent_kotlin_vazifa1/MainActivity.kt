package com.example.intent_kotlin_vazifa1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
        var b_open_detail = findViewById<Button>(R.id.b_open_detail)
        b_open_detail.setOnClickListener {
            openDetailActivity()
        }
    }

    fun openDetailActivity(){
        var intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("name","Azizbek")
        intent.putExtra("age", "20")
        startActivity(intent)
    }
}