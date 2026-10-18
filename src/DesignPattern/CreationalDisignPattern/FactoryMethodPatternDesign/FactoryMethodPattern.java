package DesignPattern.CreationalDisignPattern.FactoryMethodPatternDesign;


//Create objects without exposing the exact object creation logic to the client.
public class FactoryMethodPattern {
    public static void main(String[] args){
        Payment payment = PaymentFactory.createPayment("UPI");
        payment.pay();

        Payment payment1 = PaymentFactory.createPayment("CARD");
        payment1.pay();
    }
}
