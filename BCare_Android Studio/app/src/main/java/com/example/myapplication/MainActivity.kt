package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val startButton = findViewById<ProgressBar>(R.id.bar_start)

        startButton.setOnClickListener{

            val intent = Intent(this,Login::class.java)


            startActivity(intent)


      }
    }
}