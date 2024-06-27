public class ElectronicsItem extends InventoryItem{
    private int itemId;
    private int quantity;

    public ElectronicsItem(int itemId, int quantity, String name, String category, double price, boolean isBreakable, boolean perishable) {
        super(itemId, quantity, name, category, price, isBreakable, perishable);
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
    public void getDescription() {
        super.getDescription();
    }

    @Override
    public String getItemDetails() {
        return super.getItemDetails();
    }
}
