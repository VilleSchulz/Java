//


public class Car_t02 {

    private double speed;
    private double gasolineLevel;
    private final String typeName;
    private final int topSpeed;
    private final int tankSize;

    public Car_t02(String typeName, int topSpeed, int tankSize) {
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

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = 100;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }

    }




