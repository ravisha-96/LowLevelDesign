package BehavioralDesignPatterns.CommandPattern.command;

import BehavioralDesignPatterns.CommandPattern.reciever.AirConditioner;

public class SetTemperatorueCommand implements Command{
    
    AirConditioner ac;

    public SetTemperatorueCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void executeSetTemp(int temp){
        ac.setTemp(temp);
    }
}
