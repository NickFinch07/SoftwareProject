import java.util.*;

public class GuestTransactions {
    
    // Instance Variables

    private String roomType;
    private String name;
    private double foodCost;
    private int roomCost;
    private int roomNum;
    private int nightsSpent;

    // List of Guests

    public static ArrayList<String> guestList = new ArrayList<String>();

    // Constructor

    public GuestTransactions(String initRoomType, String initName, int initNightsSpent) {
        name = initName;
        nightsSpent = initNightsSpent;
        guestList.add(name);
        roomType = initRoomType;
        if (roomType.equalsIgnoreCase("suite")) {
            roomCost = 750;
            roomNum = 400 + guestList.indexOf(name);
        }
        else if (roomType.equalsIgnoreCase("deluxe")) {
            roomCost = 400;
            roomNum = 300 + guestList.indexOf(name);
        }
        else if (roomType.equalsIgnoreCase("double")) {
            roomCost = 250;
            roomNum = 200 + guestList.indexOf(name);
        }
        else if (roomType.equalsIgnoreCase("single")) {
            roomCost = 50;
            roomNum = 100 + guestList.indexOf(name);
        }
        else {
            roomCost = 0;
            roomNum = 0;
        }
    }

    // Get, Set, or Extra Methods

    public String getRoomType() {
        return roomType;
    }

    public double getFoodCost() {
        return foodCost;
    }

    public String getName() {
        return name;
    }

    public int getRoomCost() {
        return roomCost;
    }

    public int getRoomNumber() {
        return roomNum;
    }

    public double getPrice(String foodEaten) {
        if (foodEaten.equalsIgnoreCase("Curry Chicken")) {
            return 10.0;
        }
        else if (foodEaten.equalsIgnoreCase("Baked Fish")) {
            return 30.0;
        }
        else if (foodEaten.equalsIgnoreCase("Mutton")) {
            return 20.0;
        }
        else if (foodEaten.equalsIgnoreCase("Roast Turkey")) {
            return 25.0;
        }
        else if (foodEaten.equalsIgnoreCase("Pudding")) {
            return 15.0;
        }
        else {
            return 0.0;
        }

    }

    public void changeRoom(String roomType) {
        if (roomType.equalsIgnoreCase("suite")) {
            roomCost = 750;
            roomNum = 400 + guestList.indexOf(getName());
        }
        else if (roomType.equalsIgnoreCase("deluxe")) {
            roomCost = 400;
            roomNum = 300 + guestList.indexOf(getName());
        }
        else if (roomType.equalsIgnoreCase("double")) {
            roomCost = 250;
            roomNum = 200 + guestList.indexOf(getName());
        }
        else if (roomType.equalsIgnoreCase("single")) {
            roomCost = 50;
            roomNum = 100 + guestList.indexOf(getName());
        }
        else {
            System.out.println("Invalid Room Type");
        }
    }

    public void setFoodCost(String foodEaten) {
        foodCost += getPrice(foodEaten);
    }


    public double calculateDues() {
        return (roomCost * nightsSpent) + (foodCost * 1.1);
    }

    // toString method

    public String toString() {
        return "Name: " + name + "\n   Room Type: " + roomType + "\n   Room Number: " + roomNum + "\n   Total Dues: $" + this.calculateDues() + "0";
    }

}

