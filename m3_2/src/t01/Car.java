package t01;

public class Car implements Vehicle {
    private String typeName;
    private int topSpeed;
    private int tankSize;

    public Car(String typeName, int topSpeed, int tankSize){
        this.typeName = typeName;
        this.topSpeed = topSpeed;
        this.tankSize = tankSize;


    }
    @Override
    public void start(){
        System.out.println("Car " +typeName+" has started");
    }
    public void stop(){
        System.out.println("Car "+typeName+" has stopped");
    }


    public void getInfo() {

    }
}
