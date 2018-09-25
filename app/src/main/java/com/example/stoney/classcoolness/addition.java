package com.example.stoney.classcoolness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class addition extends AppCompatActivity {


    private int score;
    private int xVariable;
    private int yVariable;
    private int zVariable;

    private TextView score;
    private TextView question;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);


        score = findViewById(R.id.score_view);
        question = findViewById(R.id.question_view);



    }










}
