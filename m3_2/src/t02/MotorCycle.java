package t02;

public class MotorCycle extends AbstractVehicle {
    public MotorCycle(String type, String fuelType, String color ) {
        super(type,fuelType,color);

    }
    @Override
    public void start(){
        System.out.println("Motorcycle " + typeName + " is starting...");
    }
    @Override
    public void stop(){
        System.out.println("Motorcycle " + typeName + " is stopping...");
    }
    @Override
    public void getInfo(){
        System.out.println("Motorcycle information:");
        System.out.println("Type: " + typeName);
        System.out.println("Color: " + color);
        System.out.println("Fuel type: " + fuelType);
    }
}