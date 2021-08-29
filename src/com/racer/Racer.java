package com.racer;

import com.engines.Engine;
import com.engines.IC_Engine;
import com.people.Driver;
import com.vehicles.Car;

public class Racer {

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
  public Racer buildRacer(Driver driver,Car car,Engine engine){
       Racer customRacer = new Racer ( driver,car,engine);
       return  customRacer;
  }

  //PreBuilds
  public static Racer godRacer(){
     Racer godRacer= new Racer ( Driver.racingGod (),Car.mach_5 (),IC_Engine.zoom () );
     return godRacer;
  }

  public static Racer youRacer() {
      Racer youRacer = new Racer ( Driver.racingGod (), Car.mach_5 (), IC_Engine.zoom () );
      return youRacer;
  }

  public static Racer lilSisRacer() {
      Racer lilSisRacer = new Racer ( Driver.getLilSis ( "Tati" ), Car.yaris (), IC_Engine.broom () );
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
