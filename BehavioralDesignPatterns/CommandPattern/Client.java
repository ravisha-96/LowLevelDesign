package BehavioralDesignPatterns.CommandPattern;

import java.rmi.Remote;

import BehavioralDesignPatterns.CommandPattern.command.TurnACOffCommand;
import BehavioralDesignPatterns.CommandPattern.command.TurnACOnCommand;
import BehavioralDesignPatterns.CommandPattern.invoker.RemoteControl;
import BehavioralDesignPatterns.CommandPattern.reciever.AirConditioner;

public class Client {
    public static void main(String[] args) {
        //Reciever
        AirConditioner airConditioner = new AirConditioner();
        //Invoker
        RemoteControl turnOffButton = new RemoteControl();
        turnOffButton.setCommand(new TurnACOffCommand(airConditioner));
        

        RemoteControl turnOnButton = new RemoteControl();
        turnOnButton.setCommand(new TurnACOnCommand(airConditioner));
        
        // remoteControl.setCommand(new TurnACOnCommand(airConditioner));

        turnOffButton.pressButton();
        turnOnButton.pressButton();
        turnOffButton.pressButton();
        turnOnButton.pressButton();
        turnOnButton.pressButton();
    }
}
