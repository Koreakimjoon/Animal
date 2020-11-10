package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ReservationAcitivity extends Fragment {

    private Button btn_seoul, btn_gyeonggi, btn_gangwon, btn_chungbuk, btn_gyeongbuk,  btn_chungnam, btn_gyeongnam, btn_jeollabuk, btn_jeollanam;


    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_reservation_acitivity,container,false);

        btn_seoul = (Button) view.findViewById(R.id.btn_seoul);
        btn_gyeonggi = (Button) view.findViewById(R.id.btn_gyeonggi);
        btn_gangwon = (Button) view.findViewById(R.id.btn_gangwon);
        btn_chungbuk = (Button) view.findViewById(R.id.btn_chungbuk);
        btn_gyeongbuk = (Button) view.findViewById(R.id.btn_gyeongbuk);
        btn_chungnam = (Button) view.findViewById(R.id.btn_chungnam);
        btn_gyeongnam = (Button) view.findViewById(R.id.btn_gyeongnam);
        btn_jeollabuk = (Button) view.findViewById(R.id.btn_jeollabuk);
        btn_jeollanam = (Button) view.findViewById(R.id.btn_jeollanam);

        btn_seoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), reservation_secondactivity.class);
                startActivity(intent);
            }
        });



        return view;
    }
}
