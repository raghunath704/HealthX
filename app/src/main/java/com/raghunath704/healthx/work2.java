package com.raghunath704.healthx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class work2 extends AppCompatActivity {
    ImageView onlineimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work2);
        onlineimg=findViewById(R.id.imageView2);
        getSupportActionBar().hide();
        String uri="https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/cycle-rider-riding-hard-along-the-beach-royalty-free-image-1616705538.?crop=0.668xw:1.00xh;0.332xw,0&resize=980:*";
        Picasso.get().load(uri).placeholder(R.drawable.placeholder).into(onlineimg);
    }
}