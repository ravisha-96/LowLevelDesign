package BehavioralDesignPatterns.CommandPattern.ACExample;


import BehavioralDesignPatterns.CommandPattern.ACExample.command.TurnACOffCommand;
import BehavioralDesignPatterns.CommandPattern.ACExample.command.TurnACOnCommand;
import BehavioralDesignPatterns.CommandPattern.ACExample.reciever.AirConditioner;
import BehavioralDesignPatterns.CommandPattern.ACExample.invoker.RemoteControl;

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
