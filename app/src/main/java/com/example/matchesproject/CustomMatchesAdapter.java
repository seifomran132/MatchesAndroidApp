package com.example.matchesproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomMatchesAdapter extends ArrayAdapter<Match> {

    private Context myContext;
    private int resId;
    public CustomMatchesAdapter(@NonNull Context context, int resource, ArrayList<Match> matchesList) {
        super(context, resource, matchesList);
        myContext = context;
        resId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String firstTeam = getItem(position).getFirstTeam();
        String secondTeam = getItem(position).getSecondTeam();
        String time = getItem(position).getMatchTime();
        String champ = getItem(position).getChamp();

        Match tempMatch = new Match(firstTeam,secondTeam,time, champ);

        LayoutInflater inflater = LayoutInflater.from(myContext);
        convertView = inflater.inflate(resId, parent, false);

        TextView tv_first = convertView.findViewById(R.id.firstteam);
        TextView tv_second = convertView.findViewById(R.id.secondteam);
        TextView tv_time = convertView.findViewById(R.id.time);

        tv_first.setText(firstTeam);
        tv_second.setText(secondTeam);
        tv_time.setText(time);

        return convertView;

    }
}
