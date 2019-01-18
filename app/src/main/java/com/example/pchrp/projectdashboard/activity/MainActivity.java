package com.example.pchrp.projectdashboard.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pchrp.projectdashboard.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    CardView cv_bill;

    CardView cv_in_bill;

    TextView menutextbill;

    ImageView imgbill;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstances();

    }

    private void initInstances() {
        cv_bill = (CardView)findViewById(R.id.Cv_bill);

        cv_in_bill = (CardView)findViewById(R.id.cv_in_bill);

        menutextbill = (TextView)findViewById(R.id.menutextbill);

        imgbill = (ImageView)findViewById(R.id.imgbill);

        cv_bill.setOnClickListener(this);

        cv_in_bill.setOnClickListener(this);

        menutextbill.setOnClickListener(this);

        imgbill.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v==cv_bill||v==cv_in_bill||v==menutextbill||v==imgbill){

            Intent intent = new Intent(MainActivity.this,BillActivity.class);
            this.startActivity(intent);
            //this.finish();
        }
    }
}
