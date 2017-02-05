package com.zc.account;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().addFlags();
        setContentView(R.layout.activity_start);
        ButterKnife.inject(this);
        //ViewAnimationUtils.createCircularReveal();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
