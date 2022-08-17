package com.example.matchesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TransferActivity extends AppCompatActivity {
ListView transferList;
ArrayAdapter<String> transferAdapter;
TransferDataBase transfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        transferAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1);
        transferList.setAdapter(transferAdapter);

        transfer = new TransferDataBase(getApplicationContext());
        //ArrayAdapter<Transfere> adapter = transfer.getTransfers();

    }
}