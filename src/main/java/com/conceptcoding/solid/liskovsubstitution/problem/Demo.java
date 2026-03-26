package com.conceptcoding.solid.liskovsubstitution.problem;

import java.util.ArrayList;

public class Demo {
    static void main() {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new Car());
        vehicleList.add(new MotorCycle());
        vehicleList.add((new Bicycle()));

        for (Vehicle vehicle: vehicleList) {
            System.out.println(vehicle.hasEngine().toString());  // This will throw null exception error
        }

    }
}
