package com.example.matchesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ViewPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_players);

        final ListView Glist = (ListView) findViewById(R.id.TopPlayersGoals);
        final ListView Alist = (ListView) findViewById(R.id.TopPLayersAssists);

        ArrayAdapter<Object> GoalsAdapter = new ArrayAdapter<Object>
                (getApplicationContext(), android.R.layout.simple_list_item_1);
        Glist.setAdapter(GoalsAdapter);

        ArrayAdapter<Object> AssistsAdapter = new ArrayAdapter<Object>
                (getApplicationContext(), android.R.layout.simple_list_item_2);
        Alist.setAdapter(AssistsAdapter);

        TopPlayerDataBase players = new TopPlayerDataBase(getApplicationContext());



        Cursor cur = players.getGoalsAndAssists();

        //ArrayList<PlayersDetails> PlayersList = players.getGoalsAndAssists();
        //System.out.println(PlayersList);

        PlayersDetails pl = new PlayersDetails();

        if(cur != null) {
            while (!cur.isAfterLast()) {

                pl.setPlayerName(cur.getString(0));
                pl.setGoals(cur.getInt(1));
                GoalsAdapter.add(pl.getPlayerName());
                GoalsAdapter.add(pl.getGoals());
                cur.moveToNext();
            }
            cur.moveToFirst();
            while (!cur.isAfterLast()) {
                pl.setPlayerName(cur.getString(0));
                pl.setAssists(cur.getInt(2));
                AssistsAdapter.add(pl.getPlayerName());
                AssistsAdapter.add(pl.getAssists());
                cur.moveToNext();
            }
        }
        else
        {
            Toast.makeText(getApplicationContext(),"no database",Toast.LENGTH_LONG).show();
        }
    }
}