package BehavioralDesignPatterns.StrategyPattern.vehicleExample.vehicles;

import BehavioralDesignPatterns.StrategyPattern.vehicleExample.strategy.SpecialDrive;

public class SportyVehicle extends Vehicle{
    
    public SportyVehicle(){
        super(new SpecialDrive());
    }
}
