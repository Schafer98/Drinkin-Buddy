package com.animusgames.drinkinbuddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_register_user.*


class RegisterUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        registerButton.setOnClickListener {
            val email = editTextRegEmail.text.toString().trim()
            val password = editTextRegPassword.text.toString().trim()

            // TODO: Need some form of email and password validations here like making sure the email or password is not null, etc. Then register the user if everything is good.

            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password).addOnCompleteListener(this) {
                    task ->
                // Sign in was a success
                if(task.isSuccessful){
                    // user is the firebase registered users
                    val user: FirebaseUser = task.result!!.user!!

                    Toast.makeText(
                        this@RegisterUser,
                        "You are now registered with Drinkin' Buddy",
                        Toast.LENGTH_SHORT
                    ).show()

                    // TODO: Need to do an intent here so that the next activity has the user info and also the next activity starts as well.

                }
                else{
                    Toast.makeText(
                        this@RegisterUser,
                        task.exception!!.message.toString(),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}