package com.mai.mlimp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Object : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object)

        val actionBar=supportActionBar
        actionBar!!.title="Object Detection"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}