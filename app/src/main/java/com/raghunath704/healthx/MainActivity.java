package com.raghunath704.healthx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.raghunath704.healthx.Adapters.WorkoutAdapter;
import com.raghunath704.healthx.Classes.RecyclerItemClickListener;
import com.raghunath704.healthx.Models.WorkoutModel;

import java.util.ArrayList;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);


        ArrayList<WorkoutModel> list=new ArrayList<>();

        list.add(new WorkoutModel(R.drawable.rope,"Rope Jump"));
        list.add(new WorkoutModel(R.drawable.cycling,"Cycling"));
        list.add(new WorkoutModel(R.drawable.cardio,"Running"));
        list.add(new WorkoutModel(R.drawable.pushup,"PushUp"));
        list.add(new WorkoutModel(R.drawable.sidepushup,"Side PushUp"));
        list.add(new WorkoutModel(R.drawable.squat,"Squat"));
        list.add(new WorkoutModel(R.drawable.dumbbellpush,"Dumbbell PushUp"));
        list.add(new WorkoutModel(R.drawable.situp,"SitUp"));
        list.add(new WorkoutModel(R.drawable.lifting,"Weight Lifting"));
        list.add(new WorkoutModel(R.drawable.pullup,"PullUp"));
        list.add(new WorkoutModel(R.drawable.boxing,"Boxing"));
        WorkoutAdapter adapter=new WorkoutAdapter(list,this);
        recyclerView.setAdapter(adapter);

        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);


        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Intent intent=new Intent(MainActivity.this,work1.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent2=new Intent(MainActivity.this,work2.class);
                        startActivity(intent2);

                        break;
                    case 2:
                        Intent intent3=new Intent(MainActivity.this, work3.class);
                        startActivity(intent3);
                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:

                        break;

                    default:
                        break;
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_workone,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.about){
            Intent intent=new Intent(MainActivity.this,About.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}