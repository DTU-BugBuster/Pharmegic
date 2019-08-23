package com.example.android.myapplication.SpaceWars;

import android.graphics.Color;

import java.util.Random;

public class SpaceJunk {
    Random rand = new Random();
    public float cx = (float)Math.random() *1000;
    public float cy = (float)Math.random() *1000;
    float minX = 15.0f;
    float maxX = 70.0f;
    public float r = rand.nextFloat() * (maxX - minX) + minX;
    public int scoreMply = Math.round(maxX / r);

    //Random nice colors
    int rc = rand.nextInt() / 2 + 1;
    int g = rand.nextInt() / 2 + 1;
    int b = rand.nextInt() / 2 + 1;
    public int color = Color.rgb(rc,g,b);

}

