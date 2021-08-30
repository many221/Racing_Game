package com.engines;

public class IC_Engine extends Engine{

    //Integers
    private final int BOOST = 100;
    private int turboCount = 0;
    //Booleans
    private boolean hasTurbo = false;
    //Strings
    private String speedLEVEL;

    //Constructor
    public IC_Engine(String NAME, String sound, int speedLevel) {
        super ( NAME, sound );

           switch (speedLevel){

               case 1 -> {
                   speedLEVEL = SPEED_CHART[speedLevel];
                   buffPonies = 600;
               }
               case 2 -> {
                   speedLEVEL = SPEED_CHART[speedLevel];
                   buffPonies = 900;
               }
               default -> {
                   speedLEVEL = SPEED_CHART[speedLevel];
                   buffPonies = 200;
               }
           }
    }


    // Turbo Stuff
    public void turboIt(){
        hasTurbo = true;
        turboCount += 1;
        buffPonies += BOOST;
        engineSound += " stututu";
    }

    public void removeTurbo(){
        String output;
        if(turboCount < 1){
            output = "Trying To Remove SomeThing That's Not There \uD83E\uDD14 Even Einstein Can't Do That";
        } else{
            int poniesAdded = turboCount*BOOST;
            buffPonies -= poniesAdded;
            engineSound.replace ( "stututu"," " );
            output = "Happy Engine Noises";
        }
        System.out.println (output);
    }

    //getters
    public int getBuffPonies() {
        return buffPonies;
    }

    public String getSpeedLEVEL() {
        return speedLEVEL;
    }

    @Override
    public String toString() {
        return "\n|Engine: "+ NAME +
                ", buffPonies:" + buffPonies +
                ", turboCount: " + turboCount +
                ", speedLEVEL='" + speedLEVEL + '\'' +
                " |";
    }

    //Testings
//    public static void main(String[] args) {
//        IC_Engine bEngine = new IC_Engine ( "B-Engine","Broom Broom",0 );
//
//
//
//    }

    //Premade Engines
    public static IC_Engine broom(){
        IC_Engine bEngine = new IC_Engine ( "B-Engine","Broom Broom",0 );
        return bEngine;
    }
    public static IC_Engine vroom(){
        IC_Engine vEngine = new IC_Engine ( "V-Engine","Vroom Vroom",1 );
        return vEngine;
    }

    public static IC_Engine zoom(){
        IC_Engine zEngine = new IC_Engine ( "Z-Engine","Zoom Zoom",2 );
        return zEngine;
    }


}
