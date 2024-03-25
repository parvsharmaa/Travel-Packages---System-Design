public class Main {
    public static void main(String[] args) {
        // Creating passengers
        Passenger passenger1 = new Passenger("John", 1, PassengerType.STANDARD);
        Passenger passenger2 = new Passenger("Alice", 2, PassengerType.GOLD);
        Passenger passenger3 = new Passenger("Bob", 3, PassengerType.PREMIUM);

        // Creating destinations
        Destination destination1 = new Destination("Paris");
        Destination destination2 = new Destination("Rome");

        // Creating activities
        Activity activity1 = new Activity("Sightseeing", "Tour of the city", 50.0, 20, destination1);
        Activity activity2 = new Activity("Museum Visit", "Visit to Louvre Museum", 30.0, 15, destination1);
        Activity activity3 = new Activity("Colosseum Tour", "Tour of Colosseum", 40.0, 25, destination2);

        // Adding activities to destinations
        destination1.addActivity(activity1);
        destination1.addActivity(activity2);
        destination2.addActivity(activity3);

        // Creating a travel package
        TravelPackage travelPackage = new TravelPackage("European Tour", 50);
        travelPackage.addDestination(destination1);
        travelPackage.addDestination(destination2);

        // Adding passengers to the travel package
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        travelPackage.addPassenger(passenger3);

        // Sign up passengers for activities
        passenger1.signUp(activity1);
        passenger2.signUp(activity1);
        passenger3.signUp(activity1);

        // Print itinerary
        travelPackage.printItinerary();

        // Print passenger list
        travelPackage.printPassengerList();

        // Print passenger details
        travelPackage.printPassengerDetails(passenger1);

        // Print available activities
        travelPackage.printAvailableActivities();
    }
}
