package com.raghunath704.healthx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.raghunath704.healthx.Adapters.WorkoutAdapter;
import com.raghunath704.healthx.Classes.RecyclerItemClickListener;
import com.raghunath704.healthx.Models.WorkoutModel;

import java.util.ArrayList;

public class YogaActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);
        recyclerView=findViewById(R.id.recyclerview);


        ArrayList<WorkoutModel> list=new ArrayList<>();

        list.add(new WorkoutModel(R.drawable.yogatwelve,"Tadasana"));
        list.add(new WorkoutModel(R.drawable.yoganine,"Uttanasana"));
        list.add(new WorkoutModel(R.drawable.yogathree,"Adhomukha Svanasana "));
        list.add(new WorkoutModel(R.drawable.yogafour,"Urdhvamukha svanasana "));
        list.add(new WorkoutModel(R.drawable.yogafive,"Utthita Trikonasana "));
        list.add(new WorkoutModel(R.drawable.yogasix,"Utthita parsvakonasana"));
        list.add(new WorkoutModel(R.drawable.yogaseven,"Virabhadrasana"));
        list.add(new WorkoutModel(R.drawable.yogaeight,"Utkatasana"));
        list.add(new WorkoutModel(R.drawable.yogatwo,"Dandasana"));
        list.add(new WorkoutModel(R.drawable.yogaten,"PullUp"));
        list.add(new WorkoutModel(R.drawable.yogaeleven,"Boxing"));
        list.add(new WorkoutModel(R.drawable.yogaone,"Boxing"));
        list.add(new WorkoutModel(R.drawable.yogatherteen,"Boxing"));
        WorkoutAdapter adapter=new WorkoutAdapter(list,this);
        recyclerView.setAdapter(adapter);

        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Intent intent=new Intent(YogaActivity.this,yoga1.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent2=new Intent(YogaActivity.this,yoga2.class);
                        startActivity(intent2);

                        break;
                    case 2:
                        Intent intent3=new Intent(YogaActivity.this, work3.class);
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
            Intent intent=new Intent(YogaActivity.this,About.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}