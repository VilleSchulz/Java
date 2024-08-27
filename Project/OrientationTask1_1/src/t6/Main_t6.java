


package t6;

import java.util.Scanner;
import static t6.ServicePoint.totalServiceTime;
public class Main_t6 {
    public static boolean testFlag = true;
    public static int simulationAmmount;
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ServicePoint servicePoint = new ServicePoint();


        if (testFlag) {
            //***************test program begins***************************
            System.out.println("How many time you want to run simulation");
            simulationAmmount = Integer.parseInt(scanner.nextLine());
            CustomerGenerator.generateCustomers(servicePoint);
            servicePoint.Serve();
            //*****************test program ends*****************

        } else {
            //main program starts here***
            CustomerGenerator.generateCustomers(servicePoint);
            servicePoint.Serve();
        }


    }
}
