package com.conceptcoding.solid.liskovsubstitution.solution;

import java.util.ArrayList;

public class Demo {

    public static void main() {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());
        vehicleList.add(new MotorCycle());

        for (Vehicle vehicle: vehicleList) {
            System.out.println(vehicle.getNumberOfWheels().toString());
        }
    }
}
