package com.example.figaro.wallet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.figaro.util.UIBuilder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var uiBuilder: UIBuilder


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
     }

    private fun initialize() {
        uiBuilder = UIBuilder(applicationContext)
        button_add.setOnClickListener { addEditText()
        }
    }

    private fun addEditText() {
        layout_detail_id.addView(uiBuilder.getTextView("Textview"),2)
        layout_detail_id.addView(uiBuilder.getEditTextView("edittextview"),2)
    }


}
