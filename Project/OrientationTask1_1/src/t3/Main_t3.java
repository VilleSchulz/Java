package t3;

import java.util.Scanner;

public class Main_t3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String press =".";
        while (!press.isEmpty()) {
            System.out.println("Press enter to create two new customer");
            press = in.nextLine();
        }

        Customer_t3 customer1 = new Customer_t3();
        Customer_t3 customer2 = new Customer_t3();



        System.out.println("Press something to remove customer");
        in.nextLine();

        System.out.println("Customer "+customer1.getId()+" "+customer1.getTimeSpent());
        System.out.println("Customer "+customer2.getId()+" "+customer2.getTimeSpent());


    }

}
