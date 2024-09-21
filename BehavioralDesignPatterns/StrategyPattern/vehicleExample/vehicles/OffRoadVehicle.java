package BehavioralDesignPatterns.StrategyPattern.vehicleExample.vehicles;

import BehavioralDesignPatterns.StrategyPattern.vehicleExample.strategy.SpecialDrive;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new SpecialDrive());
    }
}
