ackage comm.netcracker.homework3.ch3.p1_2;

public class CashRegister {
    private double purchase;
    private double payment;
    private final double taxRate;
    private double taxablePurchase;
    private int itemCount;

    public CashRegister(double taxRate) {
        this.taxRate = taxRate / 100;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
        ++itemCount;
    }

    public void recordTaxablePurchase(double amount) {
        purchase += amount;
        taxablePurchase += amount * taxRate;
        ++itemCount;
    }

    public void receivePayment(double amount) {
        payment += amount;
    }

    public double giveChange()
    {
        double change = payment - purchase - taxablePurchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getTotalTax() {
        return taxablePurchase;
    }
}
