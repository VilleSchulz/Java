package t01;

public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        reservationSystem.addTickets(100);
        Thread[] threads = new Thread[200];
        for (int i = 0; i < 200; i++) {
            Customer customer = new Customer(reservationSystem.ticketList);
            threads[i] = new Thread(customer);
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Tickets left: " + reservationSystem.getAvailableCapacity());
    }
}
