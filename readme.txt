🚀 High-Level Design (HLD) : The HLD illustrates the overall architecture and interaction between different components of the system.

Components:

-> Travel Package: Represents a package offered by a travel agency, containing destinations and activities.
-> Destination: Represents a specific location included in a travel package, containing activities.
-> Activity: Represents an activity available at a destination, with details like name, description, cost, and capacity.
-> Passenger: Represents an individual signing up for a travel package, with details like name, type, and activities signed up for.

-> Interactions:

    -> Travel Package manages the itinerary and enrollment of passengers.
    -> Destination contains activities available for that location.
    -> Passengers sign up for activities within the travel package.


🚀 Low-Level Design (LLD) : The LLD provides a detailed view of the classes, their attributes, methods, and relationships.

Classes:

-> TravelPackage
    -> Attributes: name, passengerCapacity, itinerary, passengers
    -> Methods: addDestination(), addPassenger(), printItinerary(), printPassengerList(), printPassengerDetails(), printAvailableActivities()
-> Destination
    -> Attributes: name, activities
    -> Methods: addActivity()
-> Activity
    -> Attributes: name, description, cost, capacity, destination
    -> Methods: None
-> Passenger
    -> Attributes: name, passengerNumber, type, balance, activities
    -> Methods: signUp()

-> Enum:
    ->PassengerType: STANDARD, GOLD, PREMIUM

-> Relationships:

    -> TravelPackage has a list of Destinations and Passengers.
    -> Destination has a list of Activities.
    -> Passenger has a list of Activities.
    
This LLD outlines the structure of the system with classes, their attributes, methods, and relationships, providing a clear understanding of how the system will be implemented.