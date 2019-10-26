package com.vogella.android.todolistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView myRecyclerView;
    private RecyclerView.Adapter myAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // reference to recycler view
        myRecyclerView = findViewById(R.id.myRecyclerView);

        // use this setting to improve the performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        myRecyclerView.hasFixedSize(true);

        //use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(layoutManager);

        // specify an adapter
        myAdapter = new MyAdapter(myDataset);
        myRecyclerView.setAdapter(myAdapter);
    }
}
