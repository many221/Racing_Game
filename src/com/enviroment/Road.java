package com.enviroment;

import java.awt.*;

public class Road extends Rectangle {

    //Road stuff for GUI
    static int GAME_WIDTH;
    static int GAME_HEIGHT;

    //CLI Stuff
    private int end;

    public Road(int width, int height){
        GAME_WIDTH = width;
        GAME_HEIGHT = height;
    }
    public void draw(Graphics g){

    }

    //Road stuff for CLI
    private int roadLength;

    public Road(int length){
        roadLength = length;
    }

    public int getRoadLength() {
        return roadLength;
    }

    public FinishLine getGoalSpot(){
         end = roadLength - (roadLength/20);
        return new FinishLine (end);
    }

    public int getGoal() {
        return end;
    }

    //Premade Roads
    public static Road shortRoad(){
        return new Road ( 40 );
    }

    public static Road mediumRoad(){
        return new Road ( 60 );
    }
    public static  Road longRoad(){
        return new Road ( 80 );
    }

}
