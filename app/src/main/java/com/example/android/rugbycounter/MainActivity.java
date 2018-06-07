package com.example.android.rugbycounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int uganda_score=0;
    int kenya_score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uganda_try(View view){
        uganda_score+=5;
        TextView textBox=findViewById(R.id.ugandaScore);
        textBox.setText(String.valueOf(uganda_score));
    }

    public void uganda_conversion(View view){
        uganda_score+=2;
        TextView textBox=findViewById(R.id.ugandaScore);
        textBox.setText(String.valueOf(uganda_score));
    }

    public void uganda_drop(View view){
        uganda_score+=3;
        TextView textBox=findViewById(R.id.ugandaScore);
        textBox.setText(String.valueOf(uganda_score));
    }

    public void uganda_penalty(View view){
        uganda_score+=3;
        TextView textBox=findViewById(R.id.ugandaScore);
        textBox.setText(String.valueOf(uganda_score));
    }

    public void uganda_penalty_try(View view){
        uganda_score+=7;
        TextView textBox=findViewById(R.id.ugandaScore);
        textBox.setText(String.valueOf(uganda_score));
    }

    public void kenya_try(View view){
        kenya_score+=5;
        TextView textBox=findViewById(R.id.kenyaScore);
        textBox.setText(String.valueOf(kenya_score));
    }

    public void kenya_conversion(View view){
        kenya_score+=2;
        TextView textBox=findViewById(R.id.kenyaScore);
        textBox.setText(String.valueOf(kenya_score));
    }

    public void kenya_drop(View view){
        kenya_score+=3;
        TextView textBox=findViewById(R.id.kenyaScore);
        textBox.setText(String.valueOf(kenya_score));
    }

    public void kenya_penalty(View view){
        kenya_score+=3;
        TextView textBox=findViewById(R.id.kenyaScore);
        textBox.setText(String.valueOf(kenya_score));
    }

    public void kenya_penalty_try(View view){
        kenya_score+=7;
        TextView textBox=findViewById(R.id.kenyaScore);
        textBox.setText(String.valueOf(kenya_score));
    }

    public void reset(View view){
        TextView kenyaScoreView=findViewById(R.id.kenyaScore);
        TextView ugandaScoreView=findViewById(R.id.ugandaScore);
        kenya_score=0;
        uganda_score=0;
        kenyaScoreView.setText(String.valueOf(kenya_score));
        ugandaScoreView.setText(String.valueOf(uganda_score));

    }
}
