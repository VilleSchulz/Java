


package t6;

import java.util.Scanner;

public class Main_t6 {
    public static boolean testFlag = true;// test flag => true for testing simulation multiple times
    public static int simulationAmmount;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ServicePoint servicePoint = new ServicePoint();
        System.out.println("How many customers do you want to add?");
        int customerAmmount = Integer.parseInt(scanner.nextLine());

        if (testFlag) {
            //***************test program begins***************************
            System.out.println("How many time you want to run simulation");
            simulationAmmount = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < simulationAmmount; i++) {
                CustomerGenerator.generateCustomers(customerAmmount, servicePoint);
                servicePoint.Serve();

            }
            //*****************test program ends*****************

        } else {
            CustomerGenerator.generateCustomers(customerAmmount, servicePoint);
            servicePoint.Serve();


        }
        //main program starts here***


    }
}
