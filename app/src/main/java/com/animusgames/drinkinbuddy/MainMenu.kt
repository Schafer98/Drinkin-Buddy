package com.animusgames.drinkinbuddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button









class MainMenu : AppCompatActivity() {

    //Buttons
    private lateinit var btnStartTimer: Button
    private lateinit var btnOversight: Button
    private lateinit var btnBACCalc: Button
    private lateinit var btnSafety: Button
    private lateinit var btnSettings: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        //Buttons Assignment
        btnStartTimer = findViewById(R.id.StartDrinking)
        btnOversight = findViewById(R.id.btnCheckOversight)
        btnBACCalc = findViewById(R.id.btnBACcalculator)
        btnSafety = findViewById(R.id.btnSafetyPage)
        btnSettings = findViewById(R.id.btnSettings)




        btnStartTimer.setOnClickListener{

        }

        btnOversight.setOnClickListener{

        }

        btnBACCalc.setOnClickListener{

        }

        btnSafety.setOnClickListener{

        }

        btnSettings.setOnClickListener{

        }
    }
}