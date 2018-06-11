package com.example.mirim.agabank;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class MakeAcc extends AppCompatActivity {


    Button button;
    EditText nameEdit;
    EditText numEdit;
    EditText monthEdit;
    EditText spendEdit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_make);

        button=(Button) findViewById(R.id.makeAccB);
        nameEdit= (EditText)findViewById(R.id.nameText);
        numEdit= (EditText)findViewById(R.id.numText);
        monthEdit= (EditText)findViewById(R.id.monthText);
        spendEdit= (EditText)findViewById(R.id.spendText);




    }
}
