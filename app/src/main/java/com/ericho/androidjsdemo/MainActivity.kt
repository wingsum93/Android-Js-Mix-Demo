package com.ericho.androidjsdemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button


class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btn1)
        button2 = findViewById(R.id.btn2)


        button.setOnClickListener {
            startActivity(Intent(this, JavascriptActivity::class.java))
        }
        button2.setOnClickListener {
            startActivity(Intent(this, JavascriptActivity2::class.java))
        }
    }
}
