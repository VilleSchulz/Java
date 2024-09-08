package t02;



public class Main_t02 {
    public static void main(String[] args) {
        Car_t02 myCar;
        SuperCar_t02 mySuperCarT02;
        Bus_t02 myBus;
        myCar = new Car_t02("Toyota Corolla", 200, 100);
        mySuperCarT02 = new SuperCar_t02("Toyota Corolla-S", 400, 200);
        myBus = new Bus_t02("Volvo",80,500,50);
        myBus.accelerate();
        myCar.fillTank();
        mySuperCarT02.fillTank();


        for (int i = 0; i < 6; i++) {//start accelerating
            myCar.accelerate();
            myBus.accelerate();
            mySuperCarT02.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            System.out.println(mySuperCarT02.getTypeName() + ": speed is " + mySuperCarT02.getSpeed() + " km/h");
        }

        System.out.println("Deacceleration process");
        while (myCar.getSpeed() > 0) {
            myCar.deaccelerate();
            mySuperCarT02.deaccelerate();
            myBus.deaccelerate();
            System.out.println(mySuperCarT02.getTypeName() + ": speed is " + mySuperCarT02.getSpeed() + " km/h");
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            System.out.println(myBus.getTypeName() + ": speed is " + myBus.getSpeed() + " km/h");
        }
    myBus.passengerEnter(55);
        myBus.passengerEnter(50);
        myBus.passengerExit(30);

    }
}



