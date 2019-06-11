import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    BusStop busStop;
    Bus bus;
    Person person;

    @Before

    public void before(){
        busStop = new BusStop("Bus Stop 1");
        bus = new Bus("London", 20);
        person = new Person();

    }

    @Test
     public void checkIfBusStopHasAName(){
        assertEquals("Bus Stop 1", busStop.getBusStopName());
    }

    @Test
    public void checkBusStopQueueIsEmpty(){
        assertEquals(0, busStop.getBusStopQueue());
    }

    @Test
    public void checkIfPassengersAddedToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.getBusStopQueue());
    }

    @Test
    public void checkIfPassengerIsRemovedFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(0, busStop.getBusStopQueue());
    }
}
