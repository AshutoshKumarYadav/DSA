package DesignPattern.BehavioralDesignPatterns.Strategy;

public class Strategy {
public static void main(String[] args){
    PaymentContext paymentContext = new PaymentContext(new UPI());
    paymentContext.makePayment();
    PaymentContext paymentContext1 = new PaymentContext(new Cards());
    paymentContext1.makePayment();
}
}
