package com.example.matchesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*

        ****THIS IS JUST TO TEST THE DATABASE****


        MatchesDataBase mdb = new MatchesDataBase(getApplicationContext());
        Match m = new Match("barca", "real", "10:00", "spanish");

        Toast.makeText(getApplicationContext(), m.toString(), Toast.LENGTH_SHORT).show();




        mdb.createMatch(m);

        Button viewBtn = findViewById(R.id.viewMatchesBtn);

        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Cursor c = mdb.getMatches();

                c.moveToPosition(0);

                if(c.moveToFirst()) {
                    do {
                        System.out.println(c.getString(0));
                        c.moveToNext();
                        Toast.makeText(getApplicationContext(), c.getString(0), Toast.LENGTH_SHORT).show();
                    }
                    while (c.moveToNext());
                }

            }
        });
        */


    }
}