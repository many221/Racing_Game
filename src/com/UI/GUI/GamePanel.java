package com.UI.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel implements Runnable {

    static final int GAME_WIDTH = 1_000;
    static final int GAME_HEIGHT = (int) (GAME_WIDTH * 0.555);
    static final int ROAD_HEIGHT = 5;
    static final int ROAD_WIDTH = 1_000;
    static final Dimension SCREEN_SIZE = new Dimension (GAME_WIDTH,GAME_HEIGHT);
    Thread gameThread;
    Image image;

     GamePanel(){

    }

    public void newCar(){

    }

    public void paint(Graphics g){

    }

    public void draw(Graphics g){

    }

    public void move(){

    }

    public void checkIfFinished(){

    }

    public class al extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {
            super.keyReleased ( e );
        }
    }
    @Override
    public void run() {

    }
}
