package com.example.athrow

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    lateinit var firstName : EditText
    lateinit var lastName : EditText
    lateinit var email : EditText
    lateinit var confirmEmail : EditText
    lateinit var username : EditText
    lateinit var address : EditText
    lateinit var address2 : EditText
    lateinit var country : EditText
    lateinit var city : EditText
    lateinit var state : EditText
    lateinit var password : EditText
    lateinit var confirmPassword : EditText

    lateinit var uiComponentArray : Array<EditText>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup1)

        val back = findViewById<Button>(R.id.back_signup1)
        val signup = findViewById<Button>(R.id.signup_page_button1)

        back.setOnClickListener({_ -> this.back()})
        signup.setOnClickListener({_ -> this.signup()})

        initializeValues()
        this.uiComponentArray = arrayOf(firstName, lastName, email, confirmEmail, username, address,
            address2, country, city, state, password, confirmPassword)
        addClickListeners()
    }

    //Initialize UI Components
    fun initializeValues() {
        this.firstName = findViewById(R.id.first_name)
        this.lastName = findViewById(R.id.last_name)
        this.email = findViewById(R.id.email)
        this.confirmEmail = findViewById(R.id.confirm_email)
        this.username = findViewById(R.id.username)
        this.address = findViewById(R.id.address)
        this.address2 = findViewById(R.id.address2)
        this.country = findViewById(R.id.country)
        this.city = findViewById(R.id.city)
        this.state = findViewById(R.id.state)
        this.password = findViewById(R.id.password)
        this.confirmPassword = findViewById(R.id.confirm_password)
    }

    //EditText Listeners
    fun addClickListeners() {
        for (component in this.uiComponentArray)
            component.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable) {

                }

                override fun beforeTextChanged(s: CharSequence, start: Int,
                                               count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence, start: Int,
                                           before: Int, count: Int) {

                }
            })
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