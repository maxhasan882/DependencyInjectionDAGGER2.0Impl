package com.hasan.colormyview

import android.widget.TextView
import javax.inject.Inject

class Info @Inject constructor(var str:String){
    private var showText = str
    fun getText():String{
        return showText
    }
}