package seminar4;

public interface PaymentGateway {
    void processPayment(double amount);

    boolean charge(double amount);
}
