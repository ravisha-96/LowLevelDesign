package ParkingLotDesign.parkingSpotManager;

import java.util.List;

import ParkingLotDesign.parkingSpot.ParkingSpot;

public class TwoWheelerParkingSpotManager implements ParkingSpotManager{
    private List<ParkingSpot> twoWheelerParkingSpot; 
    @Override
    public void addParkingSpace(ParkingSpot parkingSpot){
        twoWheelerParkingSpot.add(parkingSpot);
    }

    @Override
    public void findParkingSpace(){

    }

    @Override
    public void removeParkingSpace(){

    }

    @Override
    public void parkVehicle(){

    }

    @Override
    public void removeVehicle(){

    }
}
