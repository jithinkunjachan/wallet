package com.example.figaro.wallet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val parentLayout: LinearLayout = layout_detail_id
        parentLayout.addView(createEditText(),1)
        parentLayout.addView(createEditText(),2)


     }


    fun createEditText(): EditText{
        val editText: EditText = EditText(applicationContext)
        editText.hint = "Hello"
        editText.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)
        return editText
    }

}
