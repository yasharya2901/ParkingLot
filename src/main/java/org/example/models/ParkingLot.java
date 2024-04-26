package org.example.models;

import java.util.List;

public class ParkingLot {
    private int id;
    private List<Floor> floors;
    private  List<Gate> parkingGates;
    private ParkingLotStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getParkingGates() {
        return parkingGates;
    }

    public void setParkingGates(List<Gate> parkingGates) {
        this.parkingGates = parkingGates;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }
}
