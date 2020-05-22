package com.company.template;

public abstract class VehicleTemplate {

    public final void buildCar(){
        collectComponents();
        assembleComponent();
        installGearBox();
        startCar();
        System.out.println("Vehicle is on");
    }

    protected abstract void installGearBox();

    protected abstract void assembleComponent();

    private void collectComponents() {
        System.out.println("Bring Rear and Front Lights, Tires, Chairs");
    }

    private void startCar() {
        System.out.println("Engine is powering up");
    }


}
