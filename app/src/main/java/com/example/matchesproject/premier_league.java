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
import java.util.Arrays;
import java.util.List;

public class premier_league extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premier_league);

        MatchesDataBase obj =new MatchesDataBase(this);
        addtolist add = new addtolist(obj.getMatches());

        ArrayList<Match> prem_Match =new ArrayList<Match>();



        for (int i=0 ;i<add.getCount();i++){
            if (add.getItem(i).equals("premier league")) {
                prem_Match = add.mat;
            }
        }


        ListView prem_list =(ListView)findViewById(R.id.premlist);



        prem_list.setAdapter((ListAdapter) prem_Match);




    }
    public class addtolist extends BaseAdapter {
        ArrayList<Match> mat = new ArrayList<Match>();

        public addtolist(ArrayList<Match> m){
            this.mat=m;
        }

        @Override
        public int getCount() {
            return mat.size();
        }

        @Override
        public Object getItem(int i) {
            return mat.get(i).getChamp().toString();
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater lay = getLayoutInflater();
            View vw =lay.inflate(R.layout.adapter_matchlist,null);
            TextView txt_f=(TextView)vw.findViewById(R.id.firstteam);
            TextView txt_s=(TextView)vw.findViewById(R.id.secondteam);
            // score ya omran  TextView txt_score=(TextView)vw.findViewById(R.id.score);
            TextView txt_t=(TextView)vw.findViewById(R.id.time);
            txt_f.setText(mat.get(i).getFirstTeam().toString());
            txt_s.setText(mat.get(i).getSecondTeam().toString());
            //score ya omran txt_score.setText(mat.get(i).score.toString());
            txt_t.setText(mat.get(i).getMatchTime().toString());
            return vw;
        }
    }
}