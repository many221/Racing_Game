package com.UI.CLI;

import com.game.Game_1;
import com.racer.Racer;
import java.util.Scanner;
import static java.lang.System.out;

public abstract class Game_1_CLI {

    public static Scanner input = new Scanner(System.in);
    public static boolean validEntry;



    public static void startGame(){
      out.print ("Hello There!\nAre You Ready To Race?\nY|N: ");
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
        Racer chosenRacer = Racer.lilSisRacer ();
        out.print ("What Would You Like To Do?\n1) Build Your Own Racer\n2) Choose A Prebuilt One?\nSelection: ");
        int ui = input.nextInt ();
        while (!validEntry){
            switch (ui){
                case 1 -> {
                    validEntry =true;

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
                    out.println ("Now Let's View Those Stats!\n" + chosenRacer.toString ());
                }
                case 2 ->{
                    validEntry = true;

                    out.print ("Please Choose A Racer!\n1) Lewis Hamilton And His Mach 5\n2) You And Your Mustang\n3) Your Lil Sister And Her Yaris\nSelection: ");

                    int ui2 = input.nextInt ();

                    switch (ui2){
                        case 1 -> {
                            out.println ("You've Chosen The Race God Himself! VALENTINO ROSSI\nwait hold up that's MotoGP\n You've Chosen LEWIS HAMILTON.");
                            chosenRacer = Racer.godRacer ();
                        }
                        case 2 -> {
                            out.println ("You've Chosen You! How Meta Is That");
                            chosenRacer = Racer.youRacer ();
                        }
                        default -> {
                            out.println ("You've Chosen Your Little Sister! I Wonder How Often That Happens?");
                        }
                    }
                    out.println ("Now Let's View Those Stats!\n" + chosenRacer.toString ());
                }
                default -> {
                    out.println ("Please Enter Valid Entry: 1 or 2");
                    validEntry = false;
                }
            }
        }

        return chosenRacer;
    }

    public static void chooseCourse (){

    }

    public static boolean stopGame(){
        boolean check = false;
        out.print ("Do You Want To Play Again?\nY|N: ");
        String ui = input.next ();
       while (!validEntry){
            switch (ui){
                case "Y","y","Yes","yes" ->{
                    validEntry = true;
                    out.println ("I See Your Ready To Lose Again!");
                    check = true;
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
      return check;
    }


}
