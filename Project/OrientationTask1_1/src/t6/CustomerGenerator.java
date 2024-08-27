package t6;

import java.util.Scanner;

import static t6.Main_t6.simulationAmmount;
import static t6.Main_t6.testFlag;

public class CustomerGenerator {

    public static void generateCustomers(ServicePoint servicePoint) {
        Scanner scanner = new Scanner(System.in);
        int testMultiplier = 1;
        //if test mode multiply customer count by given value
        if(testFlag){
            testMultiplier = simulationAmmount;

        }


        System.out.println("How many customers do you want to add?");
        int customerAmmount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerAmmount*testMultiplier; i++) {//// if not test mode loop ammount normal 1*ammount
            Customer_t6 customer = new Customer_t6();
            servicePoint.addToQueue(customer);
        }
        System.out.println(customerAmmount + " customer added to queue\n\n");

    }


}
