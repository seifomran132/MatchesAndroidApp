package com.example.matchesproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class TopPlayerDataBase extends SQLiteOpenHelper {

    private static String db_name = "topplayerDB";
    SQLiteDatabase myDB;

    public TopPlayerDataBase(@Nullable Context context) {
        super(context, db_name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table topplayer(playername text not null, goals integer not null, assits integer not null)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists topplayer");
        onCreate(db);
    }

    /*public Cursor getGoalsAndAssists(){
        myDB=getReadableDatabase();
        Cursor cursor = myDB.rawQuery("Select * from topplayer",null);
        if(cursor.getCount() != 0)
        {
            cursor.moveToFirst();
            myDB.close();
            return cursor;
        }
        myDB.close();
        return null;
    }*/

    public void addPlayer(PlayersDetails p) {
        ContentValues row = new ContentValues();
        row.put("playername", p.getPlayerName());
        row.put("goals", p.getGoals());
        row.put("assits", p.getAssists());

        myDB = getWritableDatabase();
        myDB.insert("topplayer", null, row);

        myDB.close();

    }

    public ArrayList<PlayersDetails> getGoalsByOrder() {

        ArrayList<PlayersDetails> PLayersArr = new ArrayList<>();

        Cursor c;
        myDB = getReadableDatabase();
        String[] rowDetails = {"playername","goals","assits"};

        c = myDB.query("topplayer", rowDetails, null, null, null,
                null, "goals");
        if(c.moveToFirst()) {
            do{
                String PlayerName = c.getString(0);
                int Goals = c.getInt(1);
                int Assists = c.getInt(2);

                PlayersDetails tempPlayer = new PlayersDetails(PlayerName, Goals, Assists);

                PLayersArr.add(tempPlayer);

            }
            while(c.moveToNext());
        }
        myDB.close();
        return PLayersArr;
    }


    public ArrayList<PlayersDetails> getAssitsByOrder() {

        ArrayList<PlayersDetails> PLayersArr1 = new ArrayList<>();

        Cursor c1;
        myDB = getReadableDatabase();
        String[] rowDetails = {"playername","goals","assits"};

        c1 = myDB.query("topplayer", rowDetails, null, null, null,
                null, "assits");
        if(c1.moveToFirst()) {
            do{
                String PlayerName = c1.getString(0);
                int Goals = c1.getInt(1);
                int Assists = c1.getInt(2);

                PlayersDetails tempPlayer = new PlayersDetails(PlayerName, Goals, Assists);

                PLayersArr1.add(tempPlayer);

            }
            while(c1.moveToNext());
        }
        myDB.close();
        return PLayersArr1;
    }

}
