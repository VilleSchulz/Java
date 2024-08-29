//Task 4: Cruise control Add to Car class a cruise control feature. With cruise control feature, the driver can set
// the target speed, read the current target speed, and turn cruise control on or off. For cruise control, there is
// a minimum and maximum speed that can be set. After target speed has been set and cruise control turned on, the car
// should accelerate or decelerate to reach the target speed. If reaching the target speed is not possible, cruise
// control must be turned off, and the driver be informed about this (perhaps the returning value of turnOn method
// could be used for this). Modify CarDriver class to test your cruise control. Do this before you implement cruise
// control in Car class. Why to modify CarDriver first?

public class Main_t04 {
    public static void main(String[] args) {
        Car_t04 myCar;
        myCar = new Car_t04("Toyota Corolla", 200, 100);
        myCar.fillTank();
        for (int i = 0; i < 6; i++) {//start accelerating
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }


        myCar.cruiseControl(150);//testing if you can set speed when cruise control is off
        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");

        myCar.setCruiseOn();//set cruise control on

        myCar.cruiseControl(18);// test if you can set too low speed// min speed 20
        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");

        myCar.cruiseControl(200);// test if you can set too hi speed// max speed 150
        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");

        myCar.cruiseControl(150);//set correct speed
        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");


        myCar.setCruiseOff();
        System.out.println("Deacceleration process");
        while (myCar.getSpeed() > 0) {
            myCar.deaccelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

    }
}


