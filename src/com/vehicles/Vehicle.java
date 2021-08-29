package com.vehicles;

import com.engines.Engine;
import com.units_of_measurements.Units;

import java.awt.*;
import java.awt.event.KeyEvent;

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
    protected String weightUnit;
    //Engine
    protected Engine powaMaker;

    //Integers
    protected int weight;



    //Constructor
    public Vehicle(String name, String make, int uom, Engine engine) {
        NAME = name;
        MAKE = make;
        powaMaker = engine;
        weightUnit = UoM[0][uom];
    }

    public void addPowaMaker(Engine newEngine) {powaMaker = newEngine;
    }


    //GUI Stuff
    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

    public void setYDirection(int yDirection){

    }

    public void move(){

    }

    public void draw(Graphics g){

    }


}
