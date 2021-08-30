package com.enviroment;

import java.awt.*;

public class Road extends Rectangle {

    //Road stuff for GUI
    static int GAME_WIDTH;
    static int GAME_HEIGHT;

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

}
