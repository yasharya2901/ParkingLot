package org.example.models;

import java.util.List;

public class Floor {
    private int id;
    private String name;
    private List<Spot> FloorSpots ;
    private FloorStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Spot> getFloorSpots() {
        return FloorSpots;
    }

    public void setFloorSpots(List<Spot> floorSpots) {
        FloorSpots = floorSpots;
    }

    public FloorStatus getStatus() {
        return status;
    }

    public void setStatus(FloorStatus status) {
        this.status = status;
    }


}
