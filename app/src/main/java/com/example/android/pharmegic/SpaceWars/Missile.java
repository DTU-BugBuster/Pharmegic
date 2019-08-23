package com.example.android.myapplication.SpaceWars;

public class Missile {
    //Missile vars
    public int mx = 0;
    public int my = 0;
    public int mr = 0;
    int mv = 10;
    public int w = 0; //width
    public int h = 0; //height
    public boolean destroyME = false;

    public Direction warpDr = Direction.NONE;

    public enum Direction {
        NORTH, SOUTH, EAST, WEST, NONE;
    }

    public void lightSpeed(){
        switch(warpDr){
            case SOUTH:
                my += mv;
                if (my + mr > h){warpDr = Direction.NONE; destroyME=true;}
                break;
            case NORTH:
                my -= mv;
                if (my < mr){warpDr = Direction.NONE; destroyME=true;}
                break;
            case EAST:
                mx += mv;
                if (mx + mr > w){warpDr = Direction.NONE; destroyME=true;}
                break;
            case WEST:
                mx -= mv;
                if (mx < mr){warpDr = Direction.NONE; destroyME=true;}
                break;
        }
    }
}





