package StrategyPattern.vehicles;

import StrategyPattern.strategy.SpecialDrive;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new SpecialDrive());
    }
}
