package com.example.sample.mohamedz2017summer;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class RadioGroupActivity extends BaseActivity {

    private  int checkedID;

    @BindView(R.id.Activity_Radio_group)
    RadioGroup radioGroup;

    @OnClick(R.id.activty_Radio_bt)
    public void submit(View view){
        showToast("You chose RadioButton"+ checkedID);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);
        ButterKnife.bind(this);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                checkedID=checkedId;
            }
        });
    }
}
