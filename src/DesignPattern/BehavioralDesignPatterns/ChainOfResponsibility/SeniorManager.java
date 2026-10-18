package DesignPattern.BehavioralDesignPatterns.ChainOfResponsibility;

public class SeniorManager extends Approver{

    public void approve(int amount){
        if(amount<=100000){
            System.out.println("Request approved by Senior Manager for amount: " + amount);

        }else{
            if(nextApprover!=null){
                //System.out.println("Request forwarded to next approver for amount: " + amount);
                nextApprover.approve(amount);
            }
        }
    }
}
