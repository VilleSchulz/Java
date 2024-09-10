(P) Define the ArrivalProcess class. It is intended to create new events (arrivals) of a certain type in the event list. The ArrivalProcess is associated with a random number generator, which it uses to generate arrival intervals according to the distribution followed by the generator (choose one of the distributions in eduni.distributions, distributed as a zip-package in Oma).

Note that the event type and the random number generator are properties of the ArrivalProcess (=internal variables/objects). A new event is added to the event list by a custom method of the ArrivalProcess, to which the event list is passed as a parameter.

Make a simple test program, the purpose of which is simply to test the operation of the ArrivalProcess object. In other words, the ArrivalProcess object is used to add new events to the event list (say, create 10 arrival events). The test program uses a clock, which is always moved to the new time required by the event when the event is created. Print the event list in your test program. At this stage, the order of printing is not important (cf. the previous task, where you wanted to print the event list in event order).

