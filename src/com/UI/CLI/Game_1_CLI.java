package com.UI.CLI;

import com.enviroment.Course;
import com.game.Game_1;
import com.racer.Racer;
import com.utlities.FilterUI;

import java.util.Scanner;
import static java.lang.System.out;

public abstract class Game_1_CLI {

    public static Scanner input = new Scanner(System.in);
    public static boolean validEntry;



    public static void startGame(){
      out.print ("Hello There!\nDo You Want To Race?\nY|N: ");
      String firstPrompt = input.nextLine ();
     while (!validEntry){
      switch (firstPrompt){
          case "Y","y","Yes","yes" ->{
              Game_1.run ();
              validEntry = true;
          }
          case "N","n","No","no" ->{
              out.println ("See Ya Later Slowpoke!");
              validEntry = true;
          }
          default -> {
              out.println ("Please Enter Valid Entry");
              validEntry = false;
          }
      }
     }
    }

    //For Two Player System
    public static int playerCount(){
        int pcount = 0;
        out.println ();
        return pcount;
    }

    public static Racer chooseRacer (){
        Racer chosenRacer = null;
        out.print ("Choose An Option!\n1) Build Your Own Racer\n2) Choose A Prebuilt One?\nSelection: ");
        int ui = input.nextInt ();
            switch (ui){
                case 1 -> {
                    shortspacing ();
                    int driver;
                    int car;
                    int engine;

                    out.print ("Welcome To Build~A~Racer!\n Let's Choose A Driver!\n1) Lewis Hamilton\n2) You\n3) Your Lil Sister\nSelection: ");
                     driver = input.nextInt ();
                     input.nextLine ();
                    out.print ("Let's Choose A Car!\n1) Mach 5\n2) Mustang\n3) Yaris\nSelection: ");
                    car = input.nextInt ();
                    input.nextLine ();
                    out.print ("Let's Choose An Engine!\n1) B-Engine\n2) V-Engine\n3) Z-Engine\nSelection: ");
                    engine = input.nextInt ();
                    input.nextLine ();
                    out.println ("That's A Mighty Fine Build You've Got There.");
                    driver--;car--;engine--;
                    chosenRacer = Racer.buildRacer ( driver,car,engine );

                }
                case 2 ->{
                    shortspacing ();
                    out.print ("Please Choose A Racer!\n1) Lewis Hamilton And His Mach 5\n2) You And Your Mustang\n3) Your Lil Sister And Her Yaris\nSelection: ");

                    int ui2 = input.nextInt ();
                    shortspacing ();

                    switch (ui2){
                        case 1 -> {
                            out.println ("You've Chosen The Race God Himself! VALENTINO ROSSI\nwait hold up that's MotoGP You've Chosen LEWIS HAMILTON.");
                            chosenRacer = Racer.godRacer ();
                        }
                        case 2 -> {
                            out.println ("You've Chosen You! How Meta Is That");
                            chosenRacer = Racer.youRacer ();
                        }
                        default -> {
                            out.println ("You've Chosen Your Little Sister! I Wonder How Often That Happens?");
                            chosenRacer = Racer.lilSisRacer ();
                        }
                    }

                }
                default -> {
                    out.println ("Please Enter Valid Entry: 1 or 2");
                }
            }
        shortspacing ();
        out.println ("Now Let's See Those Stats!\n\n" + chosenRacer.toString ());
        return chosenRacer;
    }

    public static Course chooseCourse (){
        Course chosenCourse;
        out.print ("Alrighty Then Let's Choose A Course\n1) Short Course\n2) Medium Course \n3) Long Course\nSelection: ");
        int ui = input.nextInt ();
        switch (ui){
            case 1 ->{
                out.println ("You Have Chosen The Short Course Which is " + Course.smallCourse ().ROAD.getRoadLength () + "Km Long");
                chosenCourse = Course.smallCourse ();
            }
            case 3 -> {
                out.println ("You Have Chosen The Long Course "  + Course.longCourse ().ROAD.getRoadLength () + "Km Long");
                chosenCourse = Course.longCourse ();
            }
            default -> {
                out.println ( "You Have Chosen The Medium Course "  + Course.medCourse ().ROAD.getRoadLength () + "Km Long" );
                chosenCourse = Course.medCourse ();
            }
        }
        return chosenCourse;
    }

    public static int startEngines(Racer racer){
        out.print ("To start Enginge Type \"On\"\n!!!RACERS START YOUR ENGINES!!!\nstart: ");
        String ui = input.nextLine ();
        input.nextLine ();
        racer.car.turnOnOff ();

        shortspacing ();
        out.println ("To Accelerate Type \"A\" & To Decelerate Type \"D\"");
        int odometerReset = 0;
        return odometerReset;
    }

    public static int gasOrBrake(Racer racer, Course course){
        Game_1_CLI_Graphics graphics;
        graphics = new Game_1_CLI_Graphics (racer, course);
  //      Game_1_CLI_Graphics.getGraphics (racer.car.getOdometer ());
        String ui = FilterUI.getString ( "Gas Or Brake: ", true );
        switch (ui){
            case "A","a" ->{
                Game_1_CLI_Graphics.getGraphics (racer.car.getOdometer ());
                racer.car.gasPedal ();
                out.println (racer.car.getPowaMaker ().getEngineSound () + " Speedometer: "+ racer.car.getSpeedometer ());
            }
            case "D","d" ->{
               Game_1_CLI_Graphics.getGraphics (racer.car.getOdometer ());
                out.println ("~Braking Sound~"  + " Speedometer: "+ racer.car.getSpeedometer ());
            }
            default -> {
                Game_1_CLI_Graphics.getGraphics (racer.car.getOdometer ());
                out.println ("Car Will Just Coast"  + " Speedometer: "+ racer.car.getSpeedometer ());
                racer.car.coast ();
            }
        }
        return racer.car.getOdometer ();
    }

    public static void racing(){
        out.println ("Congratulations!!! \nYou Have Finished The Race In " +  Game_1.getTickCount () + " Ticks");
    }



    public static boolean stopGame(){
        out.print ("Do You Want To Play Again?\nY|N: ");
        String ui = input.next ();
            switch (ui){
                case "Y","y","Yes","yes" ->{
                    out.println ("I See Your Ready To Lose Again!");
                    return true;
                }
                default -> {
                    out.println ("See Ya Later Slowpoke!");
                    return false;
                }
            }

    }

    public static void shortspacing(){
        out.println ( "\u25C3 \u25A3 \u25B9 \u25C3 \u25A3 \u25B9 \u25C3 \u25A3 \u25B9 \u25C3  \u25A3 \u25B9 \u25C3 \u25A3 \u25B9");
    }

    public static void longSpacing(){
        for (int i = 0; i < 2; i++) {
            out.println ( "\u25C3 \u25A3 \u25B9 \u25C3 \u25A3 \u25B9 \u25C3 \u25A3 \u25B9 \u25C3  \u25A3 \u25B9 \u25C3 \u25A3 \u25B9");
        }
    }
}
