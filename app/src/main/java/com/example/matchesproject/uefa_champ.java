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

public class uefa_champ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uefa_champ);

        MatchesDataBase matchesDB =new MatchesDataBase(this);
        ArrayList<Match> uefaMatches =new ArrayList<Match>();
        ListView uefaList =(ListView)findViewById(R.id.uefalist);

        uefaMatches = OurUtilities.filterMatches("uefa", matchesDB.getMatches());

        CustomMatchesAdapter myAdapter = new CustomMatchesAdapter(this,R.layout.adapter_matchlist, uefaMatches);

        uefaList.setAdapter(myAdapter);

    }

}