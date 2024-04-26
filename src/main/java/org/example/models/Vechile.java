package org.example.models;

public class Vechile {
    private int id;
    private String noPlate;
    private VechileType type;

    public Vechile(int id, String noPlate, VechileType type) {
        this.id = id;
        this.noPlate = noPlate;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoPlate() {
        return noPlate;
    }

    public void setNoPlate(String noPlate) {
        this.noPlate = noPlate;
    }

    public VechileType getType() {
        return type;
    }

    public void setType(VechileType type) {
        this.type = type;
    }
}
