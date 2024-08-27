//(P) Program a single point of service system where the customer moves through the system:
//Define a ServicePoint class, associated with a queue (LinkedList), that picks customers from the queue
// (by the queue's normal order) and serves them one by one.
//To implement the queue, use the Java LinkedList class as in the previous task. Define the
// methods void addToQueueue(Customer a) and Customer removeFromQueueue() in the ServicePoint class.
//Define also a method called serve() for the ServicePoint class that picks all the clients by turns from the queue
// using the aforementioned Customer removeFromQueueue() method. After retrieving the customer from the queue, we
// simulate the service task (in the serve method) by delaying the execution of the code (before calling the Customer
// removeFromQueueue() method again) by calling the Thread.sleep(sleeptime) method. The service time = sleeptime and is
// computed in the program, e.g., with the Math.random() method.
//As soon as the customer is served, the serve method takes the next customer in the queue. When the queue is empty,
// the execution of the serve method terminates. The serve method prints the response time (waiting time in the
// queue + service time) and the time spent in the service for each customer when the customer is removed from the queue.
//For this task, define a CustomerGenerator class to create the desired number of customers in the queue of a service
// point (the ServicePoint is passed to the generator as a parameter to the creation request). Create the customers at
// the beginning of the program.


package t5;

public class Main_t5 {
    public static void main(String[] args){


    }
}
