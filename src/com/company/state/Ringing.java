package com.company.state;

public class Ringing implements MobileAlertState {
    @Override
    public void alert() {
        System.out.println("Mobile is ringing ....");
    }
}
