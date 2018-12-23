package com.example.yahaya.dsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question5Activity extends AppCompatActivity {
static int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        Intent getintent=getIntent();
        getintent.getIntExtra("com.example.yahaya.dsc.Scorekey",0);
        TextView tv=(TextView)findViewById(R.id.textView5);
        String Q_5=getString(R.string.question5);
        tv.setText(Q_5);
        Button prevbtn=(Button)findViewById(R.id.button8);
        prevbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Button nextbtn=(Button)findViewById(R.id.button9);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
    public void onRadioButtonClicked5(View view){
        boolean checked=((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.option1:
                if(checked){

                }
            case R.id.option2:
                if(checked){

                }
            case R.id.option3:
                if(checked){
                    score++;
                }
            case R.id.option4:
                if(checked){

                }
        }

    }
}
