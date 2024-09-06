package t04;

public class Car extends AbstractVehicle {
    public Car(String type, String fuelType, String color) {
        super(type, fuelType, color);
        fuelEfficiency = 5;
    }

    @Override
    public void start() {
        System.out.println("Car " + typeName + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car " + typeName + " is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Car information: " + typeName);
        System.out.println("Color: " + color);
        System.out.println("Fuel type: " + fuelType);

    }

    @Override
    public void charge() {
        System.out.println("Cannot charge car " + typeName);
    }

    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Car " + typeName + " fuel effiency is " + fuelEfficiency + " l/100 km");
    }
}
