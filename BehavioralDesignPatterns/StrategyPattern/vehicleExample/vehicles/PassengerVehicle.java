package BehavioralDesignPatterns.StrategyPattern.vehicleExample.vehicles;

import BehavioralDesignPatterns.StrategyPattern.vehicleExample.strategy.NormalDrive;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(){
        super(new NormalDrive());
    }
}
