//(P) Define the Event and EventList classes so that the EventList can be used to get the Event objects processed in the
//correct chronological order. The Event is associated with an event time as an essential piece of information, and
// it is essential that the next event in the event list can be retrieved on demand.
//To implement the list, you can use the PriorityQueue class so that the EventList contains a PriorityQueue.
// To implement the ordering, Events must implement the Comparable interface, see below.
//Make a test program to a) generate a list of events, b) remove the first (=next to be processed) event from the list,
// and c) print the contents of the EventList, ordered by event time. As a tip for c: The API description says that
// Java's for-iteration does not print the contents of the PriorityQueueue in any particular order, but you have to
// find a way other than for-iteration.

package t2;

public class Main_t2 {
    public static void main(String[] args){
        EventList eventList = new EventList();

        Event event1 = new Event(6,"C",eventList);
        Event event2 = new Event(2,"B",eventList);
        Event event3 = new Event(1,"A",eventList);

    eventList.printEventList();//print evenlist in priority order
    }
}
