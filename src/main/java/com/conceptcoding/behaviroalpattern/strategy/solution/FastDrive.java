package com.conceptcoding.behaviroalpattern.strategy.solution;

public class FastDrive implements DriveStartegy{

    @Override
    public void drive() {
        System.out.println("This is fast drive");
    }
}
