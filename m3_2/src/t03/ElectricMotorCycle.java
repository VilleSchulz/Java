package t03;

public class ElectricMotorCycle extends AbstractVehicle {
    public ElectricMotorCycle(String type, String fuelType, String color) {
        super(type, fuelType, color);

    }
    @Override
    public void start () {
        System.out.println("Electric motorcycle " + typeName + " is starting...");
    }
    @Override
    public void stop () {
        System.out.println("Electric motorcycle  " + typeName + " is stopping...");
    }


    @Override
    public void getInfo() {
        System.out.println("Electric Motorcycle information:");
        System.out.println("Type: " + typeName);
        System.out.println("Color: " + color);
        System.out.println("Fuel Type: " + fuelType);


    }
}

