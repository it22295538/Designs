package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class logInform : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_inform)

        var nextButton = findViewById<View>(R.id.btn_login)

        nextButton.setOnClickListener{

            val intent = Intent(this,Home::class.java)


            startActivity(intent)
        }


        var signup = findViewById<View>(R.id.tv_signUp)

        signup.setOnClickListener{

            val intent = Intent(this,Registration::class.java)


            startActivity(intent)
        }



    }
}