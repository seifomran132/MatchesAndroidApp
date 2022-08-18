package com.example.matchesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Transfere_ListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfere_list_view);

        TransferDataBase transferDB = new TransferDataBase(this);
        ArrayList<Transfere> transfers = transferDB.getTransfers();
        ListView transfer_list =(ListView)findViewById(R.id.TransferList);

        CustomTransferAdapter myAdapter = new CustomTransferAdapter(this, R.layout.activity_transfer, transfers);

        transfer_list.setAdapter(myAdapter);

    }
}