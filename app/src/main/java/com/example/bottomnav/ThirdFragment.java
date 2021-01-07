package com.example.bottomnav;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class ThirdFragment extends Fragment {

    LinearLayout LayoutContent1,LayoutContent2,LayoutContent3,LayoutContent4,LayoutContent5;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_third, container, false);

        LayoutContent1 = view.findViewById(R.id.content1);
        LayoutContent2 = view.findViewById(R.id.content2);
        LayoutContent3 = view.findViewById(R.id.content3);
        LayoutContent4 = view.findViewById(R.id.content4);
        LayoutContent5 = view.findViewById(R.id.content5);

        LayoutContent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Content1.class);
                startActivity(intent);
            }
        });

        LayoutContent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Content2.class);
                startActivity(intent);
            }
        });

        LayoutContent3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Content3.class);
                startActivity(intent);
            }
        });

        LayoutContent4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Content4.class);
                startActivity(intent);
            }
        });

        LayoutContent5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Content5.class);
                startActivity(intent);
            }
        });



        return view;
    }
}