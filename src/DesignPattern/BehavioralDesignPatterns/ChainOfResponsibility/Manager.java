package DesignPattern.BehavioralDesignPatterns.ChainOfResponsibility;

public class Manager extends Approver{
  public void approve(int amount){
      if(amount<=10000){
          System.out.println("Manager approved the amount: " + amount);
      }else{
          if(nextApprover!=null){
           nextApprover.approve(amount);
          }
      }
  }
}
