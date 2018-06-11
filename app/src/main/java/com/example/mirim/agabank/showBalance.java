package com.example.mirim.agabank;

import android.app.Application;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Date;
import java.text.SimpleDateFormat;

public class showBalance extends AppCompatActivity {

    SimpleDateFormat mFormat = new SimpleDateFormat("yyyy-MM-dd");
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_balance);

        Toast.makeText(this, "이동확인", Toast.LENGTH_SHORT).show();


        ListView listView;
        ListViewAdapter adapter;

        adapter = new ListViewAdapter();


        adapter.addItem("2018-05-13",6000,"test");
        adapter.addItem("2018-05-13",8000,"test");
        adapter.addItem("2018-05-13",9000,"test");

        button = (Button) findViewById(R.id.submitB);
        listView = (ListView) findViewById(R.id.content);
        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });


    }
}
