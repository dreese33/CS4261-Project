package com.example.athrow

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val back = findViewById<Button>(R.id.back_signup)
        val signup = findViewById<Button>(R.id.signup_page_button)

        back.setOnClickListener({_ -> this.back()})
        signup.setOnClickListener({_ -> this.signup()})
    }

    fun back() {
        val intent: Intent = Intent(applicationContext, SelectUserType::class.java)
        startActivity(intent)
    }

    fun signup() {
        val intent: Intent = Intent(applicationContext, HomeActivity::class.java)
        startActivity(intent)
    }
}