

package t07;

public class Customer {
    private static int counter = 1;
    private int id;
    private int startTime;

    public Customer(int serviceStartTime) {
        setId(counter);
        counter++;
        System.out.println("Customer " + getId() + " created");
        setStartTime(serviceStartTime);
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

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }
    public int getStartTime() {
        return startTime;
    }

    public int getTimeSpent() {;
        int timeSpent = Clock.getInstance().getTime() - startTime;
        return timeSpent;

    }
}


