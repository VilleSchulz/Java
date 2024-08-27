package t6;


import java.util.LinkedList;
import java.util.Scanner;

public class ServicePoint {
    static int totalServiceTime = 0;
    static int counter;
    Scanner scanner = new Scanner(System.in);
    LinkedList<Customer_t6> queue = new LinkedList<>();

    public void addToQueue(Customer_t6 customer) {
        queue.addFirst(customer);

    }

    public void removeFromQueue() {
        queue.removeLast();

    }

    public void Serve() throws InterruptedException {

        while (!queue.isEmpty()) {


            if (Main_t6.testFlag) {


            }
            int customerId = queue.getLast().getId();
            long waitTime = queue.getLast().getTimeSpent() / 10;
            double serviceTime = Math.random() * 1000;

            removeFromQueue();

            Thread.sleep((long) serviceTime);
            System.out.println("Customer " + customerId);
            System.out.println("Wait time: " + (int) waitTime + "s");
            System.out.println("Service time: " + (int) serviceTime + "s");
            System.out.println("Total time: " + (int) (waitTime + serviceTime) + "s\n\n\n\n");
            totalServiceTime += (int) serviceTime;
            System.out.println("Total service time: " + totalServiceTime + "s");
            counter++;


        }
        System.out.println("No more customers");
        if( Main_t6.testFlag) {
            System.out.println("Average serve time is " + totalServiceTime / counter +"s");
        }


    }
}
