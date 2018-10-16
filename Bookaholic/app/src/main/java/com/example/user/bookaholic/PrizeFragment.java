package com.example.user.bookaholic;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrizeFragment extends Fragment {

    public PrizeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_prize, container, false);
        Button set = (Button) v.findViewById(R.id.button8);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        Button set1 = (Button) v.findViewById(R.id.button11);
        set1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        Button set2 = (Button) v.findViewById(R.id.toggleButton);
        set2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        Button set3 = (Button) v.findViewById(R.id.button12);
        set3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        Button set4 = (Button) v.findViewById(R.id.button13);
        set4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        Button set5 = (Button) v.findViewById(R.id.button14);
        set5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        Button set6 = (Button) v.findViewById(R.id.button15);
        set6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        Button set7 = (Button) v.findViewById(R.id.button16);
        set7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        Button set8 = (Button) v.findViewById(R.id.button17);
        set8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });



        return v;
    }

}
