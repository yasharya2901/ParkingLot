package org.example.models;

public class Spot {
    private int id;
    private String name;
    private SpotStatus status;
    private SpotType type;
    private Floor floor;

    public Spot(int id, String name, SpotStatus status, SpotType type, Floor floor) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.type = type;
        this.floor = floor;
    }

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

    public SpotStatus getStatus() {
        return status;
    }

    public void setStatus(SpotStatus status) {
        this.status = status;
    }

    public SpotType getType() {
        return type;
    }

    public void setType(SpotType type) {
        this.type = type;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}
