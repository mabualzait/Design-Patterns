package com.company.template;

public class Server extends ComputerTemplate {
    @Override
    protected void installOS() {
        System.out.println("Installing Ubuntu 14.0");
    }

    @Override
    protected void assembleComponent() {
        System.out.println("Add extra 5 TB , 0 HDMI , Server Holder, Routing system, external mouse and keyboard");
    }
}
