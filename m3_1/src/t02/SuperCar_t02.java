//Task 1: Sports car
//Using your earlier Car class create SportsCar class that has better acceleration and deceleration
// (and higher gasoline consumption) than an ordinary Car.
package t02;

public class SuperCar_t02 extends Car_t02 {
    public SuperCar_t02(String typeName, int topSpeed, int tankSize) {
        super(typeName,topSpeed,tankSize);


    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 20;
            if (speed >= topSpeed) {
                speed = topSpeed;
                this.gasolineLevel=Math.max(0, this.gasolineLevel-5);
            }
        } else {
            speed = 0;
        }
    }

    void deaccelerate() {
        if (gasolineLevel > 0) {
                speed = Math.max(0, speed - 20);
        } else
            speed = 0;
    }
}
