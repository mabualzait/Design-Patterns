package com.company.template;

public class Laptop extends ComputerTemplate {
    @Override
    protected void installOS() {
        System.out.println("Installing Windows 10");
    }

    @Override
    protected void assembleComponent() {
        System.out.println("Adding HDMI port, laptop fan, laptop body and mouse pad");
    }
}
