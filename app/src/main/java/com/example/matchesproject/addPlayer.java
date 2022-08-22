package com.example.matchesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class addPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);


        EditText playerName = findViewById(R.id.et_playername);
        EditText playerGoals = findViewById(R.id.et_goals);
        EditText playerAssists = findViewById(R.id.et_assits);
        Button addPlayerBtn = findViewById(R.id.addPlayerBtn);

        TopPlayerDataBase topPlayerDB = new TopPlayerDataBase(getApplicationContext());

        addPlayerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String myPlayerName = playerName.getText().toString();
                int myPlayerGoals = Integer.parseInt(playerGoals.getText().toString());
                int myPlayerAssists = Integer.parseInt(playerAssists.getText().toString());



                if(!myPlayerName.isEmpty() && myPlayerGoals == (int)myPlayerGoals && myPlayerAssists == (int)myPlayerAssists) {
                    PlayersDetails myPlayer = new PlayersDetails(myPlayerName, myPlayerGoals, myPlayerAssists);
                    topPlayerDB.addPlayer(myPlayer);
                    Toast.makeText(getApplicationContext(), "Player Added", Toast.LENGTH_LONG).show();

                }
                else {
                    Toast.makeText(getApplicationContext(), "Please Enter All Data", Toast.LENGTH_LONG).show();

                }

            }
        });



    }
}