public class InventoryItem extends AbstractItem{
    private int itemId;
    private int quantity;
    public InventoryItem(int itemId, int quantity, String name, String category, double price, boolean isBreakable, boolean perishable) {
        super(name, category, price, isBreakable, perishable);

        this.itemId = itemId;
        this.quantity = quantity;
    }

    public int getItemId(){
        return this.itemId;
    }

    public int setItemId(int itemId){
        return this.itemId = itemId;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public int setQuantity(int quantity){
        return this.quantity = quantity;
    }

    @Override
    public String getItemDetails(){
        return "Id: " + itemId + ", Name: " + name + ", Category: " + category + ", Price: $" + price;
    }

    @Override
    public void getDescription(){
        System.out.println(getItemDetails());
    }
}
