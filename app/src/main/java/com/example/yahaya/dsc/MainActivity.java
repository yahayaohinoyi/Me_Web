package com.example.yahaya.dsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="com.example.yahaya.dsc";
    static int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Q_1=(TextView)findViewById(R.id.textView);
        String string=getString(R.string.question1);
        Q_1.setText(string);
        score=0;
    }

    public void onRadioButtonClicked(View view){
        boolean checked=((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.option1:
                if(checked){

                }
            case R.id.option2:
                if(checked){
                    score++;
                }
            case R.id.option3:
                if(checked){

                }
            case R.id.option4:
                if(checked){

                }
        }

    }
    public void messenger(View view){
     Intent intent=new Intent(MainActivity.this,Question2Activity.class);
     intent.putExtra("com.example.yahaya.dsc.Scorekey",score);
     startActivity(intent);
    }
}
