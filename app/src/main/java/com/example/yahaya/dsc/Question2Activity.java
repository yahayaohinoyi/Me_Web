package com.example.yahaya.dsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Question2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        TextView Q_2=(TextView)findViewById(R.id.textView2);
        String string2=getString(R.string.question2);
        Q_2.setText(string2);
        Intent intent=getIntent();
        Button nextbtn2=(Button)findViewById(R.id.button2);
        nextbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoq_3=new Intent(Question2Activity.this,Question3Activity.class);
                startActivity(gotoq_3);
            }
        });
        Button prevbtn1=(Button)findViewById(R.id.button3);
        prevbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Question2Activity.this,MainActivity.class);
            }
        });
    }
    public void onRadioButtonClicked2(View view){
        boolean checked=((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.option1:
                if(checked){
                    Toast.makeText(getApplicationContext(),"CORRECT",Toast.LENGTH_SHORT).show();
                }
            case R.id.option2:
                if(checked){
                    Toast.makeText(getApplicationContext(),"WRONG",Toast.LENGTH_SHORT).show();
                }
            case R.id.option3:
                if(checked){
                    Toast.makeText(getApplicationContext(),"WRONG",Toast.LENGTH_SHORT).show();
                }
            case R.id.option4:
                if(checked){
                    Toast.makeText(getApplicationContext(),"WRONG",Toast.LENGTH_SHORT).show();
                }
        }

    }


}
