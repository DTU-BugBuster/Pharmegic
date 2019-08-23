package com.example.android.pharmegic.PocketYoga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.android.pharmegic.PocketYoga.linechart.ChartsFragment;
import com.example.android.pharmegic.PocketYoga.linechart.SandboxFragment;
import com.example.android.pharmegic.R;

public class MonitorAct extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    private android.support.v4.app.Fragment mCurrFragment;

    private int currSpinnerSelection = 0;

    private ArrayAdapter<CharSequence> mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitor);

        mAdapter = ArrayAdapter.createFromResource(this, R.array.spinner_options,
                android.R.layout.simple_spinner_item);
        mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        switch (currSpinnerSelection) {
            case 0:
                mCurrFragment = new ChartsFragment();
                break;
            case 1:
                mCurrFragment = new SandboxFragment();
                break;
        }

        getSupportFragmentManager().beginTransaction().add(R.id.container, mCurrFragment).commit();
    }


    public void onMenuClick(View view) {

        ((SandboxFragment) mCurrFragment).onMenuClick(view);
    }


    public void onPlay(View view) {

        ((SandboxFragment) mCurrFragment).onPlay(view);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if (position != currSpinnerSelection) {
            switch (position) {
                case 0:
                    mCurrFragment = new ChartsFragment();
                    break;
                case 1:
                    mCurrFragment = new SandboxFragment();
                    break;
                default:
                    break;
            }
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, mCurrFragment)
                    .commit();
            currSpinnerSelection = position;
        }
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

}
