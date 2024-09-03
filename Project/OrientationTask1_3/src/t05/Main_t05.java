package t05;


import t05_06.ArrivalProcess;
import t05_06.Clock;
import t05_06.EventList;

public class Main_t05 {
    public static void main(String[] args) {
        t05_06.Clock clock = Clock.getInstance();
        System.out.println(clock.getTime());
        clock.setTime(11);
        System.out.println(clock.getTime());




    }
}
