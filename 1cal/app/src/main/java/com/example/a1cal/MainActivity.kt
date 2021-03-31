package com.example.a1cal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cal.setOnClickListener {
            startActivity(Intent(this,BMI::class.java))
        }

        ok2.setOnClickListener {
            startActivity(Intent(this,BMR::class.java))
        }

        ok3.setOnClickListener {
            startActivity(Intent(this,TDEE::class.java))
        }
    }
}