package t07;

import eduni.distributions.Negexp;

import static t07.EventList.eventQueue;

public class Main_t07 {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        System.out.println(clock.getTime());
        clock.setTime(11);
        System.out.println(clock.getTime());
        EventList eventList = new EventList();
        ServicePoint servicePoint = new ServicePoint();

        eventList.printEventList();//print evenlist in priority order
        ArrivalProcess arrivalProcess = new ArrivalProcess((new Negexp(20,5)), eventList, EventType.ARRIVAL);

        for(int i = 0;i<10;i++){
        arrivalProcess.generateNext();}
       eventList.printEventList();



        while(!eventQueue.isEmpty()){
            Event event = eventQueue.poll(); // poll events from Priority Queue
            CustomerGenerator.generateCustomers(1,servicePoint,event.getEventTime());
        }
        try{

            servicePoint.Serve(clock);}
        catch(Exception e){
            e.printStackTrace();
        }





    }
}
