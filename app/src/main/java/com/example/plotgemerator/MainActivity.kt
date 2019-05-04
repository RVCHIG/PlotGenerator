package com.example.plotgemerator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btngo = findViewById<Button>(R.id.btnPage2)
        val txtChar = findViewById<EditText>(R.id.txtCharacter)
        val txtThing = findViewById<EditText>(R.id.txtThing)
        val txtFuck = findViewById<EditText>(R.id.txtFuckery)
        val btnGen = findViewById<Button>(R.id.btnGenerate)

        btnGen.setOnClickListener{
            txtResult.text = "Plot: ${txtChar.text.toString()} wants ${txtThing.text.toString()}, but is opposed by ${txtFuck.text.toString()}."
        }

        btngo.setOnClickListener({
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("SendStuff",txtFuck.text.toString())
            startActivity(intent)
        })
    }



}
