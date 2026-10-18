package DesignPattern.CreationalDisignPattern.FactoryMethodPatternDesign;

public interface Payment {
    void pay();
}
class UPIPayment implements Payment{
    public void pay(){
        System.out.println("Payment done using UPI");
    }
}
class CreditCardPayment implements Payment{
    public void pay(){
        System.out.println("Payment done using Credit Card");
    }
}