package com.raghunath704.healthx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class yoga1 extends AppCompatActivity {
    ImageView onlineimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga1);
        onlineimg=findViewById(R.id.imageView2);
        getSupportActionBar().hide();
        String uri="https://cdn2.stylecraze.com/wp-content/uploads/2020/01/Tadasana-Mountain-Pose-Steps-And-Benefits-in-Hindi-1.jpg.webp";
        Picasso.get().load(uri).placeholder(R.drawable.placeholder).into(onlineimg);
    }
}