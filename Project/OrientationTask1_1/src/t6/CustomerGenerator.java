package t6;

import java.util.Scanner;

import static t6.Main_t6.simulationAmmount;
import static t6.Main_t6.testFlag;

public class CustomerGenerator {

    public static void generateCustomers(int customerAmmount,ServicePoint servicePoint) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < customerAmmount; i++) {//// if not test mode loop ammount normal 1*ammount
            Customer_t6 customer = new Customer_t6();
            servicePoint.addToQueue(customer);
        }
        System.out.println(customerAmmount + " customer added to queue\n\n");

    }


}
