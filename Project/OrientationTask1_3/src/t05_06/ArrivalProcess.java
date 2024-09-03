package t05_06;
import java.util.PriorityQueue;
import java.util.Random;

import eduni.distributions.Bernoulli;

public class ArrivalProcess {
    Bernoulli source = new Bernoulli(0.7);
    Random random = new Random();
    int randomInt= random.nextInt(1000);

        public void addEvent(EventList eventList){
            if(source.sample() == 1){
               Event event =  new Event(randomInt,EventType.ARRIVAL,eventList);
            }

        }
    }

