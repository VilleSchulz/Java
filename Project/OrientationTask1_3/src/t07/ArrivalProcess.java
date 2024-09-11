package t07;

import eduni.distributions.ContinuousGenerator;

public class ArrivalProcess {
    ContinuousGenerator generator;
    EventList eventList;
    EventType eventType;
    public ArrivalProcess(ContinuousGenerator g, EventList eventList, EventType eventType) {
        this.generator = g;
        this.eventList = eventList;
        this.eventType = eventType;
    }



    public void generateNext(){
               Event event =  new Event((int) (Clock.getInstance().getTime() + generator.sample()), EventType.ARRIVAL,eventList);
                System.out.println("Event: "+event.getEventType()+" event time: "+event.getEventTime());


        }
    }

