package com.binge.util.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar ;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.about_toolbar);
        toolbar.setTitle("关于我");
        setSupportActionBar(toolbar);

//        listView = (ListView) findViewById(R.id.listView);
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            list.add("item" + i);
//        }
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
//        listView.setAdapter(adapter);
//        toolbar = (Toolbar) findViewById(R.id.toolBar);
////        setSupportActionBar(toolbar);
////        toolbar.setLogo(R.mipmap.ic_launcher);
//        toolbar.setTitle("MyTitle");
//        toolbar.setTitleTextColor(Color.WHITE);
//        toolbar.setSubtitle("Sub title");
//        toolbar.setSubtitleTextColor(Color.WHITE);
//        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
//        toolbar.inflateMenu(R.menu.menu_main);
//        toolbar.setOnMenuItemClickListener(onMenuItemClick);


    }
    private Toolbar.OnMenuItemClickListener onMenuItemClick = new Toolbar.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            String msg = "";
            switch (item.getItemId()) {
                case R.id.action_edit:
                    msg += "Click edit";
                    break;
                case R.id.action_share:
                    msg += "Click share";
                    break;
                case R.id.action_settings_item1:
                    msg += "Click itme1";
                    break;
                case R.id.action_settings_item2:
                    msg += "Click item2";
                    break;
            }
            if (!msg.equals("")) {
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

            }

            return true;
        }
    };

}
