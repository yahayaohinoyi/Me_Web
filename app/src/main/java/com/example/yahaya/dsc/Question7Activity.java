package com.example.yahaya.dsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question7Activity extends AppCompatActivity {
static int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);
        Intent getintent=getIntent();
        score=getintent.getIntExtra("com.example.yahaya.dsc.Scorekey",0);
        TextView tv=(TextView)findViewById(R.id.textView7);
        String Q_7=getString(R.string.question7);
        tv.setText(Q_7);
        Button prevbtn=(Button)findViewById(R.id.button12);
        prevbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Button nextbtn=(Button)findViewById(R.id.button13);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Question7Activity.this,Question8Activity.class);
                intent.putExtra("com.example.yahaya.dsc.Scorekey",score);
                startActivity(intent);
            }
        });
    }
    public void onRadioButtonClicked7(View view){
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
