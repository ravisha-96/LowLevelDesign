package ParkingLotDesign.parkingSpotManager;

import ParkingLotDesign.parkingSpot.ParkingSpot;
import java.util.List;

public interface ParkingSpotManager {

    public List<ParkingSpot> parkingSpots = null;

    public void addParkingSpace(ParkingSpot parkingSpot);
    public void findParkingSpace();
    public void removeParkingSpace(ParkingSpot parkingSpot);
    public void parkVehicle();
    public void removeVehicle();

}
