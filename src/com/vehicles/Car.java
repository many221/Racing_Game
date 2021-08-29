package com.vehicles;

import com.engines.IC_Engine;
import com.people.Driver;

public class Car extends Vehicle{

    /*
        public static final String[][] METRIC_UNITS = {
                {"Grams","Kilograms"},//Mass 0
                    0       1
                {"Millilitres","Litres"},//Volume 1
                    0             1
                {"Millimetres","Centimetres","Metres","Kilometres"}, //Length 2
                    0              1            2            3
                {"Celsius"}//Temp 3
                    0
     ;*/

    private Driver driver;


    public Car(String name, String make, int weight, int uom) {
        super ( name, make, weight, uom );
    }

    public static void main(String[] args) {
        Car mach_5 = new Car ( "Mach 5","Mifune Motors",1_709_000,0);
        mach_5.addPowaMaker ( IC_Engine.zoom () );
    }


}
