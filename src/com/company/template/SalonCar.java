package com.company.template;

public class SalonCar extends VehicleTemplate {
    @Override
    protected void installGearBox() {
        System.out.println("Installing 4 shifts gear box");
    }

    @Override
    protected void assembleComponent() {
        System.out.println("Adding mirrors, windows and join parts in car body");
    }
}
