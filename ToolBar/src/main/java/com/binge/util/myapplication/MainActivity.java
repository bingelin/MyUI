package com.binge.util.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolBar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        toolbar.setNavigationIcon(R.mipmap.menu);
        toolbar.inflateMenu(R.menu.main_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_edit:
                        Toast.makeText(MainActivity.this, "edit", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_share:
                        Toast.makeText(MainActivity.this, "share", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_item1:
                        Toast.makeText(MainActivity.this, "item1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_item2:
                        Toast.makeText(MainActivity.this, "item2", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "navigation", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
