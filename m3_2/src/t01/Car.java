package t01;

public class Car implements Vehicle {
    private String typeName;
    private String color;
    private String fuelType;

    public Car(String type, String fuelType, String color) {
        this.typeName = type;
        this.fuelType = fuelType;
        this.color = color;
    }
        @Override
        public void start () {
            System.out.println("Car " + typeName + " has started");
        }
        @Override
        public void stop () {
            System.out.println("Car " + typeName + " has stopped");
        }

        @Override
        public void getInfo () {
            System.out.println("Car information: " + typeName);
            System.out.println("Color: " + color);
            System.out.println("Fuel type: " + fuelType);

        }
    }
