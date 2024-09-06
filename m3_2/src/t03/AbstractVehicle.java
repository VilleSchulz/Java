package t03;

import t01.Vehicle;

abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    public String color;
    public String typeName;
    public   String fuelType;
    public AbstractVehicle(String type, String fuelType, String color) {
        this.color = color;
        this.fuelType=fuelType;
        this.typeName = type;
    }
    public void charge(){
        System.out.println("chargin batteries");
    }
}
