package com.example.mirim.agabank;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    ImageButton sendB;
    ImageButton showB;
    ImageButton analyzeB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendB = (ImageButton) findViewById(R.id.sendB);
        showB = (ImageButton) findViewById(R.id.showB);
        analyzeB = (ImageButton) findViewById(R.id.analyzeB);


        sendB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(MainActivity.this,SendMoney.class);
                startActivity(intent);


            }
        });
    }
}
