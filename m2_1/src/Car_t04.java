


public class Car_t04 {

    private int speed;
    private double gasolineLevel;
    private final String typeName;
    private final int topSpeed;
    private final int tankSize;
    private int targetSpeed;
    private boolean cruiseOn = false;

    public Car_t04(String typeName, int topSpeed, int tankSize) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.topSpeed = topSpeed;
        this.tankSize = tankSize;
    }


    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            if (speed >= topSpeed) {
                speed = topSpeed;
            }
        } else {
            speed = 0;
        }
    }

    void deaccelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    public void cruiseControl(int targetSpeed) {
        if (cruiseOn) {
            if (targetSpeed < 20 || targetSpeed > 150) {//set min speed 20 max 150
                System.out.println("Target speed: " + "(" + targetSpeed + ")" +
                        " must be set between 20 and 150");
            } else {
                System.out.println("Target speed set: " + "(" + targetSpeed + "km/h" + ")");
                speed = targetSpeed;
            }


        } else {
            System.out.println("Cruise control must be on to set the speed");
        }


    }


    public void setCruiseOn() {
        System.out.println("Cruise on");
        cruiseOn = true;

    }

    public void setCruiseOff() {
        System.out.println("Cruise off");
        cruiseOn = false;
    }

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = tankSize;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }


}





