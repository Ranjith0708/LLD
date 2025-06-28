package DesignPatterns.FactoryDesignPattern.PaymentGateWayFactory;

public class Cred implements PaymentGateway{
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of rupees "+amount+" has received from Cred.");
    }
}
