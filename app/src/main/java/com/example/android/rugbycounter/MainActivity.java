package com.example.android.rugbycounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int uganda_score = 0;
    private int kenya_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reset(new View(this));
    }

    public void uganda_try(View view) {
        add_points_uganda(5);
    }

    public void uganda_conversion(View view) {
        add_points_uganda(2);
    }

    public void uganda_drop(View view) {
        add_points_uganda(3);
    }

    public void uganda_penalty(View view) {
        add_points_uganda(3);
    }

    public void uganda_penalty_try(View view) {
        add_points_uganda(7);
    }

    public void kenya_try(View view) {
        add_points_kenya(5);
    }

    public void kenya_conversion(View view) {
        add_points_kenya(2);
    }

    public void kenya_drop(View view) {
        add_points_kenya(3);
    }

    public void kenya_penalty(View view) {
        add_points_kenya(3);
    }

    public void kenya_penalty_try(View view) {
        add_points_kenya(7);

    }

    /*
        This method adds points to Kenya's score and displays it
     */
    private void add_points_kenya(int points) {
        kenya_score += points;
        TextView textBox = findViewById(R.id.kenyaScore);
        textBox.setText(getString(R.string.score_kenya, kenya_score));
    }

    /*
        This method adds points to Uganda's score and displays it
     */
    private void add_points_uganda(int points) {
        uganda_score += points;
        TextView textBox = findViewById(R.id.ugandaScore);
        textBox.setText(getString(R.string.score_uganda, uganda_score));
    }

    /*
        This method resets the scores to zero and displays them
     */
    public void reset(View view) {
        TextView kenyaScoreView = findViewById(R.id.kenyaScore);
        TextView ugandaScoreView = findViewById(R.id.ugandaScore);
        kenya_score = 0;
        uganda_score = 0;
        kenyaScoreView.setText(getString(R.string.score_kenya, kenya_score));
        ugandaScoreView.setText(getString(R.string.score_uganda, uganda_score));

    }
}
