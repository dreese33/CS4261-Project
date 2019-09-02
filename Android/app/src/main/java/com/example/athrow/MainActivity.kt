package com.example.athrow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<Button>(R.id.login_button)
        val signup = findViewById<Button>(R.id.signup_button)

        login.setOnClickListener({_ -> openLogin()})
        signup.setOnClickListener({_ -> openSelectUser()})
    }

    fun openLogin() {
        val intent: Intent = Intent(applicationContext, LoginActivity::class.java)
        startActivity(intent)
    }

    fun openSelectUser() {
        val intent: Intent = Intent(applicationContext, SelectUserType::class.java)
        startActivity(intent)
    }
}
