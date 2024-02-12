public class Main {
    
    public static void main (String[] args) {

        // Testing GuestTransactions Methods
        System.out.println("\nTesting GuestTransations Method:\n");
        
        GuestTransactions guest1 = new GuestTransactions("Suite", "Joey", 3);
        GuestTransactions guest2 = new GuestTransactions("Double", "Jimmy", 5);
    
        System.out.println("Room Type of Guest 1: " + guest1.getRoomType());
        System.out.println("Default Food Cost of Guest 2: " + guest2.getFoodCost());
        guest2.setFoodCost("Roast Turkey");
        guest2.setFoodCost("Pudding");
        System.out.println("New Food Cost of Guest 2: " + guest2.getFoodCost());
        System.out.println("Name of Guest 1: " + guest1.getName());
        System.out.println("Previous Room Cost of Guest 2: " + guest2.getRoomCost());
        guest2.changeRoom("Single");
        System.out.println("New Room Cost of Guest 2: " + guest2.getRoomCost());
        System.out.println("Room Number of Guest 1: " + guest1.getRoomNumber());
        System.out.println("Price of Mutton: " + guest1.getPrice("Mutton"));
        System.out.println("Dues of Guest 1: " + guest1.calculateDues());

        System.out.println("toString of Guest 1: \n" + guest1);
        System.out.println("toString of Guest 2: \n" + guest2);

        System.out.println("");

        // Testing Inventory Methods

        System.out.println("Testing Inventory Methods: \n");
        Inventory inventory1 = new Inventory(10, 400, 250);

        System.out.println("Food: " + inventory1.getFood());
        System.out.println("Life Boats: " + inventory1.getLifeBoats());
        System.out.println("Safety Supplies: " + inventory1.getSafetySupplies());

        System.out.println("");

        System.out.println("toString (Before): \n" + inventory1);
        inventory1.addLifeBoats(3);
        inventory1.addFood(900);
        inventory1.addSafetySupplies(100);
        System.out.println("toString (After): \n" + inventory1);

        System.out.println("");

        // Testing Crew Methods

        System.out.println("Testing Crew Methods:\n");
        Crew a = new Crew(3, 5, 10, 15, 20);

        System.out.println("Captains: " + a.getCaptains());   // Algorithm 1: "Determines the number of elements meeting specific criteria" --- each of the get methods uses the algorithm to find the specific number of each type of crew member
        System.out.println("Catering Crew Members: " + a.getCateringCrew());
        System.out.println("Deck Crew Members: " + a.getDeckCrew());
        System.out.println("Engineering Crew Members: " + a.getEngineeringCrew());
        System.out.println("Medical Crew Members: " + a.getMedicalCrew());
                                                             // End of the use of Algorithm 1
        System.out.println("\nList of Each Individual Crew Member: ");
        a.printCrew();
        System.out.println("");
        System.out.println("toString (Before): \n" + a);
        a.removeExtraCaptains();                             // Algorithm 2: "Determine the presence of a duplicate" AND "Delete elements"
        System.out.println("\ntoString (After): \n" + a);

    }

}
