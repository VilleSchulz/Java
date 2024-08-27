/*(P) Write a program in which you create customers implemented in the previous task and queue
and dequeue them by a user (make a simple text-based interface that asks the user to take action).
Use the LinkedList class as the queue, using the FIFO principle (first in first out, the longest in
the list gets out first: addFirst and removeLast methods of the LinkedList class). Write a test program
and print the time spent in the queue by each removed client. To measure the time, you can use the System.nanotime()
method.*/

package t4;

import java.util.Scanner;
import java.util.LinkedList;

public class Main_t4 {
    public static void main(String[] args) {
        LinkedList<Customer_t4> queue = new LinkedList<>();
        System.out.println("T4 Main alkaa");
        Scanner in = new Scanner(System.in);
        String command;
        do {
            System.out.println("Press 1) to add customer to queue. Press 2) to remowe from queue ");
            command = in.nextLine();
            if (command.equals("1")) {
                Customer_t4 newCustomer = new Customer_t4();
                queue.addFirst(newCustomer);
            } else if (command.equals("2")) {
                if (!queue.isEmpty()) {
                    Customer_t4 scannedCustomer = queue.removeLast();
                    System.out.println("Customer" + scannedCustomer.getId() + " remowed from queue\n"
                            + " Time spend in queue "+scannedCustomer.getTimeSpent() + "ms");

                }
                else{
                    System.out.println("queue is empty");
                }

            }

        } while (!command.equals("q"));
    }
}

