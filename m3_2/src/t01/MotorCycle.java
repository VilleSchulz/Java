package t01;

public class MotorCycle implements Vehicle {
    private String typeName;
    private int topSpeed;
    private int tankSize;
    private int engineSize;

    public MotorCycle(String typeName, int topSpeed, int tankSize, int engineSize) {
        this.typeName = typeName;
        this.topSpeed = topSpeed;
        this.tankSize = tankSize;
        this.engineSize = engineSize;

    }
    @Override
    public void start(){
        System.out.println("Motorcycle " + typeName + " is running.");
    }
    public void stop(){
        System.out.println("Motorcycle " + typeName + " is stopped.");
    }
    public void getInfo(){

    }
}