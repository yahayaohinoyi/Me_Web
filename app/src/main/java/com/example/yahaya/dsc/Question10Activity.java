package com.example.yahaya.dsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Question10Activity extends AppCompatActivity {
    static int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);
        Intent intent=getIntent();
        score=intent.getIntExtra("com.example.yahaya.dsc.Scorekey",0);
        TextView tv=(TextView)findViewById(R.id.textView10);
        String Q_10=getString(R.string.question10);
        tv.setText(Q_10);
        Button prevbtn=(Button)findViewById(R.id.button18);
        prevbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Button submitbtn=(Button)findViewById(R.id.button19);
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast mytoast=Toast.makeText(getApplicationContext(),"YOUR SCORE IS "+score*10+"%",Toast.LENGTH_SHORT);
                mytoast.show();
            }
        });
        Button resetbtn=(Button)findViewById(R.id.button20);
        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Question10Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void onRadioButtonClicked10(View view){
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
