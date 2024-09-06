package t04;

public class ElectricMotorCycle extends AbstractVehicle {
    public ElectricMotorCycle(String type, String fuelType, String color) {
        super(type, fuelType, color);
        fuelEfficiency = 50;

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
    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Electirc motorcycle " + typeName + " fuel effiency is " + fuelEfficiency + " kWh/100km");
    }
}

