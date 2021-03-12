package com.animusgames.drinkinbuddy

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var DrinkingBuddyText: TextView
    private lateinit var LoginUsernameEditText: EditText
    private lateinit var LoginPasswordEditText: EditText
    private lateinit var LoginButton: Button
    private lateinit var SignupButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Defining all of the Objects on the login page
        DrinkingBuddyText = findViewById(R.id.txtDrinkinBuddy)
        LoginUsernameEditText = findViewById(R.id.editTextUsername)
        LoginPasswordEditText = findViewById(R.id.editTextPassword)
        LoginButton = findViewById(R.id.btnLogin)
        SignupButton = findViewById(R.id.btnSignUp)

        SignupButton.setOnClickListener {
            val intent = Intent(this, RegisterUser::class.java)
            startActivity(intent)
        }
    }
    
}