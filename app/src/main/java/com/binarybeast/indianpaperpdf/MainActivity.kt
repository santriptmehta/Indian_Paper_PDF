package com.binarybeast.indianpaperpdf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var hundu_btn: Button
    lateinit var ecnomic_btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hundu_btn = findViewById(R.id.the_hindu)
        ecnomic_btn = findViewById(R.id.the_ecnomic)

        hundu_btn.setOnClickListener {
            val intent = Intent(this,the_hindu::class.java)
            startActivity(intent)
        }
        ecnomic_btn.setOnClickListener {
            val intent = Intent(this,the_ecnomic::class.java)
            startActivity(intent)
        }
    }
}