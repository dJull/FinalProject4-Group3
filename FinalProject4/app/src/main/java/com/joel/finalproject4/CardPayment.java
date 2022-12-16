package com.joel.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class CardPayment extends AppCompatActivity {

    EditText username;
    EditText username1;
    EditText username2;
    EditText username3;
    EditText username4;
    Button btnpay;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_payment);

        //
        back = findViewById(R.id.back);
        username = findViewById(R.id.username);
        username1 = findViewById(R.id.username1);
        username2 = findViewById(R.id.username2);
        username3 = findViewById(R.id.username3);
        username4 = findViewById(R.id.username4);
        btnpay = findViewById(R.id.btnpay);

        //
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CardPayment.this,PaymentMethod.class);
                startActivity(intent);
            }
        });

        //
        username.addTextChangedListener(loginTextWatcher);
        username1.addTextChangedListener(loginTextWatcher);
        username2.addTextChangedListener(loginTextWatcher);
        username3.addTextChangedListener(loginTextWatcher);
        username4.addTextChangedListener(loginTextWatcher);

    }

    //
    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String usernameInput = username.getText().toString().trim();
            String username1Input = username1.getText().toString().trim();
            String username2Input = username2.getText().toString().trim();
            String username3Input = username3.getText().toString().trim();
            String username4Input = username4.getText().toString().trim();

            btnpay.setEnabled(!usernameInput.isEmpty() && !username1Input.isEmpty() && !username2Input.isEmpty() && !username3Input.isEmpty() && !username4Input.isEmpty());

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}