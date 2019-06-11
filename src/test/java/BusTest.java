import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Edinburgh", 5);
        person = new Person();
        busStop = new BusStop("Bus Stop 1");

    }

    @Test
    public void checkIfBusHasADestination(){
        assertEquals("Edinburgh", bus.getDestinstion());
    }


    @Test
    public void checkIfBusHasACapacity(){
        assertEquals(5, bus.getCapacity());
    }

    @Test
    public void getNumberOfPassengersInTheBus(){
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void checkIfPassengerCanGetIntoTheBus(){
        bus.addPassenger(person);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void checkPassengerCantGetOnIfBusIsFull(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.getNumberOfPassengers());
    }

    @Test
    public void removePassengersFromTheBus(){
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void busCanPickUpPassengersFromBusStop(){
        bus.addPassenger(person);
        bus.pickUp(busStop);
        assertEquals(1, bus.getNumberOfPassengers());
    }




}
