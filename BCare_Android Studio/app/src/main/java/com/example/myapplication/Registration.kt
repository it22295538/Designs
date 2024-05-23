package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        var reg = findViewById<Button>(R.id.btn_reg)

        reg.setOnClickListener{

            val intent = Intent(this,logInform::class.java)


            startActivity(intent)
        }

        var signIn = findViewById<TextView>(R.id.tv_signin)

        signIn.setOnClickListener{

            val intent = Intent(this,logInform::class.java)


            startActivity(intent)
        }


    }
}