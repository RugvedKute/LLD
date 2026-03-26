package com.conceptcoding.solid.liskovsubstitution.solution;

import com.conceptcoding.solid.liskovsubstitution.problem.Vehicle;

public class Car extends VehicleEngine {

    @Override
    public Integer getNumberOfWheels() {
        return  4;
    }
}
