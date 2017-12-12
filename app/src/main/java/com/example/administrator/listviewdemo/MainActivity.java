package com.example.administrator.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.lv_main);
        List<ItemBean> itemBeanList = new ArrayList<>();
        for (int i = 1;i <= 20;i++){
            itemBeanList.add(new ItemBean(R.mipmap.ic_launcher,"我是标题"+i,"我是内容"+i));
        }
        listView.setAdapter(new MyAdapter(this,itemBeanList));
    }
}
