package com.example.lab1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ExampleClass> exampleList = new ArrayList<>();
        for(int i = 0; i < 1000000-1; i++) {
            if((i+1) % 2 == 0)
            exampleList.add(new ExampleClass(R.drawable.unnamed, NumbersToWords.WordsRus(i+1), Color.argb(204,204,204,204)));
            else
                exampleList.add(new ExampleClass(R.drawable.unnamed, NumbersToWords.WordsRus(i+1), Color.argb(255,255,255,255)));

        }
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

}
