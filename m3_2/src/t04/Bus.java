package t04;

public class Bus extends AbstractVehicle {

    public Bus(String type, String fuelType, String color) {
        super(type, fuelType, color);
        fuelEfficiency = 10;


    }

    @Override
    public void start() {
        System.out.println("Bus " + typeName + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus " + typeName + " is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Bus information:");
        System.out.println("Type: " + typeName);
        System.out.println("Color: " + color);
        System.out.println("Fuel Type: " + fuelType);


    }

    @Override
    public void charge() {
        System.out.println("Cannot charge bus " + typeName);
    }

    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Bus " + typeName + " fuel effiency is " + fuelEfficiency + " l/100 km");
    }
}