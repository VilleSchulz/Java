//(P) Write a program in which you create customers implemented in the previous task and queue and dequeue them
// by a user (make a simple text-based interface that asks the user to take action). Use the LinkedList class as the
// queue, using the FIFO principle (first in first out, the longest in the list gets out first: addFirst and removeLast
// methods of the LinkedList class). Write a test program and print the time spent in the queue by each removed client.
// To measure the time, you can use the System.nanotime() method.



package t4;

public class Customer_t4 {
    private static int counter = 1;
    private int id;
    private long startTime;
    private long endTime;

    public Customer_t4() {
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

    public int getId() {
        return id;
    }

    public void setStartTime() {
        startTime = System.currentTimeMillis();
    }

    public long getTimeSpent() {
        endTime = System.currentTimeMillis();
        long timeSpent = endTime - startTime;
        return timeSpent;

    }
}
/*


public class Customer_t3 {
    private static int counter = 1;
    private int id;
    private long startTime;
    private long endTime;
    public Customer_t3(){
        setId(counter);
        counter++;
        System.out.println("Customer " + getId() + " created")
        this.setStartTime();

    }
    public void setId(int newId){
        if (newId >= 1) {
            id = newId;
        }
        else {
            System.out.println("Id invalid, must be greater than 0");
        }



    }
    public int getId(){

        return id;
    }

    public void setStartTime(){
        startTime = System.currentTimeMillis();
    }
    public void setEndTIme(){
        endTime = System.currentTimeMillis();
    }
    public void getStartTime(){
        return startTime;
    }
    public void getEndTime(){
        return endTime;
    }
    public void getTimeSpent(){
        return (endTime-startTime);
    }
}


Next version:
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
    private int id;
    private long startTime;
    private long endTime;
    public Customer_t3(){
        setId(counter);
        counter++;
        System.out.println("Customer " + getId() + " created");
        this.setStartTime();

    }
    public void setId(int newId){
        if (newId >= 1) {
            id = newId;
        }
        else {
            System.out.println("Id invalid, must be greater than 0");
        }



    }
    public int getId(){

        return id;
    }

    public void setStartTime(){
        startTime = System.currentTimeMillis();
    }
    public void getTimeSpent(){
        endTime = System.currentTimeMillis();
        long timeSpent = endTime-startTime;
        System.out.println("Time spent " + timeSpent + " ms");
    }

}
*/


