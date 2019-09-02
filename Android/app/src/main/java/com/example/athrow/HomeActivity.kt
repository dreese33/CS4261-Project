package com.example.athrow

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val logout = findViewById<Button>(R.id.logout_button)

        logout.setOnClickListener({_ -> this.logout()})
    }

    fun logout() {
        val intent: Intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }
}