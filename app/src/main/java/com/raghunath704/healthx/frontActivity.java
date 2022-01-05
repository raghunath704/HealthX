package com.raghunath704.healthx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class frontActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        getSupportActionBar().hide();
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread td=new Thread(){
            public void run(){
                try {
                    sleep(1700);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(frontActivity.this,indexActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        };td.start();
    }
}