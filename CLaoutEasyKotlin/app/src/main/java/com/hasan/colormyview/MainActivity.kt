package com.hasan.colormyview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject @field:Choose("Love") lateinit var infoLove: Info
    @Inject @field:Choose("Kotlin") lateinit var infoKotlin: Info
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerComponent.create().inject(this)
        var value = infoLove.getText()
        var value_k = infoKotlin.getText()
        var textItem = findViewById<TextView>(R.id.textView)
        textItem.text = value + value_k
    }
}
