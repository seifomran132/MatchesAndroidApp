package com.example.matchesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddTransfer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_transfer);

        EditText playerName = findViewById(R.id.et_admin_PlayerName);
        EditText newClub = findViewById(R.id.et_admin_NewClub);
        EditText oldClub = findViewById(R.id.et_admin_OldClub);
        EditText newSalary = findViewById(R.id.et_admin_NewSalary);
        EditText transferCost = findViewById(R.id.et_admin_TransferCost);
        EditText contractTime = findViewById(R.id.et_admin_ContractTime);

        Button addTransferBtn = findViewById(R.id.btn_admin_addTransfer);

        TransferDataBase transferDataBase = new TransferDataBase(getApplicationContext());

        addTransferBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myPlayerName = playerName.getText().toString();
                String myNewClub = newClub.getText().toString();
                float myNewSalary = Float.parseFloat(newSalary.getText().toString());
                String myOldClub = oldClub.getText().toString();
                float myTransferCost = Float.parseFloat(transferCost.getText().toString());
                String myContractTime = contractTime.getText().toString();
                Transfere tempTransfer = new Transfere(myPlayerName, myNewClub, myOldClub, myTransferCost, myNewSalary, myContractTime);
                transferDataBase.createTransfer(tempTransfer);


            }
        });


    }
}