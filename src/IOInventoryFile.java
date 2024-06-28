import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOInventoryFile {
    public static void saveInventory(List<InventoryItem> inventory, String filename) throws IOException {
        try(BufferedWriter wr = new BufferedWriter(new FileWriter(filename))) {
            for(InventoryItem item : inventory){
                wr.write(item.getItemId() + "," + item.name + "," + item.getCategory() + "," +
                        item.getPrice() + "," + item.isBreakable() + "," + item.isPerishable() + "," + item.getQuantity());
                wr.newLine();
            }
        }
    }

    public List<InventoryItem> loadInventory(String filename) throws IOException {
        List<InventoryItem> inventory = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int itemID = Integer.parseInt(parts[0]);
                String name = parts[1];
                String category = parts[2];
                double price = Double.parseDouble(parts[3]);
                boolean breakable = Boolean.parseBoolean(parts[4]);
                boolean perishable = Boolean.parseBoolean(parts[5]);
                int quantity = Integer.parseInt(parts[6]);
                switch (category) {
                    case "grocery" -> {
                        double weight = Double.parseDouble(parts[7]);
                        inventory.add(new GroceryItem(itemID, quantity, name, category, price, breakable, perishable, weight));
                    }
                    case "electronics" ->
                            inventory.add(new ElectronicsItem(itemID, quantity, name, category, price, breakable, perishable));
                    case "fragile" -> {
                        double weight = Double.parseDouble(parts[7]);
                        inventory.add(new FragileItem(itemID, quantity, name, category, price, breakable, perishable, weight));
                    }
                }

            }
        }
        return inventory;
    }
}
