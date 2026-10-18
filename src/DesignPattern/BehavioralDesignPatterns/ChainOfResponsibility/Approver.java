package DesignPattern.BehavioralDesignPatterns.ChainOfResponsibility;

abstract class Approver {
    protected Approver nextApprover;
    public void setNextApprover(Approver nextApprover){
        this.nextApprover=nextApprover;
    }
    public abstract void approve(int amount);
}
