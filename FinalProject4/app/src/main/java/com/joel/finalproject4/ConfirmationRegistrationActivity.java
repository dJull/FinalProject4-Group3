package com.joel.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ConfirmationRegistrationActivity extends AppCompatActivity {

    Button btnConf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_registration);
        btnConf=findViewById(R.id.btnConfirmation);

        btnConf.setOnClickListener(v->{
            getMain();
        });
    }

    private void getMain(){
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}