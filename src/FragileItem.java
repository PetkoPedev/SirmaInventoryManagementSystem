public class FragileItem extends InventoryItem{
    private double weight;

    public FragileItem(int itemId, int quantity, String name, String category, double price, boolean isBreakable, boolean perishable, double weight) {
        super(itemId, quantity, name, category, price, isBreakable, perishable);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double setWeight(double weight) {
        return this.weight = weight;
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
