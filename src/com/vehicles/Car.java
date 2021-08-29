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
    private int xVelocity = (Units.smallMetricUnitToLargeMetricUnit ( weight,1_000 ) + powaMaker.getBuffPonies ())/100;

    //Constructor
    public Car(String name, String make, int weightClass, int uom, Engine engine) {
        super ( name, make, uom, engine );
        weight = WEIGHT_CLASSES[weightClass];
    }


    public void addDriver(Driver driver){
        this.driver = driver;
    }





    //Testing
    @Override
    public String toString() {
        return "Car{" +
                "driver=" + driver +
                ", NAME='" + NAME + '\'' +
                ", Speed='" + xVelocity + '\'' +
                ", MAKE='" + MAKE + '\'' +
                ", weightUnit='" + weightUnit + '\'' +
                ", powaMaker=" + powaMaker +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Car mach_5 = new Car ( "Mach 5","Mifune Motors",1_709_000,0,IC_Engine.zoom ());
       // mach_5.addPowaMaker ( IC_Engine.zoom () );
        System.out.println (mach_5.toString ());

    }


}
