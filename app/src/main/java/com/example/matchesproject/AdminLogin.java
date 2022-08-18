package com.example.matchesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        EditText adminUserName = findViewById(R.id.et_adminUserName);
        EditText adminPassword = findViewById(R.id.et_adminPassword);
        Button adminLoginBtn = findViewById(R.id.btn_adminLogin);

        adminLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String adminUser = "Seif";
                String adminPass = "123";

                if(adminUserName.getText().toString().equals(adminUser) && adminPassword.getText().toString().equals(adminPass)) {
                    Intent intent=new Intent(getApplicationContext(),AdminDashboard.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), "Login Not Successfully", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}