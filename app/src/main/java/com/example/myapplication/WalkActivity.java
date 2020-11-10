package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import com.bumptech.glide.request.target.CustomTarget;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class WalkActivity extends Fragment {


    private View view;
    private Button btn_start, btn_stop, btn_end;
    private Chronometer chronometer;
    private TextView text_time,whenDate; //날짜 월일출력
    private SimpleDateFormat mFormat = new SimpleDateFormat("M/d");

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_walk,container,false);

        Button btn_start = (Button) view.findViewById(R.id.btn_start);
        Button btn_stop = (Button) view.findViewById(R.id.btn_stop);
        Button btn_end = (Button) view.findViewById(R.id.btn_end);
        whenDate = (TextView) view.findViewById(R.id.whenDate);
        chronometer = (Chronometer) view.findViewById(R.id.chronometer);

        Date date = new Date();
        String time = mFormat.format(date);
        whenDate.setText(time);

        btn_start.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                chronometer.start();
            }
        });

        btn_stop.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                chronometer.stop();
            }
        });

        btn_end.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                chronometer.setBase(SystemClock.elapsedRealtime());
            }
        });


        return view;
    }

}
