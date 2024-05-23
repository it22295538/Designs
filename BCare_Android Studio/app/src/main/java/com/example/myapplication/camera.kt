package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class camera : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        var tipsbtn = findViewById<ImageButton>(R.id.imageBtn_tips3)

        tipsbtn.setOnClickListener{

            val intent = Intent(this,tips::class.java)


            startActivity(intent)
        }

        var homebtn = findViewById<ImageButton>(R.id.imageBtn_home3)

        homebtn.setOnClickListener{

            val intent = Intent(this,Home::class.java)


            startActivity(intent)
        }
    }
}