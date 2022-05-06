package com.raghunath704.healthx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class indexActivity extends AppCompatActivity {
    Button work,yog,steptrackerbtn,bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        getSupportActionBar().hide();
        steptrackerbtn=findViewById(R.id.steptracker);
        bmi=findViewById(R.id.bmi_btn);
        steptrackerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(indexActivity.this,StepCounter.class);
                startActivity(intent);
            }
        });
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
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(indexActivity.this,BmiActivity.class);
                startActivity(intent);
            }
        });


    }
}