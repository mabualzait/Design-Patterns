package com.company.decorator;

public class Executor {

    public static void main(String[] args) {
        Sandwich basicSandwich = new Beef(new Cheese(new BasicSandwich()));
        System.out.println("Description = " + basicSandwich.getDescription());
        System.out.println("Cost = " + basicSandwich.getCost());
    }
}
