package t01;

public class Bus implements Vehicle {
    private final String typeName;
    private int passengers;
    private int capacity;
    private int topSpeed;
    private int tankSize;

    public Bus(String typeName, int topSpeed, int tankSize, int capacity, int passengers) {
        this.typeName = typeName;
        this.topSpeed = topSpeed;
        this.tankSize = tankSize;
        this.capacity = capacity;
        this.passengers = passengers;

    }

    @Override
    public void start() {
        System.out.println("Bus " + typeName + " has started");
    }

    public void stop() {
        System.out.println("Bus " + typeName + " has stopped");
    }

    public void getInfo() {
        System.out.println("Bus " + typeName + " capasity" + capacity +
                "passengers" + passengers + " top speed" + topSpeed + " tank size" + tankSize
        );

    }
}