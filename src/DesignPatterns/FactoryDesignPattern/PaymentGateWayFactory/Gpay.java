package DesignPatterns.FactoryDesignPattern.PaymentGateWayFactory;

public class Gpay implements PaymentGateway{
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of rupees "+amount+" has received from Gpay.");
    }
}
