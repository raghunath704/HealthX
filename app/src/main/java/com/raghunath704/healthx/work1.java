package com.raghunath704.healthx;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class work1 extends AppCompatActivity {
    ImageView onlineimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work1);
        onlineimg=findViewById(R.id.imageView2);
        getSupportActionBar().hide();
        String uri="https://runningmagazine.ca/wp-content/uploads/2019/09/Skip-1-1120x747.jpg";
        Picasso.get().load(uri).placeholder(R.drawable.placeholder).into(onlineimg);
    }
}