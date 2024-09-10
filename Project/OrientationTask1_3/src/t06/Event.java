package t06;


public class Event implements Comparable<Event> {
    private int eventTime;
    private EventType eventType;


    public Event(int eventTime, EventType eventType, EventList eventList) {
        this.eventTime = eventTime;
        this.eventType = eventType;
        eventList.addToEventList(this);
    }

    @Override
    public int compareTo(Event other) {
        return Integer.compare(this.eventTime, other.eventTime);// compare event times and set them to order
    }

    public int getEventTime() {
        return eventTime;

    }

    public Enum<EventType> getEventType() {
        return this.eventType;
    }


}


