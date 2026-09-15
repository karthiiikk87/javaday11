package programs;

abstract class Payment {

    double amount;
    String transactionId;
    String paymentDate;

    Payment(double amount, String transactionId, String paymentDate) {
        this.amount = amount;
        this.transactionId = transactionId;
        this.paymentDate = paymentDate;
    }

    abstract void processPayment();

    void displayDetails() {
        System.out.println("Amount = " + amount);
        System.out.println("Transaction ID = " + transactionId);
        System.out.println("Payment Date = " + paymentDate);
    }
}