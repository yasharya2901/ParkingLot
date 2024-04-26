package org.example.models;


import java.util.Date;

public class Ticket {
    private int id;
    private String userId;
    private VechileType vechileType;
    private String Time;
    private Date entryTime;
    private Gate generatedAt;
    private Operator generatedBy;
    private Spot parkingSpot;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public VechileType getVechileType() {
        return vechileType;
    }

    public void setVechileType(VechileType vechileType) {
        this.vechileType = vechileType;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(Gate generatedAt) {
        this.generatedAt = generatedAt;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

    public Spot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(Spot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
