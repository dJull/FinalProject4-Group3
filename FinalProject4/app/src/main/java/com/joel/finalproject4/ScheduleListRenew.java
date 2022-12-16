package com.joel.finalproject4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScheduleListRenew extends AppCompatActivity {

    CardView cd1,cd2,cd4;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_list_renew);
        cd1 = findViewById(R.id.cd1);
        cd2 = findViewById(R.id.cd2);
        cd4 = findViewById(R.id.cd4);
        btn1 = findViewById(R.id.btn1);
        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScheduleListRenew.this,SearchDestinationActivity.class);
                startActivity(intent1);
            }
        });
        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(ScheduleListRenew.this,SearchDestinationActivity.class);
                startActivity(intent2);
            }
        });
        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(ScheduleListRenew.this,ChooseSeatsActivity.class);
                startActivity(intent3);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(ScheduleListRenew.this,BusDetailActivity.class);
                startActivity(intent4);
            }
        });
    }
}