package com.animusgames.drinkinbuddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import kotlin.properties.Delegates

class BAC_Calculator : AppCompatActivity() {

    //Definition of all my objects

    //TextViews
    private lateinit var txtMale: TextView
    private lateinit var txtFemale: TextView
    private lateinit var txtBodyWeight: TextView
    private lateinit var txtUserFinalBAC: TextView

    //Switch
    private lateinit var switchMale_Female: Switch

    //EditTexts
    private lateinit var edtBeerBox: EditText
    private lateinit var edtWineBox: EditText
    private lateinit var edtLiquorBox: EditText
    private lateinit var edtTotalBodyWeight: EditText

    //Buttons
    private lateinit var btnCalculateBAC: Button
    private lateinit var btnGoBack: Button

    //Strings
    private lateinit var switchState: String

    //Integers
    private var numBeer: Int = 0
    private var numWine: Int = 0
    private var numLiquor: Int = 0

    //Floats
    private var totalWeight: Float = 0.0F
    // Not being used
    // private var Male_OR_Female: Float = 0.0F
    private var userBAC: Float = 0.0F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_a_c__calculator)

        //Change the Textviews color of male or female depnding on which is selected
        //TextViews
        txtMale = findViewById(R.id.txtMale)
        txtFemale = findViewById(R.id.txtFemale)
        txtUserFinalBAC = findViewById(R.id.txtUserBAC)

        //Switch
        switchMale_Female = findViewById(R.id.switchM_F)

        //EditTexts
        edtBeerBox = findViewById(R.id.edtEnterBeerAmount)
        edtWineBox = findViewById(R.id.edtEnterWineAmount)
        edtLiquorBox = findViewById(R.id.edtEnterLiquorAmount)
        edtTotalBodyWeight = findViewById(R.id.edtEnterBodyWeight)

        //Buttons
        btnCalculateBAC = findViewById(R.id.btnCalculate)
        btnGoBack = findViewById(R.id.btnBack)


        //Checks to se whether the switch is clicked or not
        switchMale_Female.setOnClickListener {
            switchState = if(switchMale_Female.isChecked) "True" else "False"
        }

        btnCalculateBAC.setOnClickListener{
            //numBeer = edtBeerBox.text.toString().toInt()
            //numWine = edtWineBox.text.toString().toInt()
            //numLiquor = edtLiquorBox.text.toString().toInt()
            //totalWeight = edtTotalBodyWeight.text.toString().toFloat()

            //Depending on if its a women r needs to be .55 according to the formula and .68 for men
            //if(switchState.contains("True")) Male_OR_Female = 0.55F else Male_OR_Female = 0.68F

            //This should be the formula
            //userBAC = ((((numBeer)*.05) + ((numWine)*.12) + ((numLiquor)*.4))/(totalWeight*Male_OR_Female*100)).toFloat()

            //This should in theory change the original Textview message of Your BAC levels are: 0.0 to Your BAC levels are: (User BAC levels)
            //val stringBAC: String = "Your BAC levels are: " + userBAC.toString()
            //txtUserFinalBAC.text = stringBAC



        }



    }
}