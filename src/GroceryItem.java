public class GroceryItem extends InventoryItem{
    private int itemId;
    private int quantity;
    private double weight;

    public GroceryItem(int itemId, int quantity, String name, String category, double price, boolean isBreakable, boolean perishable, double weight) {
        super(itemId, quantity, name, category, price, isBreakable, perishable);
        this.itemId = itemId;
        this.quantity = quantity;
        this.weight = weight;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
