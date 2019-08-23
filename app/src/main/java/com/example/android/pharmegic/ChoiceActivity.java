package com.example.android.pharmegic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.android.pharmegic.PocketYoga.YogaMainActivity;

public class ChoiceActivity extends AppCompatActivity {

    private Button btnMind, btnPhysical;
    private LinearLayout llMental, llPhysical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        btnMind = findViewById(R.id.btnMind);
        btnPhysical = findViewById(R.id.btnPhysical);
        llMental = findViewById(R.id.llMental);
        llPhysical = findViewById(R.id.llPhysical);

        btnMind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),MenuScreen.class));
            }
        });

        btnPhysical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), YogaMainActivity.class));
            }
        });


        llMental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(),MenuScreen.class));
            }
        });
        llPhysical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), YogaMainActivity.class));
            }
        });
    }
}
