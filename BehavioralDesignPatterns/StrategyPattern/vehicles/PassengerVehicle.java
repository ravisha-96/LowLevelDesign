package BehavioralDesignPatterns.StrategyPattern.vehicles;

import BehavioralDesignPatterns.StrategyPattern.strategy.NormalDrive;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(){
        super(new NormalDrive());
    }
}
