package com.example.zaeem.mohamedz2017summer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class BaseActivity extends AppCompatActivity {

   public void showToast(String s){
      Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
   }
}
