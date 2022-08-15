package com.example.matchesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Seif Wael
        Button search=(Button) findViewById(R.id.topPlayersBtn);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playersData = new Intent(MainActivity.this,ViewPlayers.class);
                startActivity(playersData);
            }
        });


        //Intent myIntent = new Intent(this, addMatch.class);
        //startActivity(myIntent);


/*
        MatchesDataBase mdb = new MatchesDataBase(getApplicationContext());


        Button viewBtn = findViewById(R.id.viewMatchesBtn);
        Button addBtn = findViewById(R.id.addBtn);

        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ArrayList<Match> matchesList = mdb.getMatches();

                System.out.println(matchesList);

            }
        });


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Match newMatch = new Match("barca", "real", "10:00", "spanish");
                mdb.createMatch(newMatch);

            }
        });
*/


    }
}