package BehavioralDesignPatterns.CommandPattern.command;

import BehavioralDesignPatterns.CommandPattern.reciever.AirConditioner;

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
