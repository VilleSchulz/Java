package t02;

public class VehicleDemo_t02 {
    public static void main(String[] args) {
        Car car = new Car("Ferrari", "Petrol", "Black");
        Bus bus = new Bus("Volvo", "Diesel", "Blue");
        MotorCycle motorCycle = new MotorCycle("Ducatti", "Petrol", "Blue");
        AbstractVehicle[] vehicle = new AbstractVehicle[3];
        vehicle[0] = car;
        vehicle[1] = bus;
        vehicle[2] = motorCycle;
        for (AbstractVehicle v : vehicle) {
            v.start();
            v.stop();
            v.getInfo();
        }
    }
}
