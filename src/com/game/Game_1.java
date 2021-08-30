package com.game;

import com.UI.CLI.Game_1_CLI;
import com.racer.Racer;

public class Game_1 {

    //Strings
    public final String GAME_NAME = "Racing Game";

    public final String GAME_RULES = "Cross The Finish Line!";

    //Booleans
    private static boolean isRunning;


    //Intergers
    private int tickCount;

    //Racers
    private static Racer playerOne;
    private Racer playerTwo;

    public Game_1() {

    }

    public static void run(){
        isRunning = true;

        while (isRunning){

            playerOne = Game_1_CLI.chooseRacer ();

            playerOne.car.turnOnOff ();
            isRunning = Game_1_CLI.stopGame ();
        }
    }



    //Getters & Setters
    private void setRunning(boolean running) {
        isRunning = running;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public int getTickCount() {
        return tickCount;
    }



}
