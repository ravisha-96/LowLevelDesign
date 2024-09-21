package BehavioralDesignPatterns.StrategyPattern.vehicleExample;

import BehavioralDesignPatterns.StrategyPattern.vehicleExample.vehicles.OffRoadVehicle;
import BehavioralDesignPatterns.StrategyPattern.vehicleExample.vehicles.PassengerVehicle;
import BehavioralDesignPatterns.StrategyPattern.vehicleExample.vehicles.SportyVehicle;
import BehavioralDesignPatterns.StrategyPattern.vehicleExample.vehicles.Vehicle;

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