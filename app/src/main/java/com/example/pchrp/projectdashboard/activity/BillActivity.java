package com.example.pchrp.projectdashboard.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.pchrp.projectdashboard.R;
import com.example.pchrp.projectdashboard.fragment.FragmentBill;

public class BillActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame_bill, FragmentBill.newInstance())
                    .commit();
        }

    }
}
