package t01;

public class Main_t01 {
    public static void main(String[] args) {
        t01.Car_t01 myCar;
        t01.SuperCar_t01 mySuperCarT02;
        t01.Bus_t02 myBusT03;
        myCar = new t01.Car_t01("Toyota Corolla", 200, 100);
        mySuperCarT02 = new t01.SuperCar_t01("Toyota Corolla-S", 400, 200);
        myBusT03 = new t01.Bus_t02("Volvo",80,500,50);
        myBusT03.accelerate();
        myCar.fillTank();
        mySuperCarT02.fillTank();


        for (int i = 0; i < 6; i++) {//start accelerating
            myCar.accelerate();
            myBusT03.accelerate();
            mySuperCarT02.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            System.out.println(mySuperCarT02.getTypeName() + ": speed is " + mySuperCarT02.getSpeed() + " km/h");
        }

        System.out.println("Deacceleration process");
        while (myCar.getSpeed() > 0) {
            myCar.deaccelerate();
            mySuperCarT02.deaccelerate();
            myBusT03.deaccelerate();
            System.out.println(mySuperCarT02.getTypeName() + ": speed is " + mySuperCarT02.getSpeed() + " km/h");
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            System.out.println(myBusT03.getTypeName() + ": speed is " + myBusT03.getSpeed() + " km/h");
        }
    myBusT03.passengerEnter(55);
        myBusT03.passengerEnter(50);
        myBusT03.passengerExit(30);

    }
}


