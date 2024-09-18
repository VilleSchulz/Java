package t01;

import java.util.concurrent.CopyOnWriteArrayList;

public class ReservationSystem {
    CopyOnWriteArrayList<Customer> customerList = new CopyOnWriteArrayList<>();
    CopyOnWriteArrayList<Ticket> ticketList = new CopyOnWriteArrayList<>();
//tässä tehdään thredaus kun lisätää käyttäjät "lippujonoon"
   public void addCustomer(int amount) {
       Thread[] threads = new Thread[amount];
       for (int i = 0; i < amount; i++) {
           Customer customer = new Customer(ticketList);
           threads[i] = new Thread(customer);
           customerList.add(customer);
           threads[i].start();
       }

       for (Thread thread : threads) {
           try {
               thread.join();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
   }
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

