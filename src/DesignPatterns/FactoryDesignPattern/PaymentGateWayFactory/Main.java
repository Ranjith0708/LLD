package DesignPatterns.FactoryDesignPattern.PaymentGateWayFactory;

public class Main {
    public static void main(String[] args) {
        PaymentGateway payment = PaymentFactory.getInstance("CRED");
        payment.processPayment(100);
    }
}
