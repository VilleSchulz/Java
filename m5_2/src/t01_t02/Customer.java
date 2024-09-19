package t01_t02;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class Customer implements Runnable {
    private final CopyOnWriteArrayList<Ticket> ticketList;
    private final int id;
    private static int count=1;
    CopyOnWriteArrayList<Ticket>customersTickets = new CopyOnWriteArrayList<>();

    public Customer(CopyOnWriteArrayList<Ticket> ticketList) {
        this.ticketList = ticketList;
        this.id = count++;

    }

    public int getCustomerId(){
        return id;

    }
    public  void reserveTicket(int ammount) {
        int ticketsReserved = 0;
        synchronized (ticketList){
        for(int i = 0 ; i<ammount;i++) {
            if (!ticketList.isEmpty()) {//check if there are tickets left. if customer tries to reserve more tickets than there are left, the customer will only reserve the tickets that are left
                Ticket ticket = ticketList.remove(0);//delete ticket from list
                customersTickets.add(ticket);//add ticket to customers ticket list
                System.out.println("Customer " + id + " reserved ticket id: " + ticket.getId());
                ticketsReserved++;//add one to customers reserved ticket count

            } else {
                System.out.println("Customer " + id + " tried to reserve " + ammount +
                        " tickets but couldn´t reserve " + (ammount - ticketsReserved) + " tickets");
                break;
            }

        }
        }
    }
    @Override
    public void run(){
        Random random = new Random();
        int ammount = random.nextInt(5)+1;// buy random ammount 1-5 tickets
        reserveTicket(ammount);
    }
}
