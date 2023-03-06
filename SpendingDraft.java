import java.util.HashMap;
import java.util.Scanner;
import java.util.Scanner;

public class PlayerOptions {
    
    public static void main(String[] args) {
        
        // define the player options and their net worths
        String[] options = {"1) Tom Brady", "2) George Clooney", "3) Ralph Lauren"};
        int[] netWorths = {100,000,000, 500,000,000, 10,000,000,000};
        
        // print the options to the player
        System.out.println("Choose one of the following player options 1,2,or 3:");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        
        // get the player's choice
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        // validate the player's choice
        if (choice < 1 || choice > options.length) {
            System.out.println("Invalid choice. Please try again.");
            return;
        }
        
        // print the player's choice and net worth
        String chosenOption = options[choice - 1];
        int chosenNetWorth = netWorths[choice - 1];
        System.out.println("You have chosen " + chosenOption + " with a net worth of " + chosenNetWorth + ".");
    }
}

public class Category {
    
    public static void main(String[] args) {
        ArrayList<Integer> recipt;
        
        // define the items for each subcategory
        HashMap<String, Integer> boats = new HashMap<>();
        boats.put("Fishing Boat", 10000);
        boats.put("Yacht", 185000000);
        boats.put("Cruise Ship", 1300000000);
        
        HashMap<String, Integer> planes = new HashMap<>();
        planes.put("Cessna", 75000);
        planes.put("G700", 75000000);
        planes.put("BBJ", 250000000);
        
        HashMap<String, Integer> cars = new HashMap<>();
        cars.put("Toyota Prius", 25000);
        cars.put("Lambo Urus", 225000);
        cars.put("Buggati Mistral", 5000000);
        cars.put("Ferrari 250 GTO", 38000000);
        
        // print the subcategories to the player
        System.out.println("Choose a subcategory:");
        System.out.println("1. Boats");
        System.out.println("2. Planes");
        System.out.println("3. Cars");
        
        // get the player's choice of subcategory
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int subcategoryChoice = scanner.nextInt();
        
        // validate the player's choice of subcategory
        if (subcategoryChoice < 1 || subcategoryChoice > 3) {
            System.out.println("Invalid subcategory choice. Please try again.");
            return;
        }
        
        // print the items for the chosen subcategory
        String chosenSubcategory = "";
        HashMap<String, Integer> chosenItems = new HashMap<>();
        switch (subcategoryChoice) {
            case 1:
                chosenSubcategory = "Boats";
                chosenItems = boats;
                break;
            case 2:
                chosenSubcategory = "Planes";
                chosenItems = planes;
                break;
            case 3:
                chosenSubcategory = "Cars";
                chosenItems = cars;
                break;
        }
        System.out.println("Choose an item from " + chosenSubcategory + ":");
        for (String item : chosenItems.keySet()) {
            System.out.println("- " + item + " ($" + chosenItems.get(item) + ")");
        }
        
        // get the player's choice of item
        System.out.print("Enter your choice: ");
        String itemChoice = scanner.next();
        ///this.recipt.add(itemChoice);
        
        // validate the player's choice of item
        if (!chosenItems.containsKey(itemChoice)) {
            System.out.println("Invalid item choice. Please try again.");
            return;
        }
        
        // print the player's purchase information
        int itemPrice = chosenItems.get(itemChoice);
        System.out.println("You have purchased a " + itemChoice + " for $" + itemPrice + ".");
        
    }
}





