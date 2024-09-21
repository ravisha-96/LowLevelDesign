package BehavioralDesignPatterns.CommandPattern.ACExample.command;

import BehavioralDesignPatterns.CommandPattern.ACExample.reciever.AirConditioner;

public class SetTemperatureCommand implements Command{
    
    AirConditioner ac;
    int temp;

    public SetTemperatureCommand(AirConditioner ac, int temp){
        this.ac = ac;
        this.temp = temp;
    }

    @Override
    public void execute(){
        ac.setTemp(temp);
    }
}
