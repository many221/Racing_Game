package com.utlities;

import java.util.Scanner;

public abstract class FilterUI {

   private final static Scanner input = new Scanner ( System.in );


   public static String getString(String prompt, boolean required) {

         String ui = null;

      while (true) {

         boolean check = true;
         String test = null;
         do {
            System.out.print ( prompt );
            try {
               ui = input.nextLine ();
               check = false;

            } catch (Exception e) {
               System.out.println ();
            }
         } while (check);

         if(required && ui.length () == 0 ) {
            System.out.println ("Error 1: Must Enter A String!");
            continue;
         }
         break;
      };
      return ui;
   }

   public static int getInt (int min, int max, String prompt){
   int ui = min - 1;

   return ui;
   }
}
