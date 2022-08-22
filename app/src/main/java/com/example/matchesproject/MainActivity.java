package com.example.matchesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton prembtn = (ImageButton) findViewById(R.id.premiuerbtn);
        ImageButton egybtn = (ImageButton) findViewById(R.id.egybtn);
        ImageButton laligabtn = (ImageButton) findViewById(R.id.labtn);
        ImageButton uefabtn = (ImageButton) findViewById(R.id.uefa_btn);


        prembtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                                Intent in =new Intent(getApplicationContext(),premier_league.class);
                startActivity(in);
            }
        });

        egybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(getApplicationContext(),egypt_league.class);
                startActivity(in);

            }
        });

        laligabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(getApplicationContext(),laliga_league.class);
                startActivity(in);

            }
        });

        uefabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(getApplicationContext(),uefa_champ.class);
                startActivity(in);

            }
        });












    }

    public void btn_tran(View v){
        Intent intent=new Intent(MainActivity.this,Transfere_ListView.class);
        startActivity(intent);
    }
    public void btn_top_players(View v){
        Intent intent=new Intent(MainActivity.this,ViewPlayers.class);
        startActivity(intent);
    }

    public void admin_dash(View v){
        Intent intent=new Intent(MainActivity.this, AdminLogin.class);
        startActivity(intent);
    }
}