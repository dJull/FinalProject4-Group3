package com.joel.finalproject4;

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

import androidx.appcompat.app.AppCompatActivity;

import com.joel.finalproject4.ui.dashboard.DashboardFragment;

public class TicketsDetailActivity extends AppCompatActivity {

    private Dialog dialog;
    private Dialog dialog1;
    private LinearLayout ShowDialog;
    private ImageView ShowDialog1;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tickets_detail);

        //
        ShowDialog = findViewById(R.id.dialog_btn);
        ShowDialog1 = findViewById(R.id.qrqode);
        back = findViewById(R.id.back);

        //
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TicketsDetailActivity.this, DashboardFragment.class);
                startActivity(intent);
            }
        });

        //Dialog
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog_layout);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.custom_dialog_background));
        }
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false); //Optional
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation; //Setting the animations to dialog

        Button Okay = dialog.findViewById(R.id.btn_okay);

        Okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(TicketsDetailActivity.this, "Thanks", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        ShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.show(); // Showing the dialog here
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

                Toast.makeText(TicketsDetailActivity.this, "Thanks", Toast.LENGTH_SHORT).show();
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