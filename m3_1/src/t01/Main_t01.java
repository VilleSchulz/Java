package t01;



public class Main_t01 {
    public static void main(String[] args) {
        t01.Car_t01 myCar;
        t01.SuperCar_t01 mySuperCarT02;

        myCar = new t01.Car_t01("Toyota Corolla", 200, 100);
        mySuperCarT02 = new t01.SuperCar_t01("Toyota Corolla-S", 400, 200);

        myCar.fillTank();
        mySuperCarT02.fillTank();


        for (int i = 0; i < 6; i++) {//start accelerating
            myCar.accelerate();
            mySuperCarT02.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            System.out.println(mySuperCarT02.getTypeName() + ": speed is " + mySuperCarT02.getSpeed() + " km/h");
        }

        System.out.println("Deacceleration process");
        while (myCar.getSpeed() > 0) {
            myCar.deaccelerate();
            mySuperCarT02.deaccelerate();
            System.out.println(mySuperCarT02.getTypeName() + ": speed is " + mySuperCarT02.getSpeed() + " km/h");
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");

        }

    }
}


