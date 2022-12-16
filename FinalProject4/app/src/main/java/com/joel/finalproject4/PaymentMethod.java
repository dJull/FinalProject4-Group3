package com.joel.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PaymentMethod extends AppCompatActivity {

    TextView pilih;
    TextView pilih1;
    TextView pilih2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);

        //
        pilih = findViewById(R.id.pilih);
        pilih1 = findViewById(R.id.pilih1);
        pilih2 = findViewById(R.id.pilih2);

        //
        pilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentMethod.this,CardPayment.class);
                startActivity(intent);
            }
        });

        //
        pilih1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentMethod.this, BankTransfer.class);
                startActivity(intent);
            }
        });

        //
        pilih2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentMethod.this,RetailPayment.class);
                startActivity(intent);
            }
        });
    }
}