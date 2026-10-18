abstract class Payment {
    public final void process() {
        validate();
        pay();
        sendNotification();
    }

    void validate() {
        System.out.println("Validation");
    }

    abstract void pay();

    void sendNotification() {
        System.out.println("Notification sent");
    }

}

class UPIPayment extends Payment {
    void pay(){
        System.out.println("Payment using UPI");
    }
}

class CardPayment extends Payment {
    void pay(){
        System.out.println("Payment By Card");
    }
}
void main(String[] args){
    Payment payUPI = new UPIPayment();
    Payment payCrad = new CardPayment();
    payUPI.process();
    payCrad.process();
}