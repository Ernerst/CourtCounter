package com.ernerst.ekasilabalexcdtb.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public  void displayForTYeamA(int score){

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public  void displayForTYeamB(int score){

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void  addThreeForTeamA(View v){

        scoreTeamA = scoreTeamA + 3;
        displayForTYeamA(scoreTeamA);

    }

    public void  addThreeForTeamB(View v){

        scoreTeamB = scoreTeamB + 3;
        displayForTYeamB(scoreTeamB);

    }

    public void  addTwoForTeamA(View v){

        scoreTeamA = scoreTeamA + 2;
        displayForTYeamA(scoreTeamA);

    }

    public void  addTwoForTeamB(View v){

        scoreTeamB = scoreTeamB + 2;
        displayForTYeamB(scoreTeamB);

    }

    public void  addOneForTeamA(View v){

        scoreTeamA = scoreTeamA + 1;
        displayForTYeamA(scoreTeamA);

    }

    public void  addOneForTeamB(View v){

        scoreTeamB = scoreTeamB + 1;
        displayForTYeamB(scoreTeamB);

    }

    public  void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTYeamA(scoreTeamA);
        displayForTYeamB(scoreTeamB);

    }
}
