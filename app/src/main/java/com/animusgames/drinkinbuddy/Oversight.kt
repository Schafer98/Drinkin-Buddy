package com.animusgames.drinkinbuddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Oversight : AppCompatActivity() {

    //Buttons
    private lateinit var btnAddFriends: Button
    private lateinit var btnBack: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oversight)

        btnBack = findViewById(R.id.btnBack)
        btnAddFriends = findViewById(R.id.btnAddFriends)
    }
}