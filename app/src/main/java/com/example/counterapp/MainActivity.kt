package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val reset = findViewById<TextView>(R.id.reset)
        val minus = findViewById<AppCompatButton>(R.id.minus)
        val plus = findViewById<AppCompatButton>(R.id.plus)
        var text = findViewById<TextView>(R.id.text)
        var count = 0
        reset.setOnClickListener {
            count = 0
            text.text = count.toString()
          }
        plus.setOnClickListener {
            count++
            text.text = count.toString()
        }
        minus.setOnClickListener {
            count--
            text.text = count.toString()
        }
    }
}