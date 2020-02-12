package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val const = 39370F

        editText2.setOnKeyListener { v, keyCode, event ->
            try{
                editText.setText((editText2.text.toString().toFloat()*const).toString()).let {status.text = ""}
            } catch (e: Exception) {
                status.text = "error"
            }; return@setOnKeyListener false
        }

        editText.setOnKeyListener { v, keyCode, event ->
            try {
                editText2.setText((editText.text.toString().toFloat()/const).toString()).let {status.text = ""}
            } catch (e: Exception) {
                status.text = "error"
            }; return@setOnKeyListener false
        }

    }
}