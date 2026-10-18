package DesignPattern.CreationalDisignPattern.AbstractFactoryDesignPattern;

public interface Loan {
    void getLoan();
}

class HDFCBankLoan implements Loan{
    public void getLoan(){
        System.out.println("HDFC Loan approved");
    }
}

class ICICIBankLoan implements Loan{
    public void getLoan(){
        System.out.println("ICICI Loan approved");
    }
}
