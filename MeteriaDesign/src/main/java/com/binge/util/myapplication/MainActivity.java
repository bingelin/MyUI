package com.binge.util.myapplication;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.collapsing_toolbar)
    CollapsingToolbarLayout collapsingToolbarLayout;
    @BindView(R.id.recycleView)
    RecyclerView recyclerView;

    private ArrayList<String> dataList;
    private ArrayAdapter adapter;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

//        toolbar.setTitle("Bingelin");
//        toolbar.setSubtitle("hello");
        collapsingToolbarLayout.setTitle("Hello Bingelin");

        dataList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            dataList.add("item" + i);
        }
//        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dataList);
//        lv.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter(dataList, this);
        recyclerView.setAdapter(myAdapter);
    }
}
