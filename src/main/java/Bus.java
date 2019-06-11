import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();


    }

    public String getDestinstion() {

        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }


    public int getNumberOfPassengers() {
        return this.passengers.size();

    }

    public void addPassenger(Person person) {
        if(this.getNumberOfPassengers() < this.capacity){
        this.passengers.add(person);}
    }

    public void removePassenger(Person person) {
        this.passengers.remove(person);
    }

    public void pickUp(BusStop busStop) {
        if(this.getNumberOfPassengers() < this.capacity && busStop.getBusStopQueue() > 0){
            Person person = busStop.removePersonFromQueue();
            this.addPassenger(person);
        }

    }
}
