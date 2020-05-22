package com.company.state;

public class Silent implements MobileAlertState {
    @Override
    public void alert() {
        System.out.println("Mobile is in silent state");
    }
}
