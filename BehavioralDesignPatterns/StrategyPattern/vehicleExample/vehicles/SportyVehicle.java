package BehavioralDesignPatterns.StrategyPattern.vehicles;

import BehavioralDesignPatterns.StrategyPattern.strategy.SpecialDrive;

public class SportyVehicle extends Vehicle{
    
    public SportyVehicle(){
        super(new SpecialDrive());
    }
}
