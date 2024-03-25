import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
            return true;
        } else {
            return false;
        }
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("Activity: " + activity.getName() + ", Cost: " + activity.getCost() +
                        ", Capacity: " + activity.getCapacity() + ", Description: " + activity.getDescription());
            }
        }
    }

    public void printPassengerList() {
        System.out.println("Travel Package: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println(
                    "Passenger Name: " + passenger.getName() + ", Passenger Number: " + passenger.getPassengerNumber());
        }
    }

    public void printPassengerDetails(Passenger passenger) {
        System.out.println("Passenger Name: " + passenger.getName());
        System.out.println("Passenger Number: " + passenger.getPassengerNumber());
        System.out.println("Balance: " + passenger.getBalance());
        System.out.println("Activities Signed Up For:");
        for (Activity activity : passenger.getActivities()) {
            System.out.println(
                    "Activity: " + activity.getName() + ", Destination: " + activity.getDestination().getName() +
                            ", Cost: " + activity.getCost());
        }
    }

    public void printAvailableActivities() {
        System.out.println("Activities with Available Spaces:");
        for (Destination destination : itinerary) {
            for (Activity activity : destination.getActivities()) {
                if (activity.getCapacity() > 0) {
                    System.out.println("Activity: " + activity.getName() + ", Destination: " + destination.getName() +
                            ", Available Spaces: " + activity.getCapacity());
                }
            }
        }
    }
}
