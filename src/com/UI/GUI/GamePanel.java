package com.UI.GUI;
import com.enviroment.FinishLine;
import com.enviroment.Road;
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
    FinishLine end;
    Road roadOne;
    Road roadTwo;
    Thread gameThread;
    Graphics graphics;
    Image image;

     GamePanel(){
         Road roadOne = new Road (ROAD_WIDTH,ROAD_HEIGHT);
         this.setFocusable ( true );
         this.addKeyListener ( new AL());
         this.setPreferredSize ( SCREEN_SIZE );
         gameThread = new Thread (this);
         gameThread.start ();
    }

    public void newCars(){

    }

    public void newRoads(){

    }

    public void paint(Graphics g){
        image = createImage ( getWidth (),getHeight () );
        graphics = image.getGraphics ();
        draw ( graphics );
        g.drawImage ( image,0,0,this );
    }

    public void draw(Graphics g){

    }

    public void move(){

    }

    public void checkIfFinished(){

    }

    public class AL extends KeyAdapter{
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
         //Game Loop
        long lastTime = System.nanoTime ();

        double amountOfTicks =  60.0;
        double ns = 1_000_000_000_000.0 / amountOfTicks;
        double delta = 0;

        boolean wloopCheck = true;

        while (wloopCheck){
            long now = System.nanoTime ();
            delta += (now-lastTime)/ns;
            lastTime = now;
            if (delta >= 1){
                move ();
                checkIfFinished ();
                //repaint ();
                delta --;
                //System.out.println ("test");
            }
        }

    }
}
