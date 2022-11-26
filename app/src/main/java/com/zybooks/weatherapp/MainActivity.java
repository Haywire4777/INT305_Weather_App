package com.zybooks.weatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button FragmentBtn1, FragmentBtn2, FragmentBtn3, FragmentBtn4, FragmentBtn5, FragmentBtn6, FragmentBtn7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentBtn1 = findViewById(R.id.button_1);
        FragmentBtn2 = findViewById(R.id.button_2);
        FragmentBtn3 = findViewById(R.id.button_3);
        FragmentBtn4 = findViewById(R.id.button_4);
        FragmentBtn5 = findViewById(R.id.button_5);
        FragmentBtn6 = findViewById(R.id.button_6);
        FragmentBtn7 = findViewById(R.id.button_7);

        FragmentBtn1.setOnClickListener(v -> replaceFragment(new fragment1()));

        FragmentBtn2.setOnClickListener(v -> replaceFragment(new fragment2()));

        FragmentBtn3.setOnClickListener(v -> replaceFragment(new fragment3()));

        FragmentBtn4.setOnClickListener(v -> replaceFragment(new fragment4()));

        FragmentBtn5.setOnClickListener(v -> replaceFragment(new fragment5()));

        FragmentBtn6.setOnClickListener(v -> replaceFragment(new fragment6()));

        FragmentBtn7.setOnClickListener(v -> replaceFragment(new fragment7()));
    }


    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();

    }
}