package t01;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Ferrari", "Petrol", "Black");
        Bus bus = new Bus("Volvo", "Diesel", "Blue");
        MotorCycle motorCycle = new MotorCycle("Ducatti", "Electric", "Blue");
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = bus;
        vehicles[2] = motorCycle;
        for (Vehicle v : vehicles) {
            v.start();
            v.stop();
            v.getInfo();

        }
    }
}
