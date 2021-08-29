package com.units_of_measurements;

public abstract class Units {

    //Metric Units
    public static final String[][] METRIC_UNITS = {
            {"Grams","Kilograms"},//Mass 0
            {"Millilitres","Litres"},//Volume 1
            {"Millimetres","Centimetres","Metres","Kilometres"},//Length
            {"Celsius"}//Temp
    };
    //Imperial Units
    public static final String[] IMPERIAL_WEIGHT = {"Ounces","Pounds","Tons"};
    public static final String[] IMPERIAL_VOLUME = {"Fluid Ounces","Cup","Pint","Quart","Gallon"};
    public static final String[] IMPERIAL_LENGTH = {"Inches","Feet","Yards","Miles"};
    public static final String[] IMPERIAL_TEMP = {"Fahrenheit"};



    //Metric Conversion
    public static int smallMetricUnitToLargeMetricUnit(int num, int base){
        int output;
         output = num/base;
        return output;
    }

    //More Conversions to be added later


}
