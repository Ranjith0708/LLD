package DesignPatterns.FactoryDesignPattern.PaymentGateWayFactory;

public class Paytm implements PaymentGateway{
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of rupees "+amount+" received from Paytm.");
    }
}
