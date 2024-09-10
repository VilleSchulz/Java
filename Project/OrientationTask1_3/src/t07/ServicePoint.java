package t07;


import java.util.LinkedList;
import java.util.Scanner;

public class ServicePoint {
    static int totalServiceTime = 0;
    static int counter;
    Scanner scanner = new Scanner(System.in);
    LinkedList<Customer> queue = new LinkedList<>();

    public void addToQueue(Customer customer) {
        queue.addFirst(customer);

    }

    public void removeFromQueue() {
        queue.removeLast();

    }

    public void Serve(Clock clock) throws InterruptedException {
        int startTime;
        int serviceTime;
        int waitTime = 0;
        while (!queue.isEmpty()) {
            startTime = clock.getTime();
            int customerId = queue.getLast().getId();
            if (queue.size() == 1) {
                serviceTime = queue.getLast().getStartTime();// prenvents from running out of index
                clock.setTime(startTime);
            } else {
                serviceTime = queue.get(queue.size() - 2).getStartTime() - queue.getLast().getStartTime();// get service start time from next customer to calculate total servicetime
                clock.setTime(queue.get(queue.size() - 2).getStartTime());// set clock time to next customers start time
            }


            Thread.sleep(serviceTime * 10);
            System.out.println("\nTime set to " + startTime);

            removeFromQueue();


            System.out.println("Customer " + customerId);
            System.out.println("Wait time: " + (int) waitTime + "s");
            System.out.println("Service time: " + serviceTime + "s");
            System.out.println("Total time: " + (int) (waitTime + serviceTime) + "s\n\n\n\n");
            totalServiceTime += (int) serviceTime;
            //System.out.println("Total service time: " + totalServiceTime + "s");
            counter++;

            waitTime += serviceTime;
        }
        System.out.println("No more customers");
        System.out.println("Average serve time is " + totalServiceTime / counter + "s");


    }
}
