package com.example.android.pharmegic.YogaDietSolutions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.android.pharmegic.MenuScreen;
import com.example.android.pharmegic.PocketYoga.YogaMainActivity;
import com.example.android.pharmegic.R;

public class YogaSolutionsMainActivity extends AppCompatActivity {

    private Button btnWeightloss, btnKnee,btnShoulder,btnBack;
    private LinearLayout llBodyWeight, llknee,llshoulder,llback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_solutions_main);

        btnBack = findViewById(R.id.btnBack);
        btnShoulder = findViewById(R.id.btnShoulder);
        btnWeightloss = findViewById(R.id.btnWeightloss);
        btnKnee = findViewById(R.id.btnKnee);

        llknee = findViewById(R.id.llknee);
        llshoulder = findViewById(R.id.llshoulder);
        llBodyWeight = findViewById(R.id.llBodyWeight);
        llback = findViewById(R.id.llback);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), YogaBackPain.class));
            }
        });

        btnShoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), YogaShoulderPain.class));
            }
        });

        btnKnee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), YogaKneePain.class));
            }
        });

        btnWeightloss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), YogaWeightLoss.class));
            }
        });


        llBodyWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),YogaWeightLoss.class));
            }
        });
        llknee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), YogaKneePain.class));
            }
        });

        llshoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),YogaShoulderPain.class));
            }
        });
        llback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), YogaBackPain.class));
            }
        });
    }
}