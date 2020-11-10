package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener;

import java.util.ArrayList;
import java.util.List;

public class ShopAcitivity extends Fragment {

    private ViewPagerAdapter fragmentPagerAdapter;
    private View view;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_shop_acitivity, container, false);

        final ViewPager viewPager = view.findViewById(R.id.viewpager);
        final TabLayout tabLayout = view.findViewById(R.id.tab_layout);

        tabLayout.setupWithViewPager(viewPager);

        fragmentPagerAdapter = new ViewPagerAdapter(getChildFragmentManager()); //Acitivity 에서는 getSupportFragmentManger()사용 / fragment안에서 사용할경우 getchildfragmentManger를 사용하면됨.

        viewPager.setAdapter(fragmentPagerAdapter);



        return view;
    }
}