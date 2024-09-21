package BehavioralDesignPatterns.StrategyPattern.vehicleExample.vehicles;

import BehavioralDesignPatterns.StrategyPattern.vehicleExample.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
