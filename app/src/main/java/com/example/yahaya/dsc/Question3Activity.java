package com.example.yahaya.dsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Question3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        Intent getintent=getIntent();
        Button prevbutton=(Button)findViewById(R.id.button);
        TextView tv=(TextView)findViewById(R.id.textView4);
        String Q_3=getString(R.string.question3);
        tv.setText(Q_3);
        prevbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Question3Activity.this,Question2Activity.class);
                startActivity(intent1);
            }
        });
        Button nextbtn=(Button)findViewById(R.id.button5);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Question3Activity.this,Question4Activity.class);
                startActivity(intent);
            }
        });

    }
}
