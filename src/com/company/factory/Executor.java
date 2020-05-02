package com.company.factory;

public class Executor {
    public static void main(String[] args) {

        Sandwich sandwich = SandwichFactory.createSandwich(SandwichFactory.CHEESE_BURGER);
        sandwich.makeUp();
    }
}
