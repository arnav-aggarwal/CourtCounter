package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int aScore = 0;
    int bScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(aScore));
    }

    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(bScore));
    }

    public void incrementA3(View view) {
        aScore += 3;
        displayForTeamA();
    }

    public void incrementA2(View view) {
        aScore += 2;
        displayForTeamA();
    }

    public void incrementA1(View view) {
        aScore++;
        displayForTeamA();
    }

    public void incrementB3(View view) {
        bScore += 3;
        displayForTeamB();
    }

    public void incrementB2(View view) {
        bScore += 2;
        displayForTeamB();
    }

    public void incrementB1(View view) {
        bScore++;
        displayForTeamB();
    }

    public void resetScores(View view) {
        aScore = 0;
        bScore = 0;
        displayForTeamA();
        displayForTeamB();
    }
}
