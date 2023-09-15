package StrategyPattern.vehicles;

import StrategyPattern.strategy.NormalDrive;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(){
        super(new NormalDrive());
    }
}
