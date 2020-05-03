package com.company.decorator;

public class Beef extends SandwichDecorator {
    public Beef(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Beef";
    }
}
