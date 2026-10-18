package DesignPattern.CreationalDisignPattern.AbstractFactoryDesignPattern;

public class AbstractFactoryDemo {
    public static void main(String[] args){

        BankFactory factory = new HDFCBANKFactory();

        Account account = factory.createAccount();
        account.openAccount();

        Loan loan = factory.createLoan();
        loan.getLoan();


    }
}
