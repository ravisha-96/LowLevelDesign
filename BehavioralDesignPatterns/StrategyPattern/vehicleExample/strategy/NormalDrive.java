package BehavioralDesignPatterns.StrategyPattern.vehicleExample.strategy;

public class NormalDrive implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("normal drive");
    }
}