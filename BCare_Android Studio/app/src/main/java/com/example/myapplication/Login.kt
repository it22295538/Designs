package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ProgressBar

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

       var nextButton = findViewById<ImageButton>(R.id.btn_next)

        nextButton.setOnClickListener{

            val intent = Intent(this,onboard2::class.java)


            startActivity(intent)
    }
}
}