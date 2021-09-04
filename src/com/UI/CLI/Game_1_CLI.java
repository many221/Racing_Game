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
      String firstPrompt = FilterUI.getString ( "Hello There!\nDo You Want To Race?\nY|N: ",true );
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
        int ui = FilterUI.getInt ( 1,2,"Choose An Option!\n1) Build Your Own Racer\n2) Choose A Prebuilt One?\nSelection: " );
            switch (ui){
                case 1 -> {
                    shortspacing ();
                    int driver = 0;
                    int car = 0;
                    int engine = 0;
                     driver = FilterUI.getInt (1,3,"Welcome To Build~A~Racer!\n Let's Choose A Driver!\n1) Lewis Hamilton\n2) You\n3) Your Lil Sister\nSelection: "  );
                     car = FilterUI.getInt ( 1,3,"Let's Choose A Car!\n1) Mach 5\n2) Mustang\n3) Yaris\nSelection: " );
                     engine = FilterUI.getInt ( 1,3,"Let's Choose An Engine!\n1) B-Engine\n2) V-Engine\n3) Z-Engine\nSelection: " );
                     out.println ("That's A Mighty Fine Build You've Got There.");
                     driver--;car--;engine--;
                     chosenRacer = Racer.buildRacer ( driver,car,engine );

                }
                case 2 ->{
                    shortspacing ();

                    int ui2 = FilterUI.getInt ( 1,3,"Please Choose A Racer!\n1) Lewis Hamilton And His Mach 5\n2) You And Your Mustang\n3) Your Lil Sister And Her Yaris\nSelection: " );
                    input.nextLine ();
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
        input.nextLine ();
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
        String ui = FilterUI.getString ( "To start Enginge Type \"On\"\n!!!RACERS START YOUR ENGINES!!!\nstart: ",true );
        input.nextLine ();
        racer.car.turnOnOff ();

        shortspacing ();
        out.println ("To Accelerate Type \"A\" & To Decelerate Type \"D\"");

        return 0;
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
        String ui = FilterUI.getString ( "Do You Want To Play Again?\nY|N: ",true );
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
