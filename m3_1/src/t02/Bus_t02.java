package t02;

public class Bus_t02 extends t02.Car_t02 {
    private int passengers;
    private int capacity;

    public Bus_t02(String typeName, int topSpeed, int tankSize, int capacity) {
       super(typeName,topSpeed,tankSize);
        this.capacity = capacity;
    }

    public void passengerEnter(int passengers) {
        if (this.passengers > capacity) {
            System.out.println("Cannot take more passengers Bus is full");
        } else {
            if (passengers +this.passengers > capacity) {
                this.passengers = 50;
                System.out.println("Passengers added:" + 50);

            }else{
                this.passengers += passengers;
                System.out.println("Passengers added:" +passengers);
            }

            System.out.println("Total passengers: "+ this.passengers);

        }


    }

    public void passengerExit(int passengers) {

        this.passengers = Math.max(0, this.passengers - passengers);
        System.out.println("Passengers exited:"+passengers);
        System.out.println("Total passengers: "+ this.passengers);

    }

}