package com.example.pchrp.projectdashboard.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.pchrp.projectdashboard.R;
import com.example.pchrp.projectdashboard.fragment.Fragmentmain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.mainframe, Fragmentmain.newInstance())
                    .commit();

        }
    }
}
