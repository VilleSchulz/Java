package t06;

import eduni.distributions.Negexp;

import static t06.EventList.eventQueue;

public class Main_t06 {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        System.out.println(clock.getTime());
        clock.setTime(11);
        System.out.println(clock.getTime());
        EventList eventList = new EventList();


        eventList.printEventList();//print evenlist in priority order
        ArrivalProcess arrivalProcess = new ArrivalProcess((new Negexp(20,5)), eventList, EventType.ARRIVAL);

        for(int i = 0;i<10;i++){
        arrivalProcess.generateNext();}
       eventList.printEventList();

        while(!eventQueue.isEmpty()){
            Event event = eventQueue.poll(); // poll events from Priority Queue
            clock.setTime(event.getEventTime());
            System.out.println("Time" +clock.getTime());

        }





    }
}
