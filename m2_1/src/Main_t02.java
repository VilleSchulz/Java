public class Main_t02 {
    public static void main(String[] args) {
        Car_t02 myCar;

        myCar = new Car_t02("Toyota Corolla", 200, 100);
        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.deaccelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
    }
}