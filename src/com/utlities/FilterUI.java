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
      int option = min - 1;
      do {
         System.out.print(prompt);
         String ui = input.nextLine();
         try{
            option = Integer.parseInt(ui);
         } catch (NumberFormatException err) {
            System.out.println("Please Enter A Number! ");
         } catch (Exception err) {
            System.out.println("General Error!");
         }
      } while (option < min || option > max);

      return option;
   }

   public static boolean getBoolean(String prompt){
      boolean check = false;

     String ui = getString ( "True Or False? ", true );
      do {

         if(ui.matches ( "^[Tt][Rr][Uu][Ee]$")){
            check = true;
         }else check = false;

     } while(!ui.matches ( "^([Tt][Rr][Uu][Ee]|[Ff][Aa][Ll][Ss][Ee])$") );

      return check;
   }


}
