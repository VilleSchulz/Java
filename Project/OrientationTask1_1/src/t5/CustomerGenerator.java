package t5;

import java.util.Scanner;

public class CustomerGenerator {

    public static void generateCustomers(ServicePoint servicePoint) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many customers do you want to add?");
        int customerAmmount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerAmmount; i++) {
            Customer_t5 customer = new Customer_t5();
            servicePoint.addToQueue(customer);
        }
        System.out.println(customerAmmount + " customer added to queue\n\n");
    }


}
