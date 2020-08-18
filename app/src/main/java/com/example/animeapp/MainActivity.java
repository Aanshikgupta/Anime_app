package com.example.animeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView im = (ImageView)findViewById(R.id.imageView);
        im.setX(-1000);
        im.animate().translationXBy(1000).rotation(3600).setDuration(2000);

    }


    public void clickimg(View view) {
        ImageView im = (ImageView)findViewById(R.id.imageView);
        im.animate().scaleX(0).scaleY(0).rotation(1800).setDuration(2000);
    }
}