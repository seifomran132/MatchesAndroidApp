package com.example.matchesproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class laliga_league extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laliga_league);

        MatchesDataBase matchesDB =new MatchesDataBase(this);
        ArrayList<Match> laligaMatches =new ArrayList<Match>();
        ListView laliga_list =(ListView)findViewById(R.id.laligalist);

        laligaMatches = OurUtilities.filterMatches("laliga", matchesDB.getMatches());

        CustomMatchesAdapter myAdapter = new CustomMatchesAdapter(this,R.layout.adapter_matchlist, laligaMatches);

        laliga_list.setAdapter(myAdapter);

    }

}