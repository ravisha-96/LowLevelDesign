package BehavioralDesignPatterns.StrategyPattern;

import BehavioralDesignPatterns.StrategyPattern.vehicles.OffRoadVehicle;
import BehavioralDesignPatterns.StrategyPattern.vehicles.PassengerVehicle;
import BehavioralDesignPatterns.StrategyPattern.vehicles.SportyVehicle;
import BehavioralDesignPatterns.StrategyPattern.vehicles.Vehicle;

public class Client{
    public static void main(String[] args){
        System.out.println("what ti shtis");
        Vehicle sportyVehicle = new SportyVehicle();
        sportyVehicle.drive();
        Vehicle passsengerVehicle = new PassengerVehicle();
        passsengerVehicle.drive();
        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
    }
}