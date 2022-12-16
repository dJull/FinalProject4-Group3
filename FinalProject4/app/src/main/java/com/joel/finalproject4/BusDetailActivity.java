package com.joel.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class BusDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_detail);
        Button buttonBookNow= (Button) findViewById(R.id.btnBookNow);
        buttonBookNow.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(),DetailPaymentActivity.class));
        });
    }
}