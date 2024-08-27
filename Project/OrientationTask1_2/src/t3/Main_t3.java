//(P) Define the event type using Java's own enum definition: public enum EventType {...}. Learn enum from the
// following source, for example: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
//Add the event type to the Event-objects of the previous task. Initially, there can be, say, 2 types
// (arrival, exit). The event types are indicated when the event list is printed.

package t3;



public class Main_t3 {
    public static void main(String[] args){
        EventList eventList = new EventList();

        Event event1 = new Event(9,EventType.ARRIVAL,eventList);
        Event event2 = new Event(1,EventType.ARRIVAL,eventList);
        Event event3 = new Event(3,EventType.EXIT,eventList);

        eventList.printEventList();//print evenlist in priority order
    }
}
