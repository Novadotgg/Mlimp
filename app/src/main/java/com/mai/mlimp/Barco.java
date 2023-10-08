package com.mai.mlimp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class Barco extends AppCompatActivity {
    public static TextView tv;
    //Button scan;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);

        tv = findViewById(R.id.tv);
       // scan = findViewById(R.id.scan);

        //scan.setOnClickListener(new View.OnClickListener() {
          //  @Override
           // public void onClick(View view) {
            //    startActivity(new Intent(getApplicationContext(), ScancodeActivity.class));
          //  }
        //});



    }

}