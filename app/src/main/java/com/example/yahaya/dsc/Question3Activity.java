package com.example.yahaya.dsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Question3Activity extends AppCompatActivity {
static int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        Intent getintent=getIntent();
        score=getintent.getIntExtra("com.example.yahaya.dsc.Scorekey",0);
        Button prevbutton=(Button)findViewById(R.id.button);
        TextView tv=(TextView)findViewById(R.id.textView4);
        String Q_3=getString(R.string.question3);
        tv.setText(Q_3);
        prevbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
        Button nextbtn=(Button)findViewById(R.id.button5);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Question3Activity.this,Question4Activity.class);
                intent.putExtra("com.example.yahaya.dsc.Scorekey",score);
                startActivity(intent);
            }
        });


    }
    public void onRadioButtonClicked3(View view){
        boolean checked=((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.radbtn3:
                if(checked){

                }
            case R.id.radbtn1:
                if(checked){

                }
            case R.id.radbtn2:
                if(checked){
                    score++;
                }
            case R.id.radbtn4:
                if(checked){

                }
        }

    }
}
