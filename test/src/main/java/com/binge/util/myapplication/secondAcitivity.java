package com.binge.util.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by linjb on 2016/9/12.
 */

public class secondAcitivity extends Activity {

//    @BindView(R.id.listView)
    ListView lv;

    private ArrayList<String> dataList;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
//        ButterKnife.bind(this);
        lv = (ListView) findViewById(R.id.listView);
        dataList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            dataList.add("item" + i);
        }
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dataList);
        lv.setAdapter(adapter);
    }
}
