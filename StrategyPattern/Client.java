package StrategyPattern;

import StrategyPattern.vehicles.OffRoadVehicle;
import StrategyPattern.vehicles.PassengerVehicle;
import StrategyPattern.vehicles.SportyVehicle;
import StrategyPattern.vehicles.Vehicle;

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