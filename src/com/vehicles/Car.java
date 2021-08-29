package com.vehicles;

import com.engines.Engine;
import com.engines.IC_Engine;
import com.people.Driver;
import com.units_of_measurements.Units;

public class Car extends Vehicle{

    //Arrays
    static final int[] WEIGHT_CLASSES = new int[]{1_200_000, 1_350_000,1_500_000};
    //Occupant
    private Driver driver;
    //integers
    private int xVelocity;
    private int brakingRate;

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

    //Testing
    @Override
    public String toString() {
        return "Car{" +
                "driver=" + driver +
                ", xVelocity=" + xVelocity +
                ", brakingRate=" + brakingRate +
                ", NAME='" + NAME + '\'' +
                ", MAKE='" + MAKE + '\'' +
                ", weightUnit='" + weightUnit + '\'' +
                ", powaMaker=" + powaMaker +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Car mach_5 = new Car ( "Mach 5","Mifune Motors",0,0);
       mach_5.addDriver ( Driver.getLilSis ( "Tati") );
        System.out.println (mach_5.toString ());

    }

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
