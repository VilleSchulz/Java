package t05_06;



public class Main_t06 {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        System.out.println(clock.getTime());
        clock.setTime(11);
        System.out.println(clock.getTime());
        EventList eventList = new EventList();


        eventList.printEventList();//print evenlist in priority order
        ArrivalProcess arrivalProcess = new ArrivalProcess();
        //arrivalProcess.addEvent();
        eventList.printEventList();



    }
}
