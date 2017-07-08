package com.example.sample.mohamedz2017summer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sample.mohamedz2017summer.adapter.AdvanceListViewAdapter;
import com.example.sample.mohamedz2017summer.adapter.BaseViewPagerAdapter;
import com.example.sample.mohamedz2017summer.fragment.BlueFragment;
import com.example.sample.mohamedz2017summer.fragment.GreenFragment;
import com.example.sample.mohamedz2017summer.fragment.RedFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdvanceListViewActivity extends BaseActivity {

    @BindView(R.id.activity_Advance_listview)
    ListView lv;

    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_list_view);
        ButterKnife.bind(this);
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello, How Are You?");
        list.add("I am fine");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");

        AdvanceListViewAdapter adapter = new AdvanceListViewAdapter(this, list);
        lv.setAdapter(adapter);



        TextView tv1 = new TextView(this);
        tv1.setText("FooterView");
        tv1.setTextSize(50);
        lv.addFooterView(tv1);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showToast(String.valueOf(position));
            }
        });

        ViewPager viewPager = (ViewPager) getLayoutInflater().inflate(
                R.layout.viewpager_layout2, null);
        ArrayList<Fragment> listfrag = new ArrayList<Fragment>();

        listfrag.add(new RedFragment());
        listfrag.add(new GreenFragment());
        listfrag.add(new BlueFragment());

        viewPager.setLayoutParams(new ListView.LayoutParams(
                ListView.LayoutParams.MATCH_PARENT, 500));

        BaseViewPagerAdapter pager = new BaseViewPagerAdapter(getSupportFragmentManager(),listfrag);
        viewPager.setAdapter(pager);
        lv.addHeaderView(viewPager);


    }
}
