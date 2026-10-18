package DesignPattern.BehavioralDesignPatterns.ChainOfResponsibility;

public class Director extends Approver{
    public void approve(int amount){
        if(amount<=500000){
            System.out.println("Director approved the amount: "+amount);

        }else{
            System.out.println("Amount can't be approved "+amount);
        }
    }
}
