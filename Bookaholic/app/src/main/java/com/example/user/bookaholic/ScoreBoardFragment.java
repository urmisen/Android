package com.example.user.bookaholic;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class ScoreBoardFragment extends Fragment {


    public ScoreBoardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        SharedPreferences mypref = this.getActivity().getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore",0);
        View v  =inflater.inflate(R.layout.fragment_score_board, container, false);
        TextView tv = (TextView) v.findViewById(R.id.textHighScore);
        tv.setText("highscore" + "");
        return  v;

    }

}
