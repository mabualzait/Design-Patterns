package com.company.decorator;

public class SandwichDecorator implements Sandwich {

    private Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public double getCost() {
        return this.sandwich.getCost();
    }

    @Override
    public String getDescription() {
        return this.sandwich.getDescription();
    }
}
