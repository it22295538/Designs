package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        var tipsbtn = findViewById<ImageButton>(R.id.imageBtn_tips1)

        tipsbtn.setOnClickListener{

            val intent = Intent(this,tips::class.java)


            startActivity(intent)
        }

        var camerabtn = findViewById<ImageButton>(R.id.imageBtn_cam1)

        camerabtn.setOnClickListener{

            val intent = Intent(this,camera::class.java)


            startActivity(intent)
        }

    }
}