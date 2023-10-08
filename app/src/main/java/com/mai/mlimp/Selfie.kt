package com.mai.mlimp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Selfie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selfie)
        val actionBar=supportActionBar
        actionBar!!.title="Selfie Segmentation"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}