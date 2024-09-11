(P) Let's make the following test suite with Customer, Clock, Event, EventType, EventList, ArrivalProcess (which includes a random number generator) and ServicePoint. Note that in this exercise, the time flow is not yet simulated according to the three-phase model.

The test program generates arrival events as above: i.e., 10 events are created in the event list. Finally, (in this test program), the clock displays the time of the last event created.

Once all events are created, they are all processed sequentially (the clock is not moved here). Customers are created to the Service Point queue as the events are processed (dig each event out of the list one by one). Each event time is marked as a customer arrival time.

The clock is then moved forward slightly, e.g., by 5 time units.

At this time, the service point is cleared one customer at a time in the program loop, and the result of the clearance is the time each customer spent in the system.