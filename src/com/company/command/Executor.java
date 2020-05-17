package com.company.command;

public class Executor {
    public static final int TV_SLOT = 0;

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Television tv = new Television();
        TurnOnTelevision turnOnTelevision = new TurnOnTelevision(tv);
        TurnOffTelevision turnOffTelevision = new TurnOffTelevision(tv);

        remoteControl.addCommand(TV_SLOT, turnOnTelevision, turnOffTelevision);

        remoteControl.onButtonPressed(TV_SLOT);
        remoteControl.offButtonPressed(TV_SLOT);
    }
}
