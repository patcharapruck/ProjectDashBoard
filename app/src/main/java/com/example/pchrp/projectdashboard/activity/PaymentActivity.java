package com.example.pchrp.projectdashboard.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.pchrp.projectdashboard.R;
import com.example.pchrp.projectdashboard.fragment.FragmentPay;
import com.example.pchrp.projectdashboard.fragment.FragmentNotPay;

public class PaymentActivity extends AppCompatActivity implements FragmentPay.OnFragmentInteractionListener, FragmentNotPay.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayoutpay);
        tabLayout.addTab(tabLayout.newTab().setText("Pay"));
        tabLayout.addTab(tabLayout.newTab().setText("Not Pay"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        final PagerAdapter adapter = new com.example.pchrp.projectdashboard.util.PagerAdapter(getSupportFragmentManager()
                ,tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
