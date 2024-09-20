package BehavioralDesignPatterns.StrategyPattern.vehicles;

import BehavioralDesignPatterns.StrategyPattern.strategy.SpecialDrive;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new SpecialDrive());
    }
}
