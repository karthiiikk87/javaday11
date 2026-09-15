class CreditCard extends Payment {

    CreditCard(double amount, String transactionId, String paymentDate) {
        super(amount, transactionId, paymentDate);
    }

    void processPayment() {
        System.out.println("Processing Credit Card Payment");
    }
}