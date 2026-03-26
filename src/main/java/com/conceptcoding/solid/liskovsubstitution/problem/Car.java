package com.conceptcoding.solid.liskovsubstitution.problem;

public class Car extends Vehicle{

    @Override
    public Integer getNumberOfWheels() {
        return  4;
    }
}
