package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.w3c.dom.Text;


public class HomeActivity extends Fragment {

    private View view;
    Button btn_shop, btn_mile, btn_post, btn_profile;
    TextView text_year, text_month, text_day, text_hour, text_minute, home_text_mynickname;
    ImageView home_img_profile;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_home, container, false);



       text_year = (TextView) view.findViewById(R.id.text_year);
       text_month = (TextView) view.findViewById(R.id.text_month);
       text_day = (TextView) view.findViewById(R.id.text_day);
       text_hour = (TextView) view.findViewById(R.id.text_hour);
       text_minute = (TextView) view.findViewById(R.id.text_minute);
       home_text_mynickname = (TextView) view.findViewById(R.id.HomeText_MyNickname);
       home_img_profile = view.findViewById(R.id.HomeImage_profile);


        Bundle bundle = getArguments();
        Bundle userbundle = getArguments();

        String nickName = userbundle.getString("username");
        String photoUrl = userbundle.getString("photoUrl");



        Glide.with(this).load(photoUrl).into(home_img_profile);



        String year = bundle.getString("year");
        String month = bundle.getString("month");
        String day = bundle.getString("day");
        String hour = bundle.getString("hour");
        String minute = bundle.getString("minute");

        home_text_mynickname.setText(nickName);
        text_year.setText(year);
        text_month.setText(month);
        text_day.setText(day);
        text_hour.setText(hour);
        text_minute.setText(minute);






        return view;
    }
}
