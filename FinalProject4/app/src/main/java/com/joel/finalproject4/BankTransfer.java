package com.joel.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BankTransfer extends AppCompatActivity {

    TextView pilihh;
    TextView pilihh1;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_transfer);

        //
        pilihh = findViewById(R.id.pilihh);
        pilihh1 = findViewById(R.id.pilihh1);
        back = findViewById(R.id.back);

        //
        pilihh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BankTransfer.this,BniBank.class);
                startActivity(intent);
            }
        });

        //
        pilihh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BankTransfer.this,CimbNiagaBank.class);
                startActivity(intent);
            }
        });

        //
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BankTransfer.this,PaymentMethod.class);
                startActivity(intent);
            }
        });

    }
}