package com.example.matchesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton prembtn = (ImageButton) findViewById(R.id.premiuerbtn);
        ImageButton egybtn = (ImageButton) findViewById(R.id.egybtn);
        ImageButton laligabtn = (ImageButton) findViewById(R.id.labtn);
        ImageButton uefabtn = (ImageButton) findViewById(R.id.uefa_btn);


        prembtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MatchesDataBase mdb = new MatchesDataBase(getApplicationContext());
                Match m = new Match("Barca", "Real", "10:00", "premier league");
                mdb.createMatch(m);

                Intent in =new Intent(getApplicationContext(),premier_league.class);
                startActivity(in);
            }
        });

        egybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(getApplicationContext(),egypt_league.class);
                startActivity(in);
                MatchesDataBase mdb = new MatchesDataBase(getApplicationContext());
                Match m = new Match("Barca", "Real", "10:00", "egyptian league");
                mdb.createMatch(m);
            }
        });

        laligabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(getApplicationContext(),laliga_league.class);
                startActivity(in);
                MatchesDataBase mdb = new MatchesDataBase(getApplicationContext());
                Match m = new Match("Barca", "Real", "10:00", "laliga");
                mdb.createMatch(m);
            }
        });

        uefabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(getApplicationContext(),uefa_champ.class);
                startActivity(in);
                MatchesDataBase mdb = new MatchesDataBase(getApplicationContext());
                Match m = new Match("Barca", "Real", "10:00", "uefa");
                mdb.createMatch(m);
            }
        });










/*

TopPlayerDataBase topDB = new TopPlayerDataBase(getApplicationContext());

        Button viewBtn = findViewById(R.id.viewMatchesBtn);
        Button addBtn = findViewById(R.id.addBtn);

        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ArrayList<PlayersDetails> players = new ArrayList<>();
                players = topDB.getGoalsByOrder();

                System.out.println(players);


            }
        });


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PlayersDetails p1 = new PlayersDetails("Seif", 20, 6);
                topDB.addPlayer(p1);



            }
        });

        Intent myIntent = new Intent(this, addPlayer.class);
        startActivity(myIntent);

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

    public void btn_tran(View v){
        Intent intent=new Intent(MainActivity.this,Transfere_ListView.class);
        startActivity(intent);
    }
    public void btn_top_players(View v){
        Intent intent=new Intent(MainActivity.this,ViewPlayers.class);
        startActivity(intent);
    }

    public void admin_dash(View v){
        Intent intent=new Intent(MainActivity.this,addMatch.class);
        startActivity(intent);
    }
}