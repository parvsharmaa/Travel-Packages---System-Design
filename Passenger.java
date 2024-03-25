import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private int passengerNumber;
    private PassengerType type;
    private double balance;
    private List<Activity> activities;

    public Passenger(String name, int passengerNumber, PassengerType type) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.type = type;
        this.balance = 0.0;
        this.activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public PassengerType getType() {
        return type;
    }

    public void setType(PassengerType type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public boolean signUp(Activity activity) {
        if (type == PassengerType.STANDARD) {
            if (balance >= activity.getCost()) {
                balance -= activity.getCost();
                activities.add(activity);
                return true;
            } else {
                return false;
            }
        } else if (type == PassengerType.GOLD) {
            double discountedCost = activity.getCost() * 0.9;
            if (balance >= discountedCost) {
                balance -= discountedCost;
                activities.add(activity);
                return true;
            } else {
                return false;
            }
        } else { // PREMIUM passenger
            activities.add(activity);
            return true;
        }
    }
}
