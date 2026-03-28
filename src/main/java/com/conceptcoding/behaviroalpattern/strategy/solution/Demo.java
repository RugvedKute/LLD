package com.conceptcoding.behaviroalpattern.strategy.solution;

public class Demo {
    static void main() {
        Vehicle sportsCar = new SportsVehicle(new FastDrive());
        sportsCar.drive();

        Vehicle slowSportsCar = new SportsVehicle(new SlowDrive());
        slowSportsCar.drive();
    }
}
