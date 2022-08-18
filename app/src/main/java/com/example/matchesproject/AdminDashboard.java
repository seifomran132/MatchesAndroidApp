package com.example.matchesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        Button toAddMatches = findViewById(R.id.btn_AdminAddMatches);
        Button toAddTransfer = findViewById(R.id.btn_AdminAddTransfer);
        Button toAddPlayer = findViewById(R.id.btn_AdminAddPlayers);

        toAddMatches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),addMatch.class);
                startActivity(intent);
            }
        });
        toAddPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),addPlayer.class);
                startActivity(intent);
            }
        });

        toAddTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),AddTransfer.class);
                startActivity(intent);
            }
        });

    }
}