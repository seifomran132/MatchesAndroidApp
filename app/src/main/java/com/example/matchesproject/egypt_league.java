package com.example.matchesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class egypt_league extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egypt_league);


        MatchesDataBase matchesDB = new MatchesDataBase(this);
        ArrayList<Match> egyptianMatches = new ArrayList<Match>();
        ListView egyList = (ListView) findViewById(R.id.egyptlist);

        egyptianMatches = OurUtilities.filterMatches("egyptian league", matchesDB.getMatches());

        CustomMatchesAdapter myAdapter = new CustomMatchesAdapter(this, R.layout.adapter_matchlist, egyptianMatches);

        egyList.setAdapter(myAdapter);
    }
}