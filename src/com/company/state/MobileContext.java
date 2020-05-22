package com.company.state;

public class MobileContext {
    private  MobileAlertState currentState;

    public MobileContext(){
        //default state
        currentState = new Ringing();
    }
    public void setState(MobileAlertState state){
        currentState = state;
    }
    public void alert(){
        currentState.alert();
    }
}
