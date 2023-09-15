package StrategyPattern.vehicles;

import StrategyPattern.strategy.SpecialDrive;

public class SportyVehicle extends Vehicle{
    
    public SportyVehicle(){
        super(new SpecialDrive());
    }
}
