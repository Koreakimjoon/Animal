package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LoginActivity extends AppCompatActivity {

    private TextView LoginText_MyNickname;
    private ImageView LoginImage_profile;
    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private PostActivity postActivity;
    private ShopAcitivity shopAcitivity;
    private WalkActivity walkActivity;
    private HomeActivity homeActivity;
    private ReservationAcitivity reservationAcitivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.action_home:
                        setFrag(0);
                        break;
                    case R.id.action_bone:
                        setFrag(1);
                        break;
                    case R.id.action_clock:
                        setFrag(2);
                        break;
                    case R.id.action_shop:
                        setFrag(3);
                        break;
                    case R.id.action_people:
                        setFrag(4);

                }
                return true;
            }
        });

        homeActivity = new HomeActivity();
        postActivity = new PostActivity();
        shopAcitivity = new ShopAcitivity();
        walkActivity = new WalkActivity();
        reservationAcitivity = new ReservationAcitivity();
        setFrag(0);

        Intent intent = getIntent();

        String nickname = intent.getStringExtra("username");
        String photoUrl = intent.getStringExtra("photoUrl");
        String year = intent.getStringExtra("year");
        String month = intent.getStringExtra("month");
        String day = intent.getStringExtra("day");
        String hour = intent.getStringExtra("hour");
        String minute = intent.getStringExtra("minute");


        Bundle bundle = new Bundle();
        bundle.putString("username",nickname);
        bundle.putString("photoUrl",photoUrl);


         bundle.putString("year",year);
         bundle.putString("month",month);
         bundle.putString("day",day);
         bundle.putString("hour",hour);
         bundle.putString("minute",minute);

         homeActivity.setArguments(bundle);



    }

    private void setFrag(int n){
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n) {
            case 0:
                ft.replace(R.id.main_fram,homeActivity);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_fram,walkActivity);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_fram,reservationAcitivity);
                ft.commit();
                break;
            case 3:
                ft.replace(R.id.main_fram,shopAcitivity);
                ft.commit();
                break;
            case 4:
                ft.replace(R.id.main_fram,postActivity);
                ft.commit();
                break;
        }
    }


}
