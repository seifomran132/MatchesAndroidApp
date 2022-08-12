package com.example.matchesproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MatchesDataBase extends SQLiteOpenHelper {

    private static String db_name = "matchesDB";
    SQLiteDatabase myDB;

    public MatchesDataBase(@Nullable Context context) {
        super(context, db_name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table matches(firstteam text not null, secondteam text not null, matchtime text not null, champ text not null)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists matches");
        onCreate(db);
    }

    public void createMatch(Match m) {
        ContentValues row = new ContentValues();
        row.put("firstteam", m.getFirstTeam());
        row.put("secondteam", m.getSecondTeam());
        row.put("matchtime", m.getMatchTime());
        row.put("champ", m.getChamp());

        myDB = getWritableDatabase();
        myDB.insert("matches", null, row);

        myDB.close();

    }

    public Cursor getMatches() {
        Cursor c;

        myDB = getReadableDatabase();
        String[] rowDetails = {"firstteam", "secondteam", "matchtime", "champ"};

        c = myDB.query("matches", rowDetails, null, null, null, null, null);

        if(c!=null) {
            c.moveToFirst();
        }
        myDB.close();
        return c;
    }

}
