package com.example.viewpangerfragmen.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.viewpangerfragmen.R;
import com.example.viewpangerfragmen.adapter.FragmentPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager vpMain;
    TabLayout tlMain;
    FragmentPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vpMain = findViewById(R.id.vpMain);
        tlMain = findViewById(R.id.tlMain);

        adapter = new FragmentPagerAdapter(getSupportFragmentManager());
        vpMain.setAdapter(adapter);
        tlMain.setupWithViewPager(vpMain);




    }
}
