


package t6;

import java.util.Scanner;
public class Main_t6 {
    public static boolean testFlag = true;// test flag => true for testing simulation multiple times
    public static int simulationAmmount;
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ServicePoint servicePoint = new ServicePoint();


        if (testFlag) {
            //***************test program begins***************************
            System.out.println("How many time you want to run simulation");
            simulationAmmount = Integer.parseInt(scanner.nextLine());
            //*****************test program ends*****************

        }
            //main program starts here***
        CustomerGenerator.generateCustomers(servicePoint);
        servicePoint.Serve();


    }
}
