package t01;

import java.util.concurrent.CopyOnWriteArrayList;

public class ReservationSystem {
    CopyOnWriteArrayList<Customer> customerList = new CopyOnWriteArrayList<>();
    CopyOnWriteArrayList<Ticket> ticketList = new CopyOnWriteArrayList<>();
   /*
   Ei toiminut täällä:(
   public void addCustomer(int ammount) {
        for (int i = 0; i < ammount; i++) {
            Customer customer = new Customer(ticketList);
            Thread t = new Thread(customer);//lisää customeri omaa threadiin.
            customerList.add(customer);
            t.start();
            try{
                t.join();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }




        }
    }*/
    public void addTickets(int ammount) {
        for (int i = 0; i < ammount; i++) {
            Ticket ticket = new Ticket();
            ticketList.add(ticket);
        }

    }

    public int getAvailableCapacity() {
        return ticketList.size();
    }


}

