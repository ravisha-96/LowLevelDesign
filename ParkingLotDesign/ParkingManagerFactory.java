package ParkingLotDesign;

import ParkingLotDesign.parkingSpotManager.FourWheelerParkingSpotManager;
import ParkingLotDesign.parkingSpotManager.ParkingSpotManager;
import ParkingLotDesign.parkingSpotManager.TwoWheelerParkingSpotManager;

public class ParkingManagerFactory {

    public ParkingSpotManager getParkingSpotManager(Vehicle vehicle){
        if(vehicle.vehicleType == VehicleType.BIKE){
            return new TwoWheelerParkingSpotManager();
        }
        if(vehicle.vehicleType == VehicleType.CAR){
            return new FourWheelerParkingSpotManager();
        }

    }
}
