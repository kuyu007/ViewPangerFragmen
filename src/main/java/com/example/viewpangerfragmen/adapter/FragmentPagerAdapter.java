package com.example.viewpangerfragmen.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.viewpangerfragmen.fragment.FMobil;
import com.example.viewpangerfragmen.fragment.FMotor;
import com.example.viewpangerfragmen.fragment.FPesawat;

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {
    public FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FMobil();
            case 1:
                return new FMotor();
            case 2:
                return new FPesawat();
            default:
                return new FMobil();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Mobil";
            case 1:
                return "Motor";
            case 2:
                return "Pesawat";
            default:
                return "Mobil";
        }
    }
}

