package com.example.matchesproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class TransferDataBase extends SQLiteOpenHelper {

    private static String db_name = "transfers_database";
    SQLiteDatabase myDB;


    public TransferDataBase(@Nullable Context context) {
        super(context, db_name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table transfers(playername text not null, newclub text not null, oldclub text not null, transfercost integer not null, newsalary integer not null, contracttime text not null)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists transfers");
        onCreate(db);
    }

    public void createTransfer(Transfere t) {
        ContentValues row = new ContentValues();
        row.put("playername", t.getPlyarName());
        row.put("newclub", t.getNewClub());
        row.put("oldclub", t.getOldClub());
        row.put("transfercost", t.getTransferCost());
        row.put("newsalary", t.getNewSalary());
        row.put("contracttime", t.getContractDate());

        myDB = getWritableDatabase();
        myDB.insert("transfers", null, row);

        myDB.close();

    }

    public ArrayList<Transfere> getTransfers() {
        ArrayList<Transfere> transfers = new ArrayList<>();
        Cursor c;
        myDB = getReadableDatabase();
        String[] rowDetails = {"playername", "newclub", "oldclub", "transfercost", "newsalary", "contracttime"};

        c = myDB.query("transfers", rowDetails, null, null, null, null, null);

        if(c.moveToFirst()) {
            do{
                String playerName = c.getString(0);
                String newClub = c.getString(1);
                String odlClub = c.getString(2);
                float transferCost = c.getInt(3);
                float newSalary = c.getInt(4);
                String contractTime = c.getString(5);

                Transfere tempTransfer = new Transfere(playerName, newClub, odlClub, transferCost, newSalary, contractTime);

                transfers.add(tempTransfer);

            }
            while(c.moveToNext());
        }
        myDB.close();

        return transfers;
    }
}
