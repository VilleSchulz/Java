package t02;

import t01.Vehicle;

abstract class AbstractVehicle implements Vehicle {
    public String color;
    public String typeName;
    public   String fuelType;
    public AbstractVehicle(String type, String fuelType, String color) {
        this.color = color;
        this.fuelType=fuelType;
        this.typeName = type;
    }
}
