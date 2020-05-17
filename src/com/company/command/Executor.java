package com.company.command;

public class Executor {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Television tv = new Television();
        TurnOnTelevision turnOnTelevision = new TurnOnTelevision(tv);
        TurnOffTelevision turnOffTelevision = new TurnOffTelevision(tv);

        remoteControl.addCommand(0, turnOnTelevision, turnOffTelevision);

        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPressed(0);
    }
}
