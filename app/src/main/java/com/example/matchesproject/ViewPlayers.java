package com.example.matchesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;

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
                (getApplicationContext(), android.R.layout.simple_list_item_1);
        Alist.setAdapter(AssistsAdapter);

        TopPlayerDataBase players = new TopPlayerDataBase(getApplicationContext());

        PlayersDetails pl = new PlayersDetails();


        //Cursor cur = players.getGoalsAndAssists();

        try {
            ArrayList<PlayersDetails> GoalsList = players.getGoalsByOrder();
            ArrayList<PlayersDetails> AssitsList = players.getAssitsByOrder();


            int i = GoalsList.size()-1;
            int j=1;
            while(i>0) {

                GoalsAdapter.add(j+"\t\t\t"+GoalsList.get(i).getPlayerName() + "\t\t\t\t\t\t\t\t\t\t\t\t\t"
                        + GoalsList.get(i).getGoals());
                j++;
                i--;
            }

            i = AssitsList.size()-1;
            j=1;
            while(i>0) {

                AssistsAdapter.add(j+"\t\t\t"+AssitsList.get(i).getPlayerName() + "\t\t\t\t\t\t\t\t\t\t\t\t\t"
                        + AssitsList.get(i).getAssists());
                j++;
                i--;
            }
        }
        catch(Error err) {
            Toast.makeText(getApplicationContext(), err.getMessage(), Toast.LENGTH_LONG).show();

        }

        /*if(cur != null) {
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
        }*/
    }
}