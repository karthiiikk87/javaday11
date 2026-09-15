class NetBanking extends Payment {

    NetBanking(double amount, String transactionId, String paymentDate) {
        super(amount, transactionId, paymentDate);
    }

    void processPayment() {
        System.out.println("Processing Net Banking Payment");
    }
}