package DesignPattern.BehavioralDesignPatterns.Strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;
    PaymentContext(PaymentStrategy paymentStrategy){
    this.paymentStrategy = paymentStrategy;
    }
    void makePayment(){
        paymentStrategy.pay();
    }
}
