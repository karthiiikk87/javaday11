class UPI extends Payment {

    UPI(double amount, String transactionId, String paymentDate) {
        super(amount, transactionId, paymentDate);
    }

    void processPayment() {
        System.out.println("Processing UPI Payment");
    }
}