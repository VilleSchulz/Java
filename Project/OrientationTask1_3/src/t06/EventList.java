package t06;


import java.util.PriorityQueue;

public class EventList {
    static PriorityQueue<Event> eventQueue= new PriorityQueue<>();

    public static void addToEventList(Event event){
        eventQueue.add(event);

    }
    public void printEventList(){
        for(Event event : eventQueue){
        //Event event = eventQueue.poll();// poll events from Priority Queue
        System.out.println("event: "+ event.getEventType()+"  event time: "+event.getEventTime());
    }

    }
}
