package com.vehicles;

import com.engines.Engine;
import com.units_of_measurements.Units;

public abstract class Vehicle {

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
     */

    //Strings
    public final String NAME;
    public final String MAKE;
    public final static String[][] UoM = Units.METRIC_UNITS;
    private String weightUnit;
    //Engine
    private Engine powaMaker;

    //Integers
    private int weight;
    private int topSpeed;

    //Booleans


    public Vehicle(String name, String make, int weight,int uom) {
        NAME = name;
        MAKE = make;
        this.weight = weight;
        weightUnit = UoM[0][uom];

    }

    public void addPowaMaker(Engine newEngine) {
        powaMaker = newEngine;
    }



}
