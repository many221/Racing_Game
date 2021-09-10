package com.UI.CLI;

import com.enviroment.Course;
import com.racer.Racer;

import java.util.ArrayList;
import java.util.Arrays;

public class Game_1_CLI_Graphics {

    private static StringBuilder car;
    private static final String checkeredFlag = "🏁";
    private static final String whoosh = "💨";
    private static int trackLength;
    private static int goal;
    private static String[] test2;

    //reduce frame for movements
    //5 spaces per frame           g
//            System.out.println (
//                    "   -           __\n" +
//                            " --          ~( @\\   \\\n" +
//                            "---   _________]_[__/_>________\n" +
//                            "     /  ____ \\ <>     |  ____  \\\n" +
//                            "    =\\_/ __ \\_\\_______|_/ __ \\__D\n" +
//                            "________(__)_____________(__)____"
//            );      Thread.sleep ( 1000 );
//            for (int j = 0; j <3; j++) {
//                System.out.println (" ");
//            }
//            System.out.println (
//                "                                    -           __\n" +
//                        "                                  --          ~( @\\   \\\n" +
//                        "                                 ---   _________]_[__/_>________\n" +
//                        "                                      /  ____ \\ <>     |  ____  \\\n" +
//                        "                                     =\\_/ __ \\_\\_______|_/ __ \\__D\n" +
//                        "                                 ________(__)_____________(__)____"
//            );  Thread.sleep ( 1000 );
//            for (int j = 0; j <3; j++) {
//                System.out.println (" ");
//            }
//            System.out.println (
//                "                                                                     -           __\n" +
//                        "                                                                   --          ~( @\\   \\\n" +
//                        "                                                                  ---   _________]_[__/_>________\n" +
//                        "                                                                       /  ____ \\ <>     |  ____  \\\n" +
//                        "                                                                      =\\_/ __ \\_\\_______|_/ __ \\__D\n" +
//                        "                                                                  ________(__)_____________(__)____"
//            );

//        StringBuilder racecar =  new StringBuilder ("\\ō͡≡o˞\"̶");
//        StringBuilder racecarMoving =  new StringBuilder (" \\ō͡≡o˞\"̶");
//        String push = "ε=";
//        String finishline = "!==";
//        for (int i = 0; i < 5; i++) {
//            System.out.println (racecarMoving);
//            if (i == 4) break;
//            racecarMoving.insert(0,push);
//        }
//        //Testing Holding Position
//        System.out.println ("New Position");
//        for (int i = 0; i < 5; i++) {
//            System.out.println (racecarMoving);
//            racecarMoving.insert(0,push);
//
//        }
//        String[] raceGraphics = new String[81];
//        for (int i = 0; i < raceGraphics.length ; i++) {
////           try {
////               raceGraphics[i + 1] = "✅";
////           } catch (ArrayIndexOutOfBoundsException aiobe){
////               break;
////           }
////           raceGraphics[i] = "🅱️";
//
//            if(i % 2 == 0){
//                raceGraphics[i] = ("" + i);
//            }else raceGraphics[i] = "💨";
//        }
//        String s = "";
    // StringBuilder s = new StringBuilder ("");
//        for (String i:
//             raceGraphics) {
//            s.append ( raceGraphics);
//        }
    //  raceGraphics;
//        for (int i = 0; i < raceGraphics.length; i++) {
//            s += raceGraphics[i];
//        }
    // System.out.println (s);


    public Game_1_CLI_Graphics(Racer racer, Course course) {
        car = new StringBuilder ( racer.car.ICON );
        trackLength = course.ROAD.getRoadLength ();
        goal = ( trackLength - course.ROAD.getGoal ());
    }


    public static void getGraphics(int moves){

        int amountToMove = trackLength - moves;

        if(amountToMove <= 1 ){amountToMove
         = 2; }
        test2 = new String[trackLength];


        for (int i = 0; i < trackLength; i++) {

            test2[i] = " ";
            if(i >= amountToMove )test2[i] = whoosh;
            if (i == goal - 1)test2[i] = checkeredFlag;


        }

        test2[amountToMove -1 ] = car.toString ();

        StringBuilder image = new StringBuilder ();

        for (String i : test2) {
            image.append (i);
        }
         String finishedImage = image.toString ();

        System.out.println (finishedImage);

    }
}
