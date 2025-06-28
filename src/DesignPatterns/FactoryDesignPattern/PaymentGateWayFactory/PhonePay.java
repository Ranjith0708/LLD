package DesignPatterns.FactoryDesignPattern.PaymentGateWayFactory;

public class PhonePay implements PaymentGateway{
    @Override
    public void processPayment(int amount){
        System.out.println("Payment of rupees "+amount+" received from PhonePay");
    }
}
