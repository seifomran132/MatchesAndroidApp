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

public class CustomTransferAdapter extends ArrayAdapter<Transfere> {

    private Context myContext;
    private int resId;
    public CustomTransferAdapter(@NonNull Context context, int resource, ArrayList<Transfere> transferList) {
        super(context, resource, transferList);
        myContext = context;
        resId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String playerName = getItem(position).getPlyarName();
        String newClub = getItem(position).getNewClub();
        String oldClub = getItem(position).getOldClub();
        float newSalary = getItem(position).getNewSalary();
        float transferCost = getItem(position).getTransferCost();
        String contractDate = getItem(position).getContractDate();

        Transfere tempTransfer = new Transfere(playerName,newClub, oldClub, transferCost, newSalary, contractDate);

        LayoutInflater inflater = LayoutInflater.from(myContext);
        convertView = inflater.inflate(resId, parent, false);

        TextView tv_playerName = convertView.findViewById(R.id.et_playerName);
        TextView tv_oldClub = convertView.findViewById(R.id.OldClub);
        TextView tv_newClub = convertView.findViewById(R.id.NewClub);
        TextView tv_contractDate = convertView.findViewById(R.id.ContractDate);
        TextView tv_newSalary = convertView.findViewById(R.id.NewSalary);

        tv_playerName.setText(playerName);
        tv_oldClub.setText("From: " + oldClub);
        tv_newClub.setText("To +" + newClub);
        tv_newSalary.setText( "Salary: " + String.valueOf(newSalary));
        tv_contractDate.setText("Contact ends: " + contractDate);


        return convertView;
    }
}
