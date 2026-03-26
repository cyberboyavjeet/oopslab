interface Payable {
    void processPayment(double amount);
    String getPaymentMethod();

    // Default method (Java 8+)
    default void printReceipt(double amount) {
        System.out.println("Paid ₹" + amount + " via " + getPaymentMethod());
    }
}

class UPIPayment implements Payable {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }

    @Override
    public String getPaymentMethod() { return "UPI"; }
}

class CreditCard implements Payable {
    @Override
    public void processPayment(double amount) {
        System.out.println("Charging credit card ₹" + amount);
    }

    @Override
    public String getPaymentMethod() { return "Credit Card"; }
}

public class Interface_{
    public static void main(String[] args) {
        
    
Payable p = new UPIPayment();
p.processPayment(500);
p.printReceipt(500);  // Uses default method {
    
}}
