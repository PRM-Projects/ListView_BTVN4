package com.example.prm_listview_btvn4;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private BaseAAdapter adapter;
    private List<Amongus> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.demo41Listview);
        list.add(new Amongus("Red","18",R.drawable.images));
        list.add(new Amongus("Green","19",R.drawable.green_old_design));
        list.add(new Amongus("Brown","20",R.drawable.cyan_ghost));

        adapter=new BaseAAdapter(this,list);//create adapter
        listView.setAdapter(adapter);//attach adapter to listview
    }
}