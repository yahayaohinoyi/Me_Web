package com.example.yahaya.dsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question8Activity extends AppCompatActivity {
static int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);
        Intent getintent=getIntent();
        score=getintent.getIntExtra("com.example.yahaya.dsc.Scorekey",score);
        TextView tv=(TextView)findViewById(R.id.textView8);
        String Q_8=getString(R.string.question8);
        tv.setText(Q_8);
        Button prevbtn=(Button)findViewById(R.id.button14);
        prevbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Button nextbtn=(Button)findViewById(R.id.button15);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Question8Activity.this,Question9Activity.class);
                intent.putExtra("com.example.yahaya.dsc.Scorekey",score);
                startActivity(intent);
            }
        });
    }
    public void onRadioButtonClicked8(View view){
        boolean checked=((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.option1:
                if(checked){
score++;
                }
            case R.id.option2:
                if(checked){

                }
            case R.id.option3:
                if(checked){

                }
            case R.id.option4:
                if(checked){

                }
        }

    }
}
