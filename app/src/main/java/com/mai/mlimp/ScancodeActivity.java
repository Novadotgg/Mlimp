package com.mai.mlimp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class ScancodeActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler{
    int MY_PERMISSION_REQUEST_CAMERA=0;
    ZXingScannerView scannerview;
    ImageView iv;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iv=findViewById(R.id.iv);
        tv=findViewById(R.id.tv);
        scannerview = new ZXingScannerView(this);
        setContentView(R.layout.activity_bar);
    }

    @Override
    public void handleResult(Result result) {
        Barco.tv.setText(result.getText());
    }

    @Override
    protected void onPause() {
        super.onPause();
        scannerview.stopCamera();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        if(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA)!=
        PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CAMERA},MY_PERMISSION_REQUEST_CAMERA);
        }
        scannerview.setResultHandler(this);
        scannerview.startCamera();
    }
}