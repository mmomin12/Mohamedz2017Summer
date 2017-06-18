package com.example.sample.mohamedz2017summer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityA extends BaseActivity {

    @OnClick(R.id.Button_A)
    public void clickA(View v){
        gotoActivity(ActivityA.class);
    }

    @OnClick(R.id.Button_B)
    public void clickB(View v){
        gotoActivity(ActivityB.class);
    }

    @OnClick(R.id.Button_C)
    public void clickC(View v){
        gotoActivity(ActivityC.class);

    }

    @OnClick(R.id.Button_D)
    public void clickD(View v){
        gotoActivity(ActivityD.class);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        ButterKnife.bind(this);
        showToast("OnCreate");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        showToast("OnNewIntent");
    }
}
