package DesignPattern.CreationalDisignPattern.AbstractFactoryDesignPattern;

public interface Account {
    void openAccount();
}
class HDFCBankAccount implements Account {
    public void openAccount(){
        System.out.println("HDFC Bank Account opened");
    }
}
class ICICIBankAccount implements Account {
    public void openAccount(){
        System.out.println("ICICI Bank Account opened");
    }
}
