package t07;



import java.util.Scanner;

public class CustomerGenerator {

    public static void generateCustomers(int customerAmmount,ServicePoint servicePoint,int serviceStartTime) {
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < customerAmmount; i++) {//// if not test mode loop ammount normal 1*ammount
            Customer customer = new Customer(serviceStartTime);
            servicePoint.addToQueue(customer);
        }
        System.out.println(customerAmmount + " customer added to queue\n\n");

    }


}
