package DesignPatterns.FactoryDesignPattern.PaymentGateWayFactory;

public class PaymentFactory {
    public static PaymentGateway getInstance(String appName){
        Apps app = Apps.valueOf(appName);
        switch(app){
            case CRED -> {
                return new Cred();
            }
            case GPAY -> {
                return new Gpay();
            }
            case PAYTM -> {
                return new Paytm();
            }
            case PHONEPAY -> {
                return new PhonePay();
            }
            default -> {
                return null;
            }
        }
    }
}
