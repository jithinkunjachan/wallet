package com.example.figaro.util

import android.content.Context
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView

class UIBuilder (private val context: Context){

    fun getEditTextView(hint: String = ""): EditText? {
        var editText:EditText = EditText(context)
        editText.hint = hint
        editText.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        return editText
    }

    fun getTextView(text: String = ""): TextView{
        var textView: TextView = TextView(context)
        textView.text = text
        textView.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        return textView
    }
}