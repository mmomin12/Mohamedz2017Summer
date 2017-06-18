package com.example.sample.mohamedz2017summer;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sample.mohamedz2017summer.adapter.AdvanceListViewAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdvanceListViewActivity extends BaseActivity {

    @BindView(R.id.activity_Advance_listview)
    ListView lv;


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

        TextView tv = new TextView(this);
        tv.setText("HeaderView");
        tv.setTextSize(50);
        lv.addHeaderView(tv);

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

    }
}
