package t03;

public class VehicleDemo_t03 {
    public static void main(String[] args) {
        Car car = new Car("Ferrari", "Petrol", "Black");
        Bus bus = new Bus("Volvo", "Diesel", "Blue");
        MotorCycle motorCycle = new MotorCycle("Ducatti", "Petrol", "Blue");
        ElectricCar electricCar = new ElectricCar("Tesla", "Electric", "Silver");
        ElectricMotorCycle electricMotorCycle = new ElectricMotorCycle("BMW", "Electric", "Blue");
        AbstractVehicle[] vehicle = new AbstractVehicle[5];
        vehicle[0] = car;
        vehicle[1] = bus;
        vehicle[2] = motorCycle;
        vehicle[3] = electricCar;
        vehicle[4] = electricMotorCycle;
        for (AbstractVehicle v : vehicle) {
            v.start();
            v.stop();
            v.getInfo();
            v.charge();

        }
    }
}
