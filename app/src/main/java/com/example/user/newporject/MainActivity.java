package com.example.user.newporject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoreTeamA = 0;
    int SCoreTeamB =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void addThreeToTeamA(View view) {
       ScoreTeamA = ScoreTeamA+3;
        displayForTeamA(ScoreTeamA);

    }

    public void addTwoToTeamA(View view) {
        ScoreTeamA = ScoreTeamA+2;
        displayForTeamA(ScoreTeamA);

    }

    public void addOneToTeamA(View view){
        ScoreTeamA = ScoreTeamA+1;
        displayForTeamA(ScoreTeamA);


    }

    public void  displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }





    public void addThreeToTeamB(View view) {
        SCoreTeamB = SCoreTeamB+3;
        displayForTeamB(SCoreTeamB);

    }

    public void addTwoToTeamB(View view) {
        SCoreTeamB= SCoreTeamB+2;
        displayForTeamB(SCoreTeamB);

    }

    public void addOneToTeamB(View view){
        SCoreTeamB = SCoreTeamB+1;
        displayForTeamB(SCoreTeamB);


    }

    public void  displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void resetScore(View view){
        SCoreTeamB = 0;
        displayForTeamB(SCoreTeamB);
        ScoreTeamA = 0;
        displayForTeamA(ScoreTeamA);

    }
}