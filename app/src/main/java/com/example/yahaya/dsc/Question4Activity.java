package com.example.yahaya.dsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Question4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        TextView tv=(TextView)findViewById(R.id.textView3);
        String Q_4=getString(R.string.question4);
        tv.setText(Q_4);
        Button prevbtn=(Button)findViewById(R.id.button7);
        prevbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Question4Activity.this,Question3Activity.class);
                startActivity(intent);

            }
        });
    }
}
