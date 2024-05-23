package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class tips : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips)

        var homebtn = findViewById<ImageButton>(R.id.imageBtn_home2)

        homebtn.setOnClickListener{

            val intent = Intent(this,Home::class.java)


            startActivity(intent)
        }

        var camerabtn2 = findViewById<ImageButton>(R.id.imageBtn_cam2)
                camerabtn2.setOnClickListener{

            val intent = Intent(this,camera::class.java)


            startActivity(intent)
        }
    }
}