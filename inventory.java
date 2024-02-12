public class Inventory {
    
    // Instance Variables

    private int lifeBoats;
    private int safetySupplies;
    private int food;

    // Constructor

    public Inventory(int initLifeBoats, int initFood, int initSafetySupplies) {
        lifeBoats = initLifeBoats;
        food = initFood;
        safetySupplies = initSafetySupplies;
    }

    // Get, Set, or Extra Methods

    public int getFood() {
        return food;
    }

    public int getLifeBoats() {
        return lifeBoats;
    }
    
    public int getSafetySupplies() {
        return safetySupplies;
    }

    public void addFood(int foodAdded) {
        food += foodAdded;
    }

    public void addLifeBoats(int lifeBoatsAdded) {
        lifeBoats += lifeBoatsAdded;
    }

    public void addSafetySupplies(int safetySuppliesAdded) {
        safetySupplies += safetySuppliesAdded;
    }

    public boolean enoughLifeBoats() {
        if (lifeBoats >= 12) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean enoughFood() {
        if (food >= 900) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean enoughSafetySupplies() {
        if (safetySupplies >= 300) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isBoatSafeToLeave(Inventory currentInventory) {
        if (currentInventory.enoughLifeBoats() == true && currentInventory.enoughFood() == true && currentInventory.enoughSafetySupplies() == true) {
            return true;
        }
        else {
            return false;
        }
    }

    // toString Method

    public String toString() {
        return "Current Lifeboats: " + lifeBoats + "\t\tNeeded Lifeboats: 12 or More" + "\nCurrent Safety Supplies: " + safetySupplies + "\tNeeded Safety Supplies: 300 or More" + "\nCurrent Food: " + food + "\t\tNeeded Food: 900 or More" + "\nReady to Leave?: " + isBoatSafeToLeave(this) + "\n";
    }

}
