package com.raghunath704.healthx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class work3 extends AppCompatActivity {
    ImageView onlineimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work3);
        onlineimg=findViewById(R.id.imageView2);
        getSupportActionBar().hide();
        String uri="https://www.mayoclinichealthsystem.org/-/media/national-files/images/hometown-health/2019/running-shoes-on-paved-trail.jpg?h=370&w=660&la=en&hash=EF0A1D8B952FBA06002A40167735BF14";
        Picasso.get().load(uri).placeholder(R.drawable.placeholder).into(onlineimg);
    }
}