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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Q_1=(TextView)findViewById(R.id.textView);
        String string=getString(R.string.question1);
        Q_1.setText(string);
    }

    public void onRadioButtonClicked(View view){
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
    public void messenger(View view){
     Intent intent=new Intent(MainActivity.this,Question2Activity.class);
     startActivity(intent);
    }
}
