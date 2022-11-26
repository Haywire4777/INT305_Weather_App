package com.zybooks.weatherapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


public class fragment6 extends Fragment {
    //Button backBtn;
    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment6, container, false);
        //backBtn = findViewById(R.id.frag1_btn);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getFragmentManager().beginTransaction().remove(fragment6.this).commitAllowingStateLoss();
            }
        });
        return view;
    }
}