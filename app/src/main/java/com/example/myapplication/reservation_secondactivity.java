package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class reservation_secondactivity extends AppCompatActivity{

    LinearLayout btn_num1, btn_num2, btn_num3, btn_num4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_secondactivity);

        btn_num1 = (LinearLayout)findViewById(R.id.btn_num1);
        btn_num2 = (LinearLayout)findViewById(R.id.btn_num2);
        btn_num3 = (LinearLayout)findViewById(R.id.btn_num3);
        btn_num4 = (LinearLayout)findViewById(R.id.btn_num4);

        btn_num1.setClickable(true);
        btn_num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reservation_secondactivity.this, reservation_one.class);
                startActivity(intent);
            }
        });
        btn_num2.setClickable(true);
        btn_num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reservation_secondactivity.this, reservation_two.class);
                startActivity(intent);
            }
        });
        btn_num3.setClickable(true);
        btn_num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reservation_secondactivity.this, reservation_three.class);
                startActivity(intent);
            }
        });
        btn_num4.setClickable(true);
        btn_num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reservation_secondactivity.this, reservation_four.class);
                startActivity(intent);
            }
        });



    }
}