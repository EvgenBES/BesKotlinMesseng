package com.example.fox.beskotlinmasseng

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_main.setOnClickListener {
          performRegister()
        }

        account_textView.setOnClickListener {
            val intent = Intent (this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun performRegister() {
        val email = email_editText_main.text.toString()
        val password = password_editText_main.text.toString()



        if (email.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Plase enter text email and password", Toast.LENGTH_LONG).show()
            return
        }

        Log.d("MainActivity", "Email: $email, Password: $password" )


        //Firebase Authentication to create a user with email and password
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener{
                if(!it.isSuccessful) return@addOnCompleteListener

                //else if successful
                Log.d("Main", "successfully created user with uid: ${it.result?.user?.uid}")
            }
            .addOnFailureListener {
                Log.d("Main", "Faild to created user: ${it.message}")
                Toast.makeText(this, "Faild to created user: ${it.message}", Toast.LENGTH_LONG).show()
            }

    }
}
