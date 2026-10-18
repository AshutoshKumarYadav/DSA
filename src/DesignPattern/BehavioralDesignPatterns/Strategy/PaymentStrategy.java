package DesignPattern.BehavioralDesignPatterns.Strategy;

public interface PaymentStrategy {
    void pay();
}
class UPI implements PaymentStrategy{
    public void pay(){
        System.out.println("Paying via UPI");
    }
}

class Cards implements PaymentStrategy{
    public void pay(){
        System.out.println("Paying via Cards");
    }
}
