package com.example.zaeem.mohamedz2017summer.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.zaeem.mohamedz2017summer.LaunchModeActivity;
import com.example.zaeem.mohamedz2017summer.R;
import com.example.zaeem.mohamedz2017summer.adapter.ListNormalAdapter;
import com.example.zaeem.mohamedz2017summer.viewPagerActivity;

import java.util.ArrayList;

public class DemoFragment extends Fragment {

    private final ArrayList<String> contentList;
    private ListView listView;
    private final Context context;

    public DemoFragment() {
        context = getContext();
        contentList = new ArrayList<String>();
        contentList.add("ViewPager");
        contentList.add("ImageScaleType");
        contentList.add("9Patch");
        contentList.add("A");
        contentList.add("B");
        contentList.add("C");
        contentList.add("LaunchMode");
        contentList.add("E");
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        listView = (ListView) view.findViewById(R.id.fragment_demo_lv);
        ListNormalAdapter adapter = new ListNormalAdapter(this.getContext(),contentList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), viewPagerActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        Intent intent1 = new Intent(getActivity(), LaunchModeActivity.class);
                        startActivity(intent1);
                    default:
                }
            }
        });



        return view;
    }

}

