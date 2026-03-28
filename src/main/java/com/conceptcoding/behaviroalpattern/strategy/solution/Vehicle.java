package com.conceptcoding.behaviroalpattern.strategy.solution;

public class Vehicle {
    DriveStartegy driveStartegy;

    Vehicle(DriveStartegy driveStartegy) {
        this.driveStartegy = driveStartegy;
    }

    public void drive() {
        System.out.println(this.getClass().getSimpleName());
        driveStartegy.drive();
    }
}
