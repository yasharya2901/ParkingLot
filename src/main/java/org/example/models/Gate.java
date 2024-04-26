package org.example.models;

public class Gate {
    private int id;
    private String gateName;
    private String gateType;
    private Floor floorNo;
    private Operator operator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGateName() {
        return gateName;
    }

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }

    public String getGateType() {
        return gateType;
    }

    public void setGateType(String gateType) {
        this.gateType = gateType;
    }

    public Floor getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(Floor floorNo) {
        this.floorNo = floorNo;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
