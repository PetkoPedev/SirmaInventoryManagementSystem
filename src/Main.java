import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<InventoryItem> inventoryItems = new ArrayList<>();

        run(inventoryItems);
    }

    private static void run(List<InventoryItem> inventoryItems) {
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);

        while (isRunning){
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1 -> addItem(sc, inventoryItems);
                case 2 -> removeItem(sc, inventoryItems);
                case 3 -> getAllItems(sc, inventoryItems);
                case 4 -> changeCategory(sc, inventoryItems);
                case 5 -> orderItem(sc, inventoryItems);
                case 6 -> saveToFile(sc, inventoryItems);
                case 7 -> loadFromFile(sc, inventoryItems);
                case 8 -> isRunning = false;
            }
        }

        sc.close();
    }

    private static void addItem(Scanner sc, List<InventoryItem> inventoryItems) {
        double weight = 0;
        try {
            System.out.print("Enter item ID: ");
            int itemID = Integer.parseInt(sc.nextLine());
            System.out.print("Enter item name: ");
            String name = sc.nextLine();
            System.out.print("Enter item category: ");
            String category = sc.nextLine();
            switch (category){
                case "grocery", "fragile" -> {
                    System.out.print("Enter weight of the product: ");
                    weight = Double.parseDouble(sc.nextLine());
                }
            }
            System.out.print("Enter item price: ");
            double price = Double.parseDouble(sc.nextLine());
            System.out.print("Is the item breakable (true/false): ");
            boolean breakable = Boolean.parseBoolean(sc.nextLine());
            System.out.print("Is the item perishable (true/false): ");
            boolean perishable = Boolean.parseBoolean(sc.nextLine());
            System.out.print("Enter item quantity: ");
            int quantity = Integer.parseInt(sc.nextLine());

            switch (category) {
                case "grocery" -> inventoryItems.add(new GroceryItem(itemID, quantity, name, category, price, breakable, perishable, weight));
                case "electronics" ->
                        inventoryItems.add(new ElectronicsItem(itemID, quantity, name, category, price, breakable, perishable));
                case "fragile" -> inventoryItems.add(new FragileItem(itemID, quantity, name, category, price, breakable, perishable, weight));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please try again.");
        }
    }

    private static void removeItem(Scanner sc, List<InventoryItem> inventoryItems) {

    }

    private static void getAllItems(Scanner sc, List<InventoryItem> inventoryItems) {

    }

    private static void changeCategory(Scanner sc, List<InventoryItem> inventoryItems) {

    }

    private static void orderItem(Scanner sc, List<InventoryItem> inventoryItems) {

    }

    private static void saveToFile(Scanner sc, List<InventoryItem> inventoryItems) {

    }

    private static void loadFromFile(Scanner sc,List<InventoryItem> inventoryItems) {

    }

    private static void menu() {
        System.out.println("1. Add New Item");
        System.out.println("2. Remove Item by Id");
        System.out.println("3. Display All Items");
        System.out.println("4. Change Category Of An Item");
        System.out.println("5. Place Order");
        System.out.println("6. Save to File");
        System.out.println("7. Load from File");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }
}