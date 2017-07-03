package com.example.sample.mohamedz2017summer.fragment;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.sample.mohamedz2017summer.MainActivity;
import com.example.sample.mohamedz2017summer.R;
import com.example.sample.mohamedz2017summer.dialog.CustomDialog;
import com.example.sample.mohamedz2017summer.dialog.CustomDialogquiz2;
import com.example.sample.mohamedz2017summer.util.UtilLog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class WorkFragment extends Fragment {
    Button buttons;

    Button quiz2;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UtilLog.d("Fragment","WorkFragment:onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_work, container, false);
        quiz2 = (Button) v.findViewById(R.id.button_quiz2);
        quiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialogquiz2 customDialog = new CustomDialogquiz2(getContext(), new CustomDialog.ICustomDialogListner() {
                    @Override
                    public void onOKClicked(String msg) {
                        Toast.makeText(getContext(),msg,Toast.LENGTH_SHORT).show();
                    }
                });
                customDialog.setCanceledOnTouchOutside(true);
                customDialog.show();
            }
        });

        buttons = (Button) v.findViewById(R.id.Submit_button_id);
        buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"you have clicked a submit button",Toast.LENGTH_SHORT).show();

            }
        });


        return v;
    }

}
