package t3;

import java.util.Scanner;

public class Main_t3 {
    public static void main(String[]args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Press something to create new customer");
        String press = in.nextLine();


        Customer_t3 customer = new Customer_t3();

        System.out.println("Press something to remove customer");
        String press2 = in.nextLine();

        customer.getTimeSpent();


    }

}
