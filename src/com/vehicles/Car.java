package com.vehicles;

import com.engines.IC_Engine;
import com.people.Driver;
import com.units_of_measurements.Units;

public class Car extends Vehicle{

    //Arrays
    static final int[] WEIGHT_CLASSES = new int[]{1_200_000, 1_350_000,1_500_000};
    //Occupant
    private Driver driver;
    //integers
    private int acceleration;
    private int brakingRate;

    //Booleans
    boolean on;

    //Constructor
    public Car(String name, String make, int weightClass, int uom, String carIcon) {
        super ( name, make, uom,carIcon);

        switch (weightClass+1){
            case 1 -> {
                acceleration = 5;
                brakingRate = 3;
                weight = WEIGHT_CLASSES[0];
            }
            case 2 -> {
                acceleration = 4;
                brakingRate = 2;
                weight = WEIGHT_CLASSES[1];
            }
            default-> {
                acceleration = 3;
                brakingRate = 2;
                weight = WEIGHT_CLASSES[2];
            }
        }
    }

    public void addDriver(Driver driver){
        switch (driver.getSkill ()){
            case 0 -> {

                acceleration -= 1;
                brakingRate -=1;

            }
            case 1 ->{
                acceleration += 1;
                brakingRate += 1;
            }
            case 2 -> {
                acceleration += 3;
                brakingRate += 3;

            }
        }this.driver = driver;
    }

    public int getTopVelocity(){
        int topVelocity = (Units.smallMetricUnitToLargeMetricUnit ( weight,1_000 ) + powaMaker.getBuffPonies ())/10;
        return topVelocity;
    }

    public void turnOnOff(){
        on = !on;
        if(hasEngine){
            powaMaker.setOn ( !powaMaker.isOn () );
            if(powaMaker.isOn ())System.out.println (powaMaker.getEngineSound ());
        }
    }

    
    public void gasPedal(){

            int fullSpeed = speedometer + acceleration;
            int lowSpeed = speedometer + 1;
            powaMaker.setUsed ( true );
            if (fullSpeed <= getTopVelocity ()) {
                speedometer += acceleration;
            } else if (lowSpeed <= getTopVelocity ()) {
                speedometer++;
            }

//        speedometer += acceleration;
        odometer += speedometer;
    }

    public void brakePedal(){
        int fullBraking = speedometer - brakingRate;
        int lowBraking = speedometer - 1;
        powaMaker.setUsed ( false );
       if (fullBraking >= 0){
           speedometer -= (fullBraking/brakingRate);
       }else if(lowBraking >= 0){
           speedometer--;
       }
        odometer += speedometer;
    }




    //Testing
    @Override
    public String toString() {
        return "\n|Car: " + ICON +
                " Name:'" + NAME + '\'' +
                ", Make: '" + MAKE + '\'' +
                ", Top Speed: '" + getTopVelocity () + '\'' +
                ", Acceleration: " + acceleration +
                ", Braking: " + brakingRate +
                ", weight:" + weight +" "+weightUnit+
                " |";
    }

//    public static void main(String[] args) {
//        Car mach_5 = new Car ( "Mach 5","Mifune Motors",0,0);
//       mach_5.addDriver ( Driver.getLilSis ( "Tati") );
//        System.out.println (mach_5.toString ());
//
//    }

    //Premade Vehicles
    public static Car mach_5(){return new Car ( "Mach 5","Mifune Motors",1,0,"🏎");}

    public static  Car mustang (){
        return new Car ( "Mustang","Ford",2,0,"🛻" );
    }

    public static  Car yaris (){
        return new Car ( "Yaris","Toyota",0,0,"🚗");
    }

}
