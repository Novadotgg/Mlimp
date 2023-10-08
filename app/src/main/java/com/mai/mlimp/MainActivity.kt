package com.mai.mlimp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

lateinit var b1: Button
lateinit var b2:Button
lateinit var b3:Button
lateinit var b4:Button
lateinit var b5:Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scrollview)
        val actionBar=supportActionBar
        actionBar!!.title="ML Projects"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)


        b1=findViewById<Button>(R.id.butn1)
        b2=findViewById<Button>(R.id.b2)
        b3=findViewById<Button>(R.id.b3)
        b4=findViewById<Button>(R.id.b4)
        b5=findViewById(R.id.b5)


        b1.setOnClickListener {
            val intent = Intent(this, Face::class.java)
            startActivity(intent)
        }
        b2.setOnClickListener {
            val intent = Intent(this, text2::class.java)
            startActivity(intent)
        }
        b3.setOnClickListener {
            val intent = Intent(this, Object::class.java)
            startActivity(intent)
        }
        b4.setOnClickListener {
            val intent = Intent(this, Barco::class.java)
            startActivity(intent)
        }
        b5.setOnClickListener{
            val intent=Intent(this,Selfie::class.java)
            startActivity(intent)
        }
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }



}