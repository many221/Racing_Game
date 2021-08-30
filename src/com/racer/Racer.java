package com.racer;

import com.engines.Engine;
import com.engines.IC_Engine;
import com.people.Driver;
import com.vehicles.Car;

public class Racer {

    private static String sisName = "Sis";
    private static String yourName = "You";
    private static int yourAge = 99;
    private static final  Car[] carArr = new Car[]{Car.yaris (),Car.mustang (),Car.mach_5 ()};
    private static final  Engine[] engineArr = new Engine[]{IC_Engine.broom (),IC_Engine.vroom (),IC_Engine.zoom ()};
    private static final  Driver[] driverArr = new Driver[]{Driver.getLilSis ( sisName ),Driver.youDrive(yourName,yourAge),Driver.racingGod ()};


   public final Driver driver;

   public final Car car;

   public final Engine engine;

    public Racer(int driverIndex, int carIndex, int engineIndex) {
        driver = driverArr[driverIndex];
        car = carArr[carIndex];
        engine = engineArr[engineIndex];
        car.addPowaMaker ( engine );
        car.addDriver ( driver );
    }


    //Custom Builds
  public static Racer buildRacer(int driver, int car , int engine){
       Racer customRacer = new Racer (driver,car,engine);
       return  customRacer;
  }

  //PreBuilds
  public static Racer godRacer(){
     Racer godRacer= new Racer (2,2,2);
     return godRacer;
  }

  public static Racer youRacer() {
      Racer youRacer = new Racer ( 1,1,1 );
      return youRacer;
  }

  public static Racer lilSisRacer() {
      Racer lilSisRacer = new Racer ( 0,0,0);
      return lilSisRacer;
  }

    @Override
    public String toString() {
        return "Racer{" + driver + car + engine + "\n}";
    }

    public static void main(String[] args) {
        System.out.println (lilSisRacer ().toString ());
    }
}
