package com.example.fox.beskotlinmasseng

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            Log.d("MainActivity", "Login: ${login.text}")
            Log.d("MainActivity", "Login: ${email.text}")
            Log.d("MainActivity", "Login: ${password.text}")

        }
    }
}
