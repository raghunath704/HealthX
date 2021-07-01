package com.raghunath704.healthx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class indexActivity extends AppCompatActivity {
    Button work,yog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        getSupportActionBar().hide();

        work=findViewById(R.id.workoutbtn);
        yog=findViewById(R.id.yogabtn);
        yog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(indexActivity.this,YogaActivity.class);
                startActivity(intent);
            }
        });



        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(indexActivity.this,MainActivity.class);
                startActivity(intent);
            }



        });


    }
}