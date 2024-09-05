package t01;

public class MotorCycle implements Vehicle {
    private String typeName;
    private String color;
    private String fuelType;

    public MotorCycle(String type,String fuelType, String color ) {
        this.typeName = type;
        this.fuelType = fuelType;
        this.color = color;

    }
    @Override
    public void start(){
        System.out.println("Motorcycle " + typeName + " has started");
    }
    @Override
    public void stop(){
        System.out.println("Motorcycle " + typeName + " is stopped.");
    }
    @Override
    public void getInfo(){
        System.out.println("Motorcycle information:");
        System.out.println("Type: " + typeName);
        System.out.println("Color: " + color);
        System.out.println("Fuel type: " + fuelType);
    }
}