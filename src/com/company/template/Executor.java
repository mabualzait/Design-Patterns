package com.company.template;

public class Executor {

    public static void main(String[] args) {
        ComputerTemplate laptop = new Laptop();
        laptop.buildComputer();
        System.out.println("------------------------------");
        ComputerTemplate server = new Server();
        server.buildComputer();
    }

}
