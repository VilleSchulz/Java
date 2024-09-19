package t01_t02;

import java.util.concurrent.CopyOnWriteArrayList;

public class ReservationSystem {
    CopyOnWriteArrayList<Customer> customerList = new CopyOnWriteArrayList<>();
    CopyOnWriteArrayList<Ticket> ticketList = new CopyOnWriteArrayList<>();
//tässä tehdään thredaus kun lisätää käyttäjät "lippujonoon"
   public void addCustomer(int amount) {
       Thread[] threads = new Thread[amount];
       for (int i = 0; i < amount; i++) {
           Customer customer = new Customer(ticketList);
           threads[i] = new Thread(customer);//add customer to thread
           customerList.add(customer);
           threads[i].start();
       }

       for (Thread thread : threads) {
           try {
               thread.join();//wait for threads to finish
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
   }
    public void addTickets(int ammount) {
        for (int i = 0; i < ammount; i++) {
            Ticket ticket = new Ticket();//create ticket
            ticketList.add(ticket);//add ticket to list
        }

    }

    public int getAvailableCapacity() {
        return ticketList.size();
    }


}

