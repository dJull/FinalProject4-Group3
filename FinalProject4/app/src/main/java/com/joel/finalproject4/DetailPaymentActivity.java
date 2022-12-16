package com.joel.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class DetailPaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_payment);
        Button buttonContinue = (Button) findViewById(R.id.btnContinue);
        buttonContinue.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(),PaymentMethod.class));
        });
    }
}