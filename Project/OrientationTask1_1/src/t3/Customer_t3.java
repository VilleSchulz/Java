//P) Write the Customer class. The customer has an id (int), a start time (long),
// an end time (long), methods to handle them (getters and setters), and a method to
// find out the time spent (end time-start time). Write a test program to test the operation
// of the method. The id of the first customer = 1. When a new customer is created, it will
// have an id one larger to the previous customer.
//For this task, you can use the integers you specify, or the values given by the System.currentTimeMillis()
// or System.nanotime() methods as time stamps (start time/stop time).
package t3;

public class Customer_t3 {
    private static int counter = 1;
    private  int id;
    private static long startTime;

    public Customer_t3() {
        setId(counter);
        counter++;
        System.out.println("Customer " + getId() + " created");
        setStartTime();

    }

    public void setId(int newId) {
        if (newId >= 1) {
            id = newId;
        } else {
            System.out.println("Id invalid, must be greater than 0");
        }


    }

    public  int getId() {

        return id;
    }

    public void setStartTime() {
        startTime = System.currentTimeMillis();
    }

    public  String getTimeSpent() {
        String rtn;
        long endTime = System.currentTimeMillis();
        long timeSpent = endTime - startTime;
        rtn = "Time spent " + timeSpent + " ms";

        return rtn;
    }

}