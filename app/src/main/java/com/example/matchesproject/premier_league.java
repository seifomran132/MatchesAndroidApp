package com.example.matchesproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class premier_league extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premier_league);

        MatchesDataBase matchesDB =new MatchesDataBase(this);
        ArrayList<Match> premierMatches =new ArrayList<Match>();
        ListView prem_list =(ListView)findViewById(R.id.premlist);

        premierMatches = OurUtilities.filterMatches("premier league", matchesDB.getMatches());

        CustomMatchesAdapter myAdapter = new CustomMatchesAdapter(this,R.layout.adapter_matchlist, premierMatches);

        prem_list.setAdapter(myAdapter);




    }

}