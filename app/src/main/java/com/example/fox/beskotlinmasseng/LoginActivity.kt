package com.example.fox.beskotlinmasseng

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button_login.setOnClickListener {
            val email = email_editText_login.text.toString()
            val password = password_editText_login.text.toString()
            Log.d("LoginActivity", "Email: $email, Password: $password")

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
//                .addOnCanceledListener()
        }

        back_textView.setOnClickListener {
            finish()
        }

    }
}
