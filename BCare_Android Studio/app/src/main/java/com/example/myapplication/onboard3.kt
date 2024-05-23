package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class onboard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard3)

        var nextButton = findViewById<Button>(R.id.btn_getStarted)

        nextButton.setOnClickListener{

            val intent = Intent(this,logInform::class.java)


            startActivity(intent)
        }
    }
}