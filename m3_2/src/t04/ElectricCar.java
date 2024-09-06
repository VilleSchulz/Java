package t04;

public class ElectricCar extends AbstractVehicle {
    public ElectricCar(String type, String fuelType, String color) {
        super(type, fuelType, color);
        fuelEfficiency = 100;

    }
    @Override
    public void start () {
        System.out.println("Electric car " + typeName + " is starting...");
    }
    @Override
    public void stop () {
        System.out.println("Electric car  " + typeName + " is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Electric car information:");
        System.out.println("Type: " + typeName);
        System.out.println("Color: " + color);
        System.out.println("Fuel Type: " + fuelType);


    }
    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Electirc car " + typeName + " fuel effiency is " + fuelEfficiency + " kWh/100km");
    }

}
