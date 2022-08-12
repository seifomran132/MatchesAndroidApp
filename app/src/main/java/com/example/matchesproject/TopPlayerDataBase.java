package com.example.matchesproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

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


}
