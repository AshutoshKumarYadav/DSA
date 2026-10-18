package DesignPattern.CreationalDisignPattern.FactoryMethodPatternDesign;

public class PaymentFactory {
    public static Payment createPayment(String type){
        if(type.equalsIgnoreCase("UPI")){
           return new UPIPayment();
        }

        if(type.equalsIgnoreCase("CARD")){
          return new CreditCardPayment();
        }

        throw new IllegalArgumentException("Invalid payment type");
    }
}
