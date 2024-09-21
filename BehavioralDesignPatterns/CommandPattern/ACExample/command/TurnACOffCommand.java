package BehavioralDesignPatterns.CommandPattern.ACExample.command;

import BehavioralDesignPatterns.CommandPattern.ACExample.reciever.AirConditioner;

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
