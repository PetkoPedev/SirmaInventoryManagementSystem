import java.util.ArrayList;
import java.util.List;

public class Order {
    private String paymentMethod;
    private List<InventoryItem> items = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();

    public Order(String paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void addItem(InventoryItem item, int quantity){
        items.add(item);
        quantities.add(quantity);
    }

    public double calculateTotal(){
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getPrice() * quantities.get(i);
        }

        return total;
    }

    public void placeOrder(){
        for (int i = 0; i < items.size(); i++) {
            InventoryItem item = items.get(i);
            int quantity = quantities.get(i);
            if(item.getQuantity() >= quantity){
                item.setQuantity(item.getQuantity() - quantity);
                System.out.println("Ordered " + quantity + " of " + item.name);
            }
            else{
                System.out.println("Insufficient quantity for " + item.name);
            }
        }

        double total = calculateTotal();
        Payment payment = new Payment(total, this.paymentMethod);
        payment.processPayment();
    }
}
