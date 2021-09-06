package com.game;

import com.UI.CLI.Game_1_CLI;
import com.enviroment.Course;
import com.racer.Racer;

public class Game_1 {

    //Strings
    public final String GAME_NAME = "Racing Game";
    public final String GAME_RULES = "Cross The Finish Line!";


    //Intergers
    private static int tickCount;
    private static int playerOneOdometer;

    //Course
    private static Course course;

    //Racers
    private static Racer playerOne;
    private static Racer playerTwo;

    //Booleans
    private static boolean isRunning = false;



    public static void run(){

        do {
            Game_1_CLI.longSpacing ();
            playerOne = null;
            playerOne = Game_1_CLI.chooseRacer ();
            Game_1_CLI.longSpacing ();
            course = Game_1_CLI.chooseCourse ();
            Game_1_CLI.longSpacing ();
            playerOneOdometer = Game_1_CLI.startEngines ( playerOne );
            Game_1_CLI.longSpacing ();
            tickCount = 0;
//               boolean endOfRoad = playerOneOdometer == course.ROAD.getRoadLength ();
//               boolean passedGoal =
//               boolean hasFinished  = playerOneOdometer <= course.ROAD.getGoal ();
            int i = 0;
           do {
                playerOneOdometer = Game_1_CLI.gasOrBrake ( playerOne, course );
                System.out.println ( "Tick: " + tickCount + "| Odometer: " + playerOneOdometer + "| Course Length " + course.ROAD.getRoadLength () + "| Finish Line: " + course.ROAD.getGoal () + "| Distance Left Till Finish: " + ( course.ROAD.getRoadLength () - playerOneOdometer ) );
                //if statement here to
                tickCount++;
                i = playerOneOdometer;
            } while (i < course.ROAD.getRoadLength ());
            ;


            Game_1_CLI.longSpacing ();
            Game_1_CLI.racing ();
            Game_1_CLI.longSpacing ();
            isRunning = Game_1_CLI.stopGame ();
        } while ( isRunning);

    }

    //Getters & Setters

    public static int getTickCount() {
        return tickCount;
    }



}
