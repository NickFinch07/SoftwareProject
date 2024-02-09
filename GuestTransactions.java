import java.util.*;

public class GuestTransactions {
    
    private String roomType;
    private int foodCost;
    private int roomCost;
    private String name;
    private int roomNum;
    public static ArrayList<String> guests = new ArrayList<String>();

    public GuestTransactions(String initRoomType, int initFoodCost, String initName) {
        name = initName;
        guests.add(name);
        roomType = initRoomType;
        foodCost = initFoodCost;
        if (roomType.equalsIgnoreCase("suite")) {
            roomCost = 750;
            roomNum = 400 + guests.indexOf(name);
        }
        else if (roomType.equalsIgnoreCase("deluxe")) {
            roomCost = 400;
            roomNum = 300 + guests.indexOf(name);
        }
        else if (roomType.equalsIgnoreCase("double")) {
            roomCost = 250;
            roomNum = 200 + guests.indexOf(name);
        }
        else if (roomType.equalsIgnoreCase("single")) {
            roomCost = 50;
            roomNum = 100 + guests.indexOf(name);
        }
        else {
            roomCost = 0;
            roomNum = 0;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public int getFoodCost() {
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

    public void changeRoom(String roomType) {
        if (roomType.equalsIgnoreCase("suite")) {
            roomCost = 750;
            roomNum = 400 + guests.indexOf(getName());
        }
        else if (roomType.equalsIgnoreCase("deluxe")) {
            roomCost = 400;
            roomNum = 300 + guests.indexOf(getName());
        }
        else if (roomType.equalsIgnoreCase("double")) {
            roomCost = 250;
            roomNum = 200 + guests.indexOf(getName());
        }
        else if (roomType.equalsIgnoreCase("single")) {
            roomCost = 50;
            roomNum = 100 + guests.indexOf(getName());
        }
        else {
            System.out.println("Invalid Room Type");
        }
    }

    public static void main(String[] args) {

        GuestTransactions guest1 = new GuestTransactions("Suite", 250, "Joey");
        System.out.println(guest1.getRoomNumber());
        guest1.changeRoom("Deluxe");
        System.out.println(guest1.getRoomNumber());
        GuestTransactions guest2 = new GuestTransactions("Double", 150, "Jimmy");
        System.out.println(guest2.getRoomNumber());
        guest2.changeRoom("Deluxe");
        System.out.println(guest2.getRoomNumber());

    }

}

