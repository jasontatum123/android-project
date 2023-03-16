package com.example.myapplication.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.R;

public class LinearRecycleViewActivity extends AppCompatActivity {
    private RecyclerView mrvmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recycle_view);
        mrvmain=findViewById(R.id.rv_main);
        mrvmain.setLayoutManager(new LinearLayoutManager(LinearRecycleViewActivity.this));
        mrvmain.setAdapter(new LinearAdapter(LinearRecycleViewActivity.this));
    }
}