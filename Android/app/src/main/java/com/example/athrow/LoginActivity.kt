package com.example.athrow

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        //Buttons
        val back = findViewById<Button>(R.id.back_login)
        val login = findViewById<Button>(R.id.login_button)

        //Text input
        val username_input = findViewById<EditText>(R.id.username_input_login)
        val password_input = findViewById<EditText>(R.id.password_input_login)

        back.setOnClickListener({_ ->  this.back()})
        login.setOnClickListener({_ -> this.login()})
    }

    fun login() {
        val intent: Intent = Intent(applicationContext, HomeActivity::class.java)
        startActivity(intent)
    }

    fun back() {
        val intent: Intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }
}