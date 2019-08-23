package com.example.android.pharmegic.PocketYoga.linechart;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.pharmegic.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChartsFragment extends Fragment {


    public ChartsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.charts, container, false);


        (new LineCardOne((CardView) layout.findViewById(R.id.card1), getContext())).init();

        return layout;
    }

}
