package com.UI.GUI;

public class GUI {

    public static void run(){

        GameFrame frame = new GameFrame ();
        frame.getPanel ().run ();
    }

    public static void main(String[] args) {
       // run ();
        System.out.println (System.currentTimeMillis ());
        System.out.println (System.nanoTime ());
    }
}
