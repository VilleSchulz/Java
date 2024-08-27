package t5;


import java.util.LinkedList;

public class ServicePoint {
    LinkedList<Customer_t5> queue = new LinkedList<>();

    public void addToQueue(Customer_t5 customer) {
        queue.addFirst(customer);

    }

    public void removeFromQueue() {
            queue.removeLast();

    }

    public void Serve() throws InterruptedException {
        while(!queue.isEmpty()){
            int customerId = queue.getLast().getId();
            long waitTime = queue.getLast().getTimeSpent()/10;
           double serviceTime = Math.random()* 1000;

            removeFromQueue();

            Thread.sleep((long)serviceTime);
            System.out.println("Customer " + customerId);
            System.out.println("Wait time: " + waitTime+"s");
            System.out.println("Service time: " + serviceTime+"s");
            System.out.println("Total time: " + (waitTime + serviceTime)+"s\n\n\n\n");
        }
        System.out.println("No more customers");



    }
}
