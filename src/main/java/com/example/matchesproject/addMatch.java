package com.example.matchesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class addMatch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_match);


        // Input Fields

        EditText firstName = findViewById(R.id.et_firstname);
        EditText secondName = findViewById(R.id.et_secondname);
        EditText matchTime = findViewById(R.id.et_matchtime);
        EditText champ = findViewById(R.id.et_champ);
        Button addMatch = findViewById(R.id.btn_addmatch);

        // Instance of Database

        MatchesDataBase matchesDB = new MatchesDataBase(getApplicationContext());


        addMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fn = firstName.getText().toString();
                String sn = secondName.getText().toString();
                String mt = matchTime.getText().toString();
                String ch = champ.getText().toString();

                if(!fn.isEmpty() && !sn.isEmpty() && !mt.isEmpty() && !ch.isEmpty()) {
                    Match addedMatch = new Match(fn, sn, mt, ch);
                    matchesDB.createMatch(addedMatch);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Please Enter All Data", Toast.LENGTH_LONG).show();
                }


                ArrayList<Match> matchesList = matchesDB.getMatches();

                System.out.println(matchesList);
            }
        });


    }
}