package com.company.state;

public class Executor {
    public static void main(String[] args) {
        MobileContext context = new MobileContext();
        context.alert();
        context.setState(new Silent());
        context.alert();
    }
}
