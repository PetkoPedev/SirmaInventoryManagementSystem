public class Payment {
    private double amount;
    private String method;

    public Payment(double amount, String method) {
        this.amount = amount;
        this.method = method;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void processPayment(){
        System.out.println("Processing " + method + " payment of $" + amount);
    }
}
