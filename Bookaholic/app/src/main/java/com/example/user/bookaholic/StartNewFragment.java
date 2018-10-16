package com.example.user.bookaholic;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class StartNewFragment extends Fragment {


    public StartNewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_start_new, container, false);
        Button science = (Button) view.findViewById(R.id.button15);
        Button health = (Button) view.findViewById(R.id.button17);
        Button comic = (Button) view.findViewById(R.id.button13);
        Button history = (Button) view.findViewById(R.id.button14);


        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ScienceActivity.class);
                i.putExtra("some", "some data");
                startActivity(i);
            }

        });
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), HealthActivity.class);
                i.putExtra("some", "some data");
                startActivity(i);
            }

        });
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ComicActivity.class);
                i.putExtra("some", "some data");
                startActivity(i);
            }

        });
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ComicActivity.class);
                i.putExtra("some", "some data");
                startActivity(i);
            }

        });
        return view;

    }
}