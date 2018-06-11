package com.example.mirim.agabank;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.preference.DialogPreference;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class FoundAcc extends AppCompatActivity{


    Button button;
    EditText nameText;
    EditText numText;


    String name;
    String number;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_found);


        button = (Button)findViewById(R.id.checkB);
        nameText = (EditText) findViewById(R.id.nameText);
        numText = (EditText) findViewById(R.id.numText);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = nameText.getText().toString();
                number = numText.getText().toString();

                //계좌번호 찾는 함수로 이동
                found(name,number);
            }
        });

        }


        //사용자가 입력한 정보에 따라 계좌를 찾아주는 함수
        void found(String name, String number){

            //사용자의 이름과 전화번호
            this.name = name;
            this.number = number;

            //계좌번호 저장
            String account ="123456789";

            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            //다이얼로그 제목
            builder.setTitle("계좌찾기");

            if(name.equals("arm") && number.equals("123")) {
                //만약 정보가 일치했을때
                builder.setMessage("당신의 계좌는 " + account );

            }else{

                //정보가 일치하지 않았을 때
                builder.setMessage("입력하신 정보에 대한 계좌가 없습니다.");

            }

            //하단의 확인버튼 클릭시 메인화면으로
            builder.setPositiveButton("확인",

                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();

                        }
                    });

            builder.show();

        }

    }
