package com.example.android.pharmegic.PocketYoga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.android.pharmegic.R;
import com.example.android.pharmegic.YogaDietSolutions.YogaSolutionsMainActivity;

public class YogaMainActivity extends AppCompatActivity {
    private ImageView leaderboard, monitor, accCheck,yoga ;
    private LinearLayout llProgress, llLeaderboard, llPractise, llYogaSolutions;
    private Button btnPractise, btnLeaderboard, btnProgress, btnYogaSolutions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_main);

        leaderboard = findViewById(R.id.button);
        monitor = findViewById(R.id.bt_monitor);
        accCheck = findViewById(R.id.bt_acc);

        llPractise = findViewById(R.id.llPractise);
        llLeaderboard = findViewById(R.id.llLeaderboard);
        llProgress = findViewById(R.id.llProgress);
        llYogaSolutions = findViewById(R.id.llYogaSolutions);

        btnPractise = findViewById(R.id.btnPractise);
        btnLeaderboard = findViewById(R.id.btnLeaderboard);
        btnProgress = findViewById(R.id.btnProgress);
        btnYogaSolutions = findViewById(R.id.btnYogaSolutions);

        btnProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getBaseContext(), MonitorAct.class));
            }
        });

        btnLeaderboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), LeaderBoardActivity.class));
            }
        });


        btnPractise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), ChooseYogaActivity.class));
            }
        });

        btnYogaSolutions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), YogaSolutionsMainActivity.class));
            }
        });

        llProgress.setOnClickListener(view  -> {
            startActivity(new Intent(this, MonitorAct.class));
        });

        llLeaderboard.setOnClickListener(someview -> {
            Intent i = new Intent(this, LeaderBoardActivity.class);
            startActivity(i);

        });
        llPractise.setOnClickListener(view2 -> {
            startActivity(new Intent(this, ChooseYogaActivity.class));
        });

        llYogaSolutions.setOnClickListener(view2 -> {
            startActivity(new Intent(this, YogaSolutionsMainActivity.class));
        });

    }
}
