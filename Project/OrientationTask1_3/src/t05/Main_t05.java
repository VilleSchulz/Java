package t05;


import t06.Clock;

public class Main_t05 {
    public static void main(String[] args) {
        t06.Clock clock = Clock.getInstance();
        System.out.println(clock.getTime());
        clock.setTime(11);
        System.out.println(clock.getTime());




    }
}
