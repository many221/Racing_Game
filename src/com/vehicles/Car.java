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
    private int currentSpeed = 0;
    private int xVelocity;
    private int brakingRate;

    //Booleans
    boolean on;

    //Constructor
    public Car(String name, String make, int weightClass, int uom) {
        super ( name, make, uom );

        switch (weightClass+1){
            case 1 -> {
                xVelocity = 5;
                brakingRate = 3;
                weight = WEIGHT_CLASSES[0];
            }
            case 2 -> {
                xVelocity = 4;
                brakingRate = 2;
                weight = WEIGHT_CLASSES[1];
            }
            default-> {
                xVelocity = 3;
                brakingRate = 2;
                weight = WEIGHT_CLASSES[2];
            }
        }
    }

    public void addDriver(Driver driver){
        switch (driver.getSkill ()+1){
            case 1 -> {
                this.driver = driver;
                xVelocity -= 1;
                brakingRate -=1;

            }
            case 3 -> {
                this.driver = driver;
                xVelocity += 1;
                brakingRate += 1;

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
        if(on) {
            int fullSpeed = currentSpeed + xVelocity;
            int lowSpeed = currentSpeed + 1;
            powaMaker.setUsed ( true );
            if (fullSpeed <= getTopVelocity ()) {
                currentSpeed += xVelocity;
            } else if (lowSpeed <= getTopVelocity ()) {
                currentSpeed++;
            }
        }
    }

    public void brakePedal(){
        int fullBraking = currentSpeed - brakingRate;
        int lowBraking = currentSpeed - 1;
        powaMaker.setUsed ( false );
       if (fullBraking >= 0){
           currentSpeed -= brakingRate;
       }else if(lowBraking >= 0){
           currentSpeed--;
       }
    }


    //Testing
    @Override
    public String toString() {
        return "\n|Car:" +
                " Name:'" + NAME + '\'' +
                ", Make: '" + MAKE + '\'' +
                ", Acceleration: " + xVelocity +
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
    public static Car mach_5(){
        Car mach_5 = new Car ( "Mach 5","Mifune Motors",1,0);
        return mach_5;
    }

    public static  Car mustang (){
        Car mustang = new Car ( "Mustang","Ford",2,0 );
        return mustang;
    }

    public static  Car yaris (){
        Car yaris = new Car ( "Yaris","Toyota",0,0);
        return yaris;
    }

}
