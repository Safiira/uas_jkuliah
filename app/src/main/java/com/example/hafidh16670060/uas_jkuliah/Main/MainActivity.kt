package com.example.hafidh16670060.uas_jkuliah.Main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hafidh16670060.uas_jkuliah.R


class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button= findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent (this@MainActivity,Jadwal::class.java)
            startActivity(intent)

        }
        val button2= findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent (this@MainActivity,DataDiri::class.java)
            startActivity(intent)

        }
    }
}