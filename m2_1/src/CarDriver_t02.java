public class CarDriver_t02 {

    public static void main(String[] args) {



        class Car {

            private double speed;
            private double gasolineLevel;
            private final String typeName;
            private final int topSpeed;
            private final int tankSize;

            public Car(String typeName,int topSpeed,int tankSize) {
                speed = 0; gasolineLevel = 0;
                this.typeName = typeName;
                this.topSpeed = topSpeed;
                this.tankSize = tankSize;
            }


            public void accelerate() {
                if (gasolineLevel > 0)
                    speed += 10;
                else
                    speed = 0;
            }
            void decelerate(int amount) {
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

        Car myCar;

        myCar = new Car("Toyota Corolla",200,100);
        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
    }
}