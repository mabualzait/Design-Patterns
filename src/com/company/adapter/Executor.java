package com.company.adapter;

public class Executor {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new BicycleAdapter(new Bicycle());
        useVehicle(car);
        useVehicle(bike);
    }

    private static void useVehicle(Vehicle car) {
        car.accelerate();
        car.pushBreak();
        car.soundHorn();
        System.out.println();
    }
}
