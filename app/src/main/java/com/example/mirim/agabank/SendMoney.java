package com.example.mirim.agabank;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by LG on 2018-05-11.
 */

public class SendMoney extends AppCompatActivity{


    Button button;
    ListView listview;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_transfer);


        button = (Button) findViewById(R.id.submitB);
        listview = (ListView) findViewById(R.id.content);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(SendMoney.this, "거래가 완료 되었습니다.", Toast.LENGTH_LONG).show();
                finish();


            }
        });
    }
}
