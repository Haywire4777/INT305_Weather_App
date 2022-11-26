package com.zybooks.weatherapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class fragment1 extends Fragment {
    //Button backBtn;
    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        //backBtn = findViewById(R.id.frag1_btn);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getFragmentManager().beginTransaction().remove(fragment1.this).commitAllowingStateLoss();
            }
        });
        return view;
    }
}