package t01;

public class Main_t01 {
    public static void main(String[] args) {
        Car car = new Car("Ferrari","Petrol","Black");
        Bus bus = new Bus("Volvo","Diesel","Blue");
        MotorCycle motorCycle = new MotorCycle("Ducatti","Electric","Blue");
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = bus;
        vehicles[2] = motorCycle;
        for(Vehicle v : vehicles){
            v.start();
        }
        for(Vehicle v : vehicles){
            v.getInfo();
        }
        for(Vehicle v : vehicles){
            v.stop();
        }
    }
}
