package t01;

public class Bus implements Vehicle {
    private String typeName;
    private String color;
    private String fuelType;



    public Bus(String type,String fuelType, String color) {
        this.typeName = type;
        this.fuelType = fuelType;
        this.color = color;

    }

    @Override
    public void start() {
        System.out.println( "Bus "+typeName + " has started");
    }
    @Override
    public void stop() {
        System.out.println("Bus " + typeName + " has stopped");
    }

    @Override
    public void getInfo() {
        System.out.println("Bus information:");
        System.out.println("Type: " + typeName);
        System.out.println("Color: " + color);
        System.out.println("Fuel Type: " + fuelType);



    }
}