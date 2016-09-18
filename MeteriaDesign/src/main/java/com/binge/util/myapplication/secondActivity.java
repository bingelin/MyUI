package com.binge.util.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by linjb on 2016/9/18.
 */

public class secondActivity extends AppCompatActivity {

    @BindView(R.id.toolbar1)
    Toolbar toolbar;
//    @BindView(R.id.collapsing)
//    CollapsingToolbarLayout collapsingToolbarLayout;
    @BindView(R.id.recycleView1)
    RecyclerView recyclerView;

    private ArrayList<String> dataList;
    private ArrayAdapter adapter;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dataList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            dataList.add("item" + i);
        }
//        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dataList);
//        lv.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter(dataList, this);
        recyclerView.setAdapter(myAdapter);

//        toolbar.setTitle("荔枝园");
//        toolbar.setNavigationIcon(R.mipmap.menu);




    }
}
