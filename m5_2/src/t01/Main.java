package t01;

public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        reservationSystem.addTickets(100);
        reservationSystem.addCustomer(200);//täällä lisätään thredaus(käyttäjät ovat ns lippujonossa)
        System.out.println("Tickets left: " + reservationSystem.getAvailableCapacity());
    }
}
