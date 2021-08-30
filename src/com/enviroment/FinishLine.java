package com.enviroment;

import com.racer.Racer;

import java.awt.*;
import java.util.ArrayList;

public class FinishLine extends Rectangle {

    //GUI Stuff
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int timer;

    FinishLine(){
    }

    public void draw(Graphics g){
    }

    public void checkIfCrossed(){
    }

    //X-------------------------------------

    //CLI Stuff
    private int finishLine;
    private ArrayList<Racer> podiumList = new ArrayList<Racer> ();

    FinishLine(int goal){
        finishLine = goal;
    }

    public void getWhoCrossed(Racer place){
        podiumList.add ( place );
    }
}
