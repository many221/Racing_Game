package com.racer;

import com.engines.Engine;
import com.engines.IC_Engine;
import com.people.Driver;
import com.vehicles.Car;

public class Racer {

    private String sisName;
    private String yourName;
    private int yourAge;
   public Car[] carArr = new Car[]{Car.yaris (),Car.mustang (),Car.mach_5 ()};
   public Engine[] engineArr = new Engine[]{IC_Engine.broom (),IC_Engine.vroom (),IC_Engine.zoom ()};
   public Driver[] driverArr = new Driver[]{Driver.getLilSis ( sisName ),Driver.youDrive(yourName,yourAge),Driver.racingGod ()};

   private int ID;
   private Driver driver;

   private Car car;

   private Engine engine;

   public Racer(Driver driver, Car car, Engine engine) {
        this.driver = driver;
        this.car = car;
        this.engine = engine;
        this.car.addPowaMaker ( engine );
        this.car.addDriver ( driver );

   }

   //Custom Builds
  public Racer buildRacer(int driver, int car , int engine){
       Racer customRacer = new Racer ( driverArr[driver],carArr[car],engineArr[engine]);
       return  customRacer;
  }

  //PreBuilds
  public static Racer godRacer(){
     Racer godRacer= new Racer ( Driver.racingGod (),Car.mach_5 (),IC_Engine.zoom () );
     return godRacer;
  }

  public static Racer youRacer() {
      Racer youRacer = new Racer ( Driver.youDrive ( "You", 99), Car.mach_5 (), IC_Engine.zoom () );
      return youRacer;
  }

  public static Racer lilSisRacer() {
      Racer lilSisRacer = new Racer ( Driver.getLilSis ("Sis" ), Car.yaris (), IC_Engine.broom () );
      return lilSisRacer;
  }

    @Override
    public String toString() {
        return "Racer{" +
                "driver=" + driver.NAME +
                ", car=" + car +
                ", engine=" + engine +
                '}';
    }

    public static void main(String[] args) {
        System.out.println (lilSisRacer ().toString ());
    }
}
