package programs;

public class PaymentTest {

    public static void main(String[] args) {

        Payment p1 = new CreditCard(5000, "CC101", "15-09-2026");
        Payment p2 = new UPI(2000, "UPI102", "15-09-2026");
        Payment p3 = new NetBanking(3000, "NB103", "15-09-2026");

        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}