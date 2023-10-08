package com.mai.mlimp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
//import com.nova.mlimp.MainActivity

class NewActivity : AppCompatActivity() {
    //lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()



        //btn=findViewById(R.id.btn)
        //btn.setOnClickListener {
            //Toast.makeText(
             //   this@NewActivity,
               // "welcome",
               // Toast.LENGTH_LONG
          //  ).show()
        //This is for splash screen
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        Handler().postDelayed({
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)




        }



        //finish()
            //val intent =Intent(this@NewActivity, MainActivity::class.java)
            //startActivity(intent)



        }


