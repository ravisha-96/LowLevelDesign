package BehavioralDesignPatterns.CommandPattern.ACExample.command;

import BehavioralDesignPatterns.CommandPattern.ACExample.reciever.AirConditioner;

public class SetTemperatureCommand implements Command{
    
    AirConditioner ac;

    public SetTemperatureCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute(int temp){
        ac.setTemp(temp);
    }
}
