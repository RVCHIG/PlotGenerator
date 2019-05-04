package com.example.plotgemerator

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Button
import java.lang.Exception

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val txtshow = findViewById<TextView>(R.id.txtShow)
        val btnBack = findViewById<Button>(R.id.btnBack)

        var strShow: String = intent.getStringExtra("SendStuff")
        txtshow.text = strShow

        btnBack.setOnClickListener(View.OnClickListener {
            this.finish() })

        findViewById<View>(android.R.id.content).setOnTouchListener { _, event ->
            hideKeyboard()
            false
        }
    }

    fun hideKeyboard() {
        try {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        } catch (e: Exception) {
            println("It's fucked.")
        }

    }
}
