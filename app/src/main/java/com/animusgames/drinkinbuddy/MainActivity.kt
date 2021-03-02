package com.animusgames.drinkinbuddy

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //Definition of all my objects

    //Buttons
    private lateinit var btnLoginClick: Button
    private lateinit var btnSignUpClick: Button

    //EditTexts
    private lateinit var edttxtCreateUsername: EditText
    private lateinit var edttxtCreatePassword: EditText
    private lateinit var edttxtCreateConfirmPassword: EditText

    private lateinit var edtLoginUsername: EditText
    private lateinit var edtLoginPassword: EditText

    //TextViews
    private lateinit var txtUsernameCreate: TextView
    private lateinit var txtPasswordCreate: TextView
    private lateinit var txtConfirmPasswordCreate: TextView

    private lateinit var txtUsernameLogin: TextView
    private lateinit var txtPasswordLogin: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Buttons
        btnLoginClick = findViewById(R.id.btnLogin)
        btnSignUpClick = findViewById(R.id.btnSignUp)

        //EditTexts
        edttxtCreateUsername = findViewById(R.id.edtCreateEnterUsername)
        edttxtCreatePassword = findViewById(R.id.edtCreateEnterPassword)
        edttxtCreateConfirmPassword = findViewById(R.id.edtCreateConfirmEnterPassword)

        edtLoginUsername = findViewById(R.id.edtLoginEnterUsername)
        edtLoginPassword = findViewById(R.id.edtLoginEnterPassword)

        //TextViews
        txtUsernameCreate = findViewById(R.id.txtCreateUsername)
        txtPasswordCreate = findViewById(R.id.txtCreatePassword)
        txtConfirmPasswordCreate = findViewById(R.id.txtConfirmPassword)

        txtUsernameLogin = findViewById(R.id.txtUsername)
        txtPasswordLogin = findViewById(R.id.txtPassword)

        //Hide the TextViews and EditTexts
        hideLogin()
        hideSignUp()


        btnLoginClick.setOnClickListener {
            showLogin()
            hideSignUp()
        }

        btnSignUpClick.setOnClickListener{
            showSignUp()
            hideLogin()
        }

    }

    private fun showLogin(){
        txtUsernameLogin.visibility = View.VISIBLE
        txtPasswordLogin.visibility = View.VISIBLE

        edtLoginUsername.visibility = View.VISIBLE
        edtLoginPassword.visibility = View.VISIBLE
    }
    private fun showSignUp(){
        txtUsernameCreate.visibility = View.VISIBLE
        txtPasswordCreate.visibility = View.VISIBLE
        txtConfirmPasswordCreate.visibility = View.VISIBLE

        edttxtCreateUsername.visibility = View.VISIBLE
        edttxtCreatePassword.visibility = View.VISIBLE
        edttxtCreateConfirmPassword.visibility = View.VISIBLE
    }

    private fun hideLogin(){
        txtUsernameLogin.visibility = View.GONE
        txtPasswordLogin.visibility = View.GONE

        edtLoginUsername.visibility = View.GONE
        edtLoginPassword.visibility = View.GONE
    }
    private fun hideSignUp(){
        txtUsernameCreate.visibility = View.GONE
        txtPasswordCreate.visibility = View.GONE
        txtConfirmPasswordCreate.visibility = View.GONE

        edttxtCreateUsername.visibility = View.GONE
        edttxtCreatePassword.visibility = View.GONE
        edttxtCreateConfirmPassword.visibility = View.GONE
    }
}