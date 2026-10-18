package Solid.OpenClosedPrinciple;

public interface Payment {
    void pay();
}
class UPIPayment implements Payment {
    public void pay(){
        System.out.println("UPI Payment done");
    }
}

class CardPayment implements Payment {
    public void pay(){
        System.out.println("Card Payment done");
    }
}

class PayPalPayment implements Payment{
    public void pay(){
        System.out.println("Paypal payment");
    }
}