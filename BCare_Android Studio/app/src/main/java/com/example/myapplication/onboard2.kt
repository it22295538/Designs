package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class onboard2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard2)

        var nextButton = findViewById<ImageButton>(R.id.btn_next2)

        nextButton.setOnClickListener{

            val intent = Intent(this,onboard3::class.java)


            startActivity(intent)
        }
    }
}