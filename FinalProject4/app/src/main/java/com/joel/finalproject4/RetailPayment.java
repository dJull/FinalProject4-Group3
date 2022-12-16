package com.joel.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class RetailPayment extends AppCompatActivity {

    ImageView back;
    private Dialog dialog1;
    private ImageView ShowDialog1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retail_payment);

        //
        ShowDialog1 = findViewById(R.id.qrqode);
        back = findViewById(R.id.back);

        //
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RetailPayment.this,PaymentMethod.class);
                startActivity(intent);
            }
        });

        //Dialog1
        dialog1 = new Dialog(this);
        dialog1.setContentView(R.layout.custom_dialog1_layout);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            dialog1.getWindow().setBackgroundDrawable(getDrawable(R.drawable.custom_dialog_background));
        }
        dialog1.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog1.setCancelable(false); //Optional
        dialog1.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation; //Setting the animations to dialog

        Button Back = dialog1.findViewById(R.id.btn_back);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(RetailPayment.this, "Thanks", Toast.LENGTH_SHORT).show();
                dialog1.dismiss();
            }
        });

        ShowDialog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog1.show(); // Showing the dialog here
            }
        });

    }
}