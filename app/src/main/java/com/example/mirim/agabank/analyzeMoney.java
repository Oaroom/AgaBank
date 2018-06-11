package com.example.mirim.agabank;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class analyzeMoney extends AppCompatActivity {

    Button button;
    ListView listView;
    ListViewAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_analyze);


        adapter = new ListViewAdapter();


        adapter.addItem("2018-05-13",6000,"test");
        adapter.addItem("2018-05-13",8000,"test");
        adapter.addItem("2018-05-13",9000,"test");



        button = (Button) findViewById(R.id.submitB);


        listView = (ListView) findViewById(R.id.content);
        listView.setAdapter(adapter);


    }
}
