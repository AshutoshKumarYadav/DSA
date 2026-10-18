package DesignPattern.CreationalDisignPattern.AbstractFactoryDesignPattern;

public interface BankFactory {
    Account createAccount();
    Loan createLoan();
}

class HDFCBANKFactory implements BankFactory {
    public Account createAccount(){
        return new HDFCBankAccount();
    }

    public Loan createLoan(){
        return new HDFCBankLoan();
    }
}

class ICICIBANKFactory implements BankFactory{
    public Account createAccount(){
        return new ICICIBankAccount();
    }
    public Loan createLoan(){
        return new ICICIBankLoan();
    }
}
