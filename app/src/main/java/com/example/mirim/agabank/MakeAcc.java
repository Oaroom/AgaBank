package com.example.mirim.agabank;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MakeAcc extends AppCompatActivity {


    Button button;
    EditText nameEdit;
    EditText numEdit;
    EditText monthEdit;
    EditText spendEdit;

    String account;
    int cnt=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_make);

        button=(Button) findViewById(R.id.makeAccB);
        nameEdit= (EditText)findViewById(R.id.nameText);
        numEdit= (EditText)findViewById(R.id.numText);
        monthEdit= (EditText)findViewById(R.id.monthText);
        spendEdit= (EditText)findViewById(R.id.spendText);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //계좌생성을 위한 함수
                notice();

            }
        });

    }

    void notice(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        //다이얼로그 제목
        builder.setTitle("계좌생성");

    cnt=4;
        //먼저 사용자의 계좌가 --개 이상이면 계좌생성 불가
        if(cnt > 3){

            builder.setMessage("입력하신 정보로 생성할 수 있는 \n계좌의 개수를 넘어섰습니다. \n계좌조회를 해보세요.");

        }else{

            builder.setMessage("새로 발급한 계좌번호는 "+account+"입니다. \n마이페이지에서 확인하세요");

        }

        builder.setPositiveButton("확인",

                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }

        );


        builder.show();


    }



}
