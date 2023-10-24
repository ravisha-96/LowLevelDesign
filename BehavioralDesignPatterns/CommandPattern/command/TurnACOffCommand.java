package BehavioralDesignPatterns.CommandPattern.command;

import BehavioralDesignPatterns.CommandPattern.reciever.AirConditioner;

public class TurnACOffCommand implements Command{
    AirConditioner ac;

    public TurnACOffCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute(){
        ac.turnACOff();
        System.out.println();
    }
}
