public abstract class AbstractItem implements Item, Categorizable, Breakable, Perishable, Sellable{
    protected String name;
    protected String category;
    protected double price;
    protected boolean isBreakable;
    protected boolean perishable;

    public AbstractItem(String name, String category, double price, boolean isBreakable, boolean perishable){
        this.name = name;
        this.category = category;
        this.price = price;
        this.isBreakable = isBreakable;
        this.perishable = perishable;
    }

    @Override
    public boolean isBreakable() {
        return false;
    }

    @Override
    public void handleBreakage() {
        if(isBreakable()){
            System.out.println(name + " is fragile.");
        }
        else {
            System.out.println(name + " is not fragile.");
        }
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getCategory() {
        return this.category;
    }

    @Override
    public String getItemDetails() {
        return "Name: " + name + ", Category: " + category + ", Price: $" + price;
    }

    @Override
    public double calculateValue() {
        return price;
    }

    @Override
    public void getDescription() {
        System.out.println(getItemDetails());
    }

    @Override
    public boolean isPerishable() {
        return false;
    }

    @Override
    public void handleExpiration() {
        if(isPerishable()){
            System.out.println(name + " can expire.");
        }
        else {
            System.out.println(name + " has no expiration.");
        }
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
