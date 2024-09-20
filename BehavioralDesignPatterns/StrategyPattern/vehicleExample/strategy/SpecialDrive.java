package BehavioralDesignPatterns.StrategyPattern.strategy;

public class SpecialDrive implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("special drive");
    }
}
