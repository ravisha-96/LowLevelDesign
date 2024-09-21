package BehavioralDesignPatterns.CommandPattern.ACExample.command;

import BehavioralDesignPatterns.CommandPattern.ACExample.reciever.AirConditioner;

public class TurnACOnCommand implements Command{
    AirConditioner ac;

    public TurnACOnCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute(){
        ac.turnACOn();
    }
}
