//Task 1: Sports car
//Using your earlier Car class create SportsCar class that has better acceleration and deceleration
// (and higher gasoline consumption) than an ordinary Car.
package t01;

public class SuperCar extends Car_t01 {
    public SuperCar(String typeName, int topSpeed, int tankSize) {
        super(typeName);
        super(topSpeed);
        super(tankSize);

    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 20;
            if (speed >= topSpeed) {
                speed = topSpeed;
                this.gasolineLevel-=5;
                if (gasolineLevel <= 0) {
                    gasolineLevel = 0;
                }
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
}
