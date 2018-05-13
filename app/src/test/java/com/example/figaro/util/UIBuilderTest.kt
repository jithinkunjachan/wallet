package com.example.figaro.util

import android.content.Context
import android.test.mock.MockContext
import android.widget.EditText
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito

class UIBuilderTest {

    @Mock
    private var context: Context =  MockContext()

    var uiBuilder: UIBuilder = UIBuilder(context)

    @Before
    fun setUp() {
    }

    @Test
    fun getEditTextView_returns_EditTextView(){
        var editText = uiBuilder.getEditTextView("hint")
        assert(editText is EditText)
    }


}