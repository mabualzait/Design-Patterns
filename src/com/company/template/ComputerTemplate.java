package com.company.template;

public abstract class ComputerTemplate {
    public final void buildComputer(){
        collectComponents();
        assembleComponent();
        installOS();
        startComputer();
        System.out.println("Computer is on");
    }

    protected abstract void installOS();

    protected abstract void assembleComponent();

    private void collectComponents() {
        System.out.println("Bring 1 TB Hard drive, 4GB graphics card, 4 usb ports");
    }

    private void startComputer() {
        System.out.println("System is powering up");
    }


}
