package com.example.pchrp.projectdashboard.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.pchrp.projectdashboard.fragment.FragmentPay;
import com.example.pchrp.projectdashboard.fragment.FragmentNotPay;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mOfTabs;

    public  PagerAdapter(FragmentManager fm,int numberTabs){
        super(fm);
        this.mOfTabs = numberTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){

            case 0:
                FragmentPay Pay = new FragmentPay();
                return Pay;
            case 1:
                FragmentNotPay NotPay = new FragmentNotPay();
                return NotPay;
                default:
                    return null;

        }
    }

    @Override
    public int getCount() {
        return mOfTabs;
    }
}
